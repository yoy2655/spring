package co.jw.sol.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;


@Controller
public class SpController {
	//2. 
	@GetMapping("/t1")
	public String t1(SpringBean b) {
		b.setS1("hong1");
		b.setS2("hong2");
		b.setS3("1234");
		b.setS4("hong4");
		
		
		return "t1";
	}
	
}

