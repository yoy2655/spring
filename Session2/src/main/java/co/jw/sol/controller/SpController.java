package co.jw.sol.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;
import co.jw.sol.bean.SpringBean3;
import co.jw.sol.bean.SpringBean4;

@Controller
public class SpController {

	@Autowired
	SpringBean sb1;

	@Resource(name = "sbean2")
	SpringBean2 sb2;

	@Autowired
	SpringBean3 sb3;
	
	@Resource(name="sbean4")
	SpringBean4 sb4;

	@GetMapping("/t1")
	public String t1() {
		sb1.setS1("d1");
		sb1.setS2("d2");
		
		sb2.setS3("d3");
		
		sb3.setS4("d4");
		
		sb4.setS5("d5");

		return "t1";
	}

	@GetMapping("/s1")
	public String s1(Model mo) {
		System.out.println(sb1.getS1());
		System.out.println(sb1.getS2());

		System.out.println(sb2.getS3());
		System.out.println(sb3.getS4());
		System.out.println(sb4.getS5());

		mo.addAttribute("sb1", sb1);

		mo.addAttribute("sb2", sb2);

		mo.addAttribute("sb3", sb3);
		
		mo.addAttribute("sb4", sb4);
		return "s1";
	}
	// @SessionScope : 브라우저가 서버에 최초요청을 보낼때 bean객체가 준비된다
	// 빈은 주입만 되어지는 것이고 세션영역에 저장되지는 않는다.

}
