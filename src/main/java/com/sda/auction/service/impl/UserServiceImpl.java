package com.sda.auction.service.impl;

import com.sda.auction.dto.UserForm;
import com.sda.auction.mapper.UserMapper;
import com.sda.auction.model.User;
import com.sda.auction.repository.UserRepository;
import com.sda.auction.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private UserMapper userMapper;

	@Autowired
	public UserServiceImpl(UserRepository userRepository,
			UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}


	@Override
	public void saveUser(UserForm userForm) {
		User user = userMapper.map(userForm);

		userRepository.save(user);
	}


}
