package co.jw.sol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.service.SpService;


@Controller
public class SpController {
	@Autowired
	private SpService service;
	
	@GetMapping("/t1")
	public String t1(Model m) {
		String str=service.sp();
		
		m.addAttribute("str", str);
		
		return "t1";	//"spring"이라는 문자열을 가지고 "t1.jsp"로 이동
	}
}


//dao->service->controller순서로 작성