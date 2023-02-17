package co.jw.sol.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import co.jw.sol.beans.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;

		String str = errors.getObjectName(); // joinBean
		// 원래는 클래스 객체가 뜨지만 getObjectName()으로 이렇게 하면 클래스 객체명이 뜬다

		if (str.equals("joinBean") || str.equals("modifyBean")) {
			if (user.getUser_pw().equals(user.getUser_pw2()) == false) {
				errors.rejectValue("user_pw", "NotEquals");
				errors.rejectValue("user_pw2", "NotEquals");
			}
		}
		if (str.equals("joinBean")) {
			if (user.isIdExist() == false) {
				errors.rejectValue("user_id", "CheckIdExist");
			}
		}
	}
}