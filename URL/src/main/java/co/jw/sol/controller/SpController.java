package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpController {

	@RequestMapping(value="/sp1/t3",method=RequestMethod.GET)
	public String s1() {
		return "sp1/t3";
	}
	
	@RequestMapping(value="/sp1/t4",method=RequestMethod.GET)
	public String s2() {
		return "sp1/t4";
	}
}
