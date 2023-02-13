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
	//Validator 커스터마이징
	//=>validator 인터페이스를 구현해야함
	//supports:유효성 검사할 데이터를 가지고 있는 객체가
	//		   유효성 검사가 가능한지 확인하는 메소드
	//validate:유효성 검사를 하는 메소드
	
	@GetMapping("/t1")
	public String t1(SpringBean sbean) {
		return "t1";
	}
	
	@PostMapping("/check")
	public String check(@Valid SpringBean sbean, BindingResult result) {
	//오류에 대한 메시지를 BindingResult 에서 받는다.
	if(result.hasErrors()) {
		return "t1";
	}
	return "t2";
	}	
	
	//validator를 컨트롤러에 등록해야함
	//사용할 validator가 하나면 setValidator, 한개 이상이면 addValidators메소드를 사용해야함
	
	@InitBinder	//validator를 등록을 할 때 함수 없에 적어줘야되는 어노테이션
	public void initBinder(WebDataBinder binder) {
		SpringBeanValidator sb=new SpringBeanValidator();
		binder.addValidators(sb);//지금 객체가 하나밖에 없어서 set...써도 되고 add...써도 된다
	}
}
