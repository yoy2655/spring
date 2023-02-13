package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.jw.sol.bean.SpringBean;

@Controller
public class SpController {
	// 각 영역의 bean주입 방법
	@GetMapping("t1")
	public String t1(HttpServletRequest request) {
		request.setAttribute("d1", "spring");
		// spring이라는 문자열을 d1이라는 이름으로 저장을 하고 forward로 s1.jsp에 넘기고있다.
		return "forward:/s1";
	}

	@GetMapping("/s1")
	public String s1(HttpServletRequest request) {
		String str = (String) request.getAttribute("d1");
		// d1값을 꺼내서 콘솔창에 띄웠고 spring문자열을 s1.jsp에 띄우겠다.
		// request.setAttribute()안했지만 request로 보냈기 때문에
		// getAttribute("d2)로 꺼낼 수 있다.
		System.out.println(str);
		return "s1";
	}

	@GetMapping("/t2")
	public String t2(Model mo) {
		mo.addAttribute("d2", "spring2");
		return "forward:/s2";
	}

	@GetMapping("/s2")
	public String s2(HttpServletRequest request) {
		String str = (String) request.getAttribute("d2");
		System.out.println(str);
		return "s2";
	}

	@GetMapping("t3")
	public ModelAndView t3(ModelAndView mo) {
		mo.addObject("d3", "spring3");
		mo.setViewName("forward:/s3");
		return mo;
	}

	@GetMapping("/s3")
	public String s3(HttpServletRequest request) {
		String str = (String) request.getAttribute("d3");
		System.out.println(str);
		return "s3";
	}

	@GetMapping("t4")
	public String t4(Model mo) {
		SpringBean bean = new SpringBean();

		bean.setS1("spring4");
		bean.setS2("spring5");

		mo.addAttribute("bean", bean);
		return "forward:/s4";
	}

	@GetMapping("/s4")
	public String s4(HttpServletRequest request) {
		SpringBean sb = (SpringBean) request.getAttribute("bean");
		System.out.println(sb.getS1());
		System.out.println(sb.getS2());

		return "s4";
	}

	@GetMapping("/t5")
	public String t4(@ModelAttribute("bean") SpringBean bean) {
		bean.setS1("spring6");
		bean.setS2("spring7");

		return "forward:/s5";
	}

	@GetMapping("/s5")
	public String s5(HttpServletRequest request) {

		SpringBean sb = (SpringBean) request.getAttribute("bean");
		System.out.println(sb.getS1());
		System.out.println(sb.getS2());

		return "s5";
	}

	// Request : 새로운 요청이 발생하면 브라우저는 서버에 요청에 관련된 정보를 전송한다.
	// 서버는 브라우저가 보낸 요청 정보들을 보관하기 위해
} // HttpServletRequest 객체를 생성해 요청정보를 담는다.
	// HttpServletRequest 객체는 응답결과가 브라우저로 전송될때까지 유지된다.

// RequestScope : 새 요청이 발생해 응답결과가 브라우저로 전송될때까지의 범위
