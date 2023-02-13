package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TesetController {
	@RequestMapping(value = "/t1", method = RequestMethod.GET)
	public String t1() {
		return "t1";
	}

	@RequestMapping(value = "/t2", method = RequestMethod.POST)
	public String t2() {
		return "t2";
	}

	@RequestMapping(value = "/t3", method = RequestMethod.GET)
	public String t3() {
		return "t3";
	}

	@RequestMapping(value = "/t3", method = RequestMethod.POST)
	public String t3_2() {
		return "t4";
	}

	@GetMapping("/t4")
	public String t4() {
		return "t4";
	}

	@GetMapping("/t5")
	public String t5_2() {
		return "t5";
	}

	@PostMapping("/t5")
	public String t5() {
		return "t5";
	}

	@RequestMapping(value = "/t6", method = { RequestMethod.GET, RequestMethod.POST })
	public String t6() {
		return "t6";
	}

}