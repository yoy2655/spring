package co.jw.sol.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;

@Controller
public class SpController {
	// 2.

	@GetMapping("/t1")
	public String t1(SpringBean b, Model m) {
		b.setS1("d2");
		//t1.jsp의 path=s1이고 여기에서 s1에 setter메소드로 "d2"를 주었다. 
		//t1.jsp에서 d2는 two값을 가지고 있다.
		b.setS2("d2");
		//t1.jsp의 path=s2이고 여기에서 s2에 setter메소드로 "d2"를 주었다. 
		//t1.jsp에서 배열 li1을 받아서 select에서 d2를 selected하고 있다. 
		b.setS3("d2");
		b.setS4("d2");

		String[] str = { "d1", "d3" };	//배열
		b.setS5(str);
		b.setS6(str);
		b.setS7(str);
		b.setS8(str);
		
		b.setS9("d2");
		b.setS10("d2");
		b.setS11("d2");
		b.setS12("d2");
		
		
		String str2[] = {"d1", "d2", "d3"};
		m.addAttribute("li1", str2);
		
		ArrayList<String> li2=new ArrayList<String>();	//리스트
		li2.add("d1");
		li2.add("d2");
		li2.add("d3");
		m.addAttribute("li2", li2);
		
		
		SpringBean2 b1=new SpringBean2();
		SpringBean2 b2=new SpringBean2();
		SpringBean2 b3=new SpringBean2();
		
		b1.setA1("one");
		b1.setA2("d1");
		
		b2.setA1("two");
		b2.setA2("d2");
		
		b3.setA1("three");
		b3.setA2("d3");
		
		ArrayList<SpringBean2> li3=new ArrayList<SpringBean2>();
		li3.add(b1);
		li3.add(b2);
		li3.add(b3);

		m.addAttribute("li3",li3);
		
		return "t1";
	}
}
