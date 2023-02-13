package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sp2")
public class Sp2Controller {

	@RequestMapping(value = "/t5", method = RequestMethod.GET)
	public String t5() {
		return "sp2/t5";
	}

	@RequestMapping(value = "/t6", method = RequestMethod.GET)
	public String t6() {
		return "sp2/t6";
	}
}
