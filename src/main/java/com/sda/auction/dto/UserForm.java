package com.sda.auction.dto;

import com.sda.auction.validator.ConfirmPasswordConstraint;
import javax.validation.constraints.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Data
@ToString
@ConfirmPasswordConstraint(message = "Confirm password doesn't match!")
public class UserForm {

	@NotEmpty(message = "First name should not be empty")
	private String firstName;

	@NotEmpty(message = "Last name should not be empty")
	private String lastName;

	@Email(message = "Must be a valid email")
	@NotEmpty(message = "Email should not be empty")
	private String email;

	@Length(min = 4, message = "Password too short")
	private String password;
	private String confirmPassword;
}
