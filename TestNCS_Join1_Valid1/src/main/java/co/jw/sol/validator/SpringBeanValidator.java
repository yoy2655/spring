package co.jw.sol.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import co.jw.sol.bean.SpringBean;

public class SpringBeanValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return SpringBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		SpringBean bean = (SpringBean) target;
		String phone = bean.getPhone();

		if (phone.contains("-") == false) {
			errors.rejectValue("phone", "error1");
		}
	}
}
