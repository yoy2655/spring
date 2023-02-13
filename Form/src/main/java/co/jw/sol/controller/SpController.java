package co.jw.sol.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;


@Controller
public class SpController {
	@GetMapping("/t1")
	public String t1(SpringBean b) {
		b.setName("hong");
		b.setId("hong1234");
		b.setPw("1234");
		b.setAdr("Seoul");
		
		return "t1";
	}
	@GetMapping("/t2")
	public String t2(SpringBean b) {
		//set메소드로 넣어주고 있다.
		//t2.jsp로 이동할 것이다.
		b.setName("hong2");
		b.setId("hong1234");
		b.setPw("1234");
		b.setAdr("Seoul");
		
		return "t2";
	}
	@GetMapping("/t3")
	public String t3(@ModelAttribute ("tt") SpringBean b) {
		//프로퍼티에 넣겠다고 이름(tt)을 지정하겠다.
		b.setName("hong3");
		b.setId("hong1234");
		b.setPw("1234");
		b.setAdr("Seoul");
		
		return "t3";	//t3.jsp로 이동하겠다.
	}
	@GetMapping("/t4")
	public String t4(Model m) {
		SpringBean b=new SpringBean();
		b.setName("hong3");
		b.setId("hong1234");
		b.setPw("1234");
		b.setAdr("Seoul");
		
		m.addAttribute("springbean", b);
		
		return "t4";
	}
}

