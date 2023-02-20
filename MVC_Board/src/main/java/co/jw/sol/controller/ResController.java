package co.jw.sol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.jw.sol.service.UserService;

@RestController
public class ResController {
	// Json형태(문자열)로 객체 데이터를 반환하는 것(ajax->동적변경,비동기방식)
	// 데이터를 제공하는 REST API 개발할 때 사용
	// ajax-> https://developer.mozilla.org/ko/docs/Web/Guide/AJAX/Getting_Started
	// ajax-> http://www.tcpschool.com/ajax/ajax_intro_basic
 
	@Autowired
	private UserService userService;

	@GetMapping("/user/checkIdExist/{user_id}")
	public String checkIdExist(@PathVariable String user_id) {
		boolean b = userService.checkIdExist(user_id);//id중복확인
		return b + "";
	}

}
