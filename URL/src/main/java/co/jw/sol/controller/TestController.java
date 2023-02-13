package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value = "/t1", method = RequestMethod.GET)
	public String t1() {
		return "t1";
	}
	@RequestMapping(value = "/t2", method = RequestMethod.GET)
	public String t2() {
		return "t2";
	}
}
