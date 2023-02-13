package co.jw.sol.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.jw.sol.bean.SpringBean;

//session
//-새로운 요청하면 브라우저 당 하나씩 메모리 공간을
//서버에서 할당한다.
//-session 영역은 브라우저당 하나씩 지정됨
//새로운 요청이 발생해도 같은 메모리 공간을 사용한다.
//-브라우저 종료할때까지 서버에서 사용가능
//-SessionScope:최초의 요청발생시키고 브라우저 닫을 때까지 범위

//@ModelAttribute를 통해 주입받는 bean은
//request영역에 저장되고 request으로부터 주입을 받는다.

//@SessiontAttribute:request가 아닌 session영역에 저장해서 객체로부터 객체주소값을 반환받는다.
//->@ModelAttribute를 통해 주입받는 bean을 @SessiontAttributes로 지정해놓으면
//request영역아닌 session영역에 저장됨
//주입도 session영역으로부터 받을 수 있다.
//!!알아두기!!
//t5, s5는 @ModelAttribute를 써보았다 -> requestScope로 값이 받아진다.(말이안됨)
//그래서 맨위에 @SessiontAttributes로 지정을 해서 request가 아닌 session영역에 저장되게 했다
//->잘 안씀

//page<request<session<application (범위큰순서)


@Controller
@SessionAttributes({"sbean","sbean2"})
public class SpController {
	@ModelAttribute("sbean")
	public SpringBean sbean() {
		return new SpringBean();
	}
	
	@ModelAttribute("sbean2")
	public SpringBean sbean2() {
		return new SpringBean();
	}

	@GetMapping("/t1")
	public String t1(HttpSession s) {
		s.setAttribute("d1", "spring");

		return "t1";
	}

	@GetMapping("/t2")
	public String t2(HttpSession s) {
		s.setAttribute("d1", "spring2");
		return "redirect:/s1";
	}

	@GetMapping("/t3")
	public String t3(HttpSession s) {
		s.setAttribute("d1", "spring3");
		return "forward:/s1";
	}

	@GetMapping("/t4")
	public String t4(HttpSession s) {
		SpringBean sb = new SpringBean();
		sb.setS1("spring4");
		sb.setS2("spring5");

		s.setAttribute("bean1", sb);

		return "t4";
	}

	@GetMapping("/s4")
	public String s4(@SessionAttribute("bean1") SpringBean bean) {
		System.out.println(bean.getS1());
		System.out.println(bean.getS2());

		return "s4";
	}

	@GetMapping("/t5")
	public String tr(@ModelAttribute("sbean") SpringBean sbean, @ModelAttribute("sbean2") SpringBean sbean2) {
		sbean.setS1("spring6");
		sbean.setS2("spring7");

		sbean2.setS1("spring8");
		sbean2.setS2("spring9");

		return "t5";
	}

	@GetMapping("/s5")
	public String s5(@ModelAttribute("sbean") SpringBean sbean, @ModelAttribute("sbean2") SpringBean sbean2) {
		System.out.println(sbean.getS1());
		System.out.println(sbean.getS2());

		System.out.println(sbean2.getS1());
		System.out.println(sbean2.getS2());

		return "s5";
	}

	@GetMapping("/s1")
	public String s1(HttpSession s) {
		String str = (String) s.getAttribute("d1");
		System.out.println(str);
		return "s1";
	}
}
