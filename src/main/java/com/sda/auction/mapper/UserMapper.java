package com.sda.auction.mapper;

import com.sda.auction.dto.UserForm;
import com.sda.auction.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

	public User map(UserForm userForm) {
		User user = new User();
		user.setEmail(userForm.getEmail());
		user.setFirstName(userForm.getFirstName());
		user.setLastName(userForm.getLastName());
		user.setPassword(userForm.getPassword());
		return user;
	}

	public UserForm map(User user){
		UserForm userForm = new UserForm();
		userForm.setEmail(user.getEmail());
		//...
		return userForm;
	}
}
