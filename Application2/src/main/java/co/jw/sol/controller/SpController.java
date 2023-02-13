package co.jw.sol.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;
import co.jw.sol.bean.SpringBean3;
import co.jw.sol.bean.SpringBean4;

@Controller
public class SpController {
	@Autowired
	SpringBean app1;

	@Resource(name = "app2")
	SpringBean2 app2;

	@Autowired
	SpringBean3 app3;

	@Resource(name = "sbean4")
	SpringBean4 app4;

	@GetMapping("/t1")
	public String t1() {
		app1.setS1("d1");
		app2.setS3("d3");
		app3.setS4("d4");
		app4.setS5("d5");

		return "t1";
	}

	@GetMapping("/s1")
	public String s1(Model mo) {
		mo.addAttribute("app1", app1);
		mo.addAttribute("app2", app2);
		mo.addAttribute("app3", app3);
		mo.addAttribute("app4", app4);

		return "s1";

	}
}
