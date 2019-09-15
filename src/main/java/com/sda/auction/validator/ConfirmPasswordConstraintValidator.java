package com.sda.auction.validator;

import com.sda.auction.dto.UserForm;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConfirmPasswordConstraintValidator
		implements
		ConstraintValidator<ConfirmPasswordConstraint, Object> {

	@Override
	public void initialize(ConfirmPasswordConstraint constraintAnnotation) {

	}

	@Override
	public boolean isValid(Object candidate, ConstraintValidatorContext constraintValidatorContext) {
		UserForm user = (UserForm) candidate;
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			constraintValidatorContext.disableDefaultConstraintViolation();
			constraintValidatorContext.buildConstraintViolationWithTemplate(
					constraintValidatorContext.getDefaultConstraintMessageTemplate())
					.addNode("confirmPassword")
					.addConstraintViolation();
			return false;
		}
		return true;

	}
}
