package com.sda.auction.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserForm {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
}
