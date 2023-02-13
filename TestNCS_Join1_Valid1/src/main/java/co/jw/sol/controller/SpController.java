package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.validator.SpringBeanValidator;

@Controller
public class SpController {
	
	
	@PostMapping("/check")
	public String check(@Valid SpringBean sbean, BindingResult result) {
	//오류에 대한 메시지를 BindingResult 에서 받는다.
	if(result.hasErrors()) {
		return "index";
	}
	return "t2";
	}	
	
	@InitBinder	//validator를 등록을 할 때 함수 없에 적어줘야되는 어노테이션
	public void initBinder(WebDataBinder binder) {
		SpringBeanValidator sb=new SpringBeanValidator();
		binder.addValidators(sb);//지금 객체가 하나밖에 없어서 set...써도 되고 add...써도 된다
	}
}
