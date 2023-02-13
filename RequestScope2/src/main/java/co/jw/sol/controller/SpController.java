package co.jw.sol.controller;

import javax.annotation.Resource;

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
	// request scope으로 정의하면 요청이 발생할때마다 bean객체가 생성되어 자동으로 주입된다
	// 주입된 bean은 요청발생할때 주입만 이루어지고 request영역에 저장되지는 않는다.

	@Autowired
	SpringBean sbean1;// 자동주입으로 sbena1에 빈등록을 함
	//SpringBean sbean1=new SpringBean()과 같다.(같아서 대신함->결합도를 약하게 만든다.)
	
	//@Resource는 이름기준으로 주입이 된다. (RootAppContext.java에서 지정한 이름과 일치한 빈에 주입된다.)
	@Resource(name="sbean2")	
	SpringBean2 sbean2;
	
	@Autowired
	SpringBean3 sbean3;
	
	@Resource(name="sbean4")
	SpringBean4 sbean4;
	
	@GetMapping("/t1") // t1경로에서 값을 저장하고 s1으로 이동
	public String t1() {

		sbean1.setS1("spring");
		sbean1.setS2("spring2");

		sbean2.setS3("spring3");
		sbean2.setS4("spring4");
		
		sbean3.setS5("spring5");
		sbean3.setS6("spring6");
		
		sbean4.setS7("spring7");
		sbean4.setS8("spring8");
		
		return "forward:/s1";
	}

	@GetMapping("/s1") // 따라서, s1도 경로 매핑 해준다.
	public String s1(Model mo) {	//Model은 request영역의 값을 저장하는 역할을 함
		System.out.println(sbean1.getS1());
		System.out.println(sbean1.getS2());

		mo.addAttribute("sbean1", sbean1);
		mo.addAttribute("sbean2", sbean2);
		mo.addAttribute("sbean3", sbean3);
		mo.addAttribute("sbean4", sbean4);
		
		return "s1";
	}
}
