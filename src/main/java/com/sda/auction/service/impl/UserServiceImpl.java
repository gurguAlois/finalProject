package com.sda.auction.service.impl;

import com.sda.auction.dto.UserForm;
import com.sda.auction.mapper.UserMapper;
import com.sda.auction.model.Role;
import com.sda.auction.model.User;
import com.sda.auction.repository.RoleRepository;
import com.sda.auction.repository.UserRepository;
import com.sda.auction.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private UserMapper userMapper;
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	public UserServiceImpl(UserRepository userRepository,
			UserMapper userMapper, BCryptPasswordEncoder passwordEncoder,
			RoleRepository roleRepository) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
		this.passwordEncoder = passwordEncoder;
		this.roleRepository = roleRepository;
	}


	@Override
	public void saveUser(UserForm userForm) {
		User user = userMapper.map(userForm);
		encodePassword(userForm, user);
		assignUserRoles(user);
		makeUserActive(user);
		userRepository.save(user);
	}

	private void makeUserActive(User user) {
		user.setActive(1);
	}

	private void assignUserRoles(User user) {
		Role adminRole = roleRepository.findByRole("ADMIN");
		Role userRole = roleRepository.findByRole("USER");
		user.addRole(adminRole);
		user.addRole(userRole);

	}

	private void encodePassword(UserForm userForm, User user) {
		String encodedPassword = passwordEncoder.encode(userForm.getPassword());
		user.setPassword(encodedPassword);
	}

	@Override
	public User findByEmail(String email) {
		System.out.println("find by email");

		return userRepository.findByEmail(email);
	}


}
