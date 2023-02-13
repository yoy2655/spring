package co.jw.sol.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co.jw.sol.bean.SpringBean;

public class SpringBeanValidator implements Validator {
//d2, d3에 대한 유효성 검사를 할것이다.
//유효성 검사를 위한 JSR-303 어노테이션을 안썼기 때문에 개발자가 직접 등록을 할 것이다.
	@Override
	public boolean supports(Class<?> clazz) {
		return SpringBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
								  // (error객체, 프로퍼티명, 코드이름)
		ValidationUtils.rejectIfEmpty(errors, "d2", "error2"); 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "d3", "error3");
		// 유효성검사를 해서 문제가 있다면 errors객체에 저장을 해서 확인을 하겠다.
		//=>d2,d3에 값이 비어있거나 whitespace가 들어가 있다면

		SpringBean bean = (SpringBean) target;
		String d2=bean.getD2();
		String d3=bean.getD3();
		
		if(d2.contains("-")==false) {
			errors.rejectValue("d2", "error4");
			//유효성 조건을 직접 만들어 사용 -> if문으로 유효성 검사를 한 후 rejectValue를 통해
			//오류 정보를 지정한다("프로퍼티명", "코드명");
		}
		if(d3.length()>10) {
			errors.rejectValue("d3", "error5");
		}
	}
}
