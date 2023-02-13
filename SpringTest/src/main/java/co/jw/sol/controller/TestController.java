package co.jw.sol.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.jw.sol.bean.SpringBean;


@Controller
public class TestController {
	
	@GetMapping("/main")
	public ModelAndView t4(ModelAndView mo) {
		// model에 값 저장과 view이름을 지정하는 기능 다 가짐
		mo.addObject("msg1", "main1");// model에 값 저장
		mo.addObject("msg2", "main2");// model에 값 저장

		mo.setViewName("main1");// view이름을 지정
		return mo;
	}
	
	@GetMapping("/t1")
	public String t1(HttpServletRequest request, @RequestParam String d1, @RequestParam String d2) {
		// model에 값 저장과 view이름을 지정하는 기능 다 가짐
		request.setAttribute("d1", d1);
		request.setAttribute("d2", d2);
		return "t1";
	}
	
	@GetMapping("/t2")
	public String t2(HttpServletRequest request, @RequestParam Map<String, String> map) {
		String d1 = map.get("d1");
		String d2 = map.get("d2");
		
		request.setAttribute("d1", d1);//id
		request.setAttribute("d2", d2);//pw

		return "t1";
	}
	
	@GetMapping("/t3")
	public String t3(@ModelAttribute SpringBean b1) {
		System.out.println(b1.getId());
		System.out.println(b1.getPw());
		
		return "t2";
	}
}
