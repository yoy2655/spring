package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/t1")
	public String t1(HttpServletRequest request) {
		String d1 = request.getParameter("d1");
		String d2 = request.getParameter("d2");
		String d3[] = request.getParameterValues("d3");

		System.out.println(d1);
		System.out.println(d2);
		for (String str : d3) {
			System.out.println(str);
		}

		return "t1";
	}

	@PostMapping("/t2")
	public String t2(HttpServletRequest request) {
		String d1 = request.getParameter("d1");
		String d2 = request.getParameter("d2");
		String d3[] = request.getParameterValues("d3");

		System.out.println(d1);
		System.out.println(d2);
		for (String str : d3) {
			System.out.println(str);
		}

		return "t2";
	}

	@GetMapping("/t3")
	public String t3(@RequestParam int d1, @RequestParam int d2, @RequestParam int d3[]) {

		System.out.println(d1);
		System.out.println(d2);
		for (int str : d3) {
			System.out.println(str);
		}

		return "t3";
	}

	@GetMapping("/t4")
	public String t4(@RequestParam(value = "d1") int a1, @RequestParam(value = "d2") int a2,
			@RequestParam(value = "d3") int a3[]) {

		System.out.println(a1);
		System.out.println(a2);
		for (int str : a3) {
			System.out.println(str);
		}

		return "t4";
	}

	@GetMapping("/t5")
	public String t5(@RequestParam int d1, @RequestParam(required = false) String d2,
			@RequestParam(defaultValue = "0") int d3) {
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		return "t5";
	}

	@GetMapping("/t6/{d1}/{d2}/{d3}")
	public String t6(@PathVariable int d1, @PathVariable int d2, @PathVariable int d3) {
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		return "t6";
	}
}
