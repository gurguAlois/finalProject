package com.sda.auction.service;

import com.sda.auction.dto.UserForm;
import java.util.Optional;

public interface UserService {

	void saveUser(UserForm userForm);

	Optional<UserForm> update(UserForm employee);
}
