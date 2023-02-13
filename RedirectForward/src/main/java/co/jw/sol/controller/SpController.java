package co.jw.sol.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SpController {
	//범위에 따라서 다르다.
	//request
	//session
	//application	각 영역의 bean주입 방법
	
	//redirect/forward
	
	@GetMapping("/t1")
	public String t1() {
		return "redirect:/s1";	//redirect는 경로 주소가 변경이 된다.(url매핑)
		//redirect로 넘겼기 때문에 t1.jsp를 만들었지만 s1.jsp로 페이지가 넘어가게되고 t1.jsp는 볼 수 없다.
	}
	
	@GetMapping("/s1")
	public String s1() {
		return "s1";
	}	
	
	
	@GetMapping("/t2")
	public String t2() {
		return "forward:/s2";	//forward는 경로주소가 변경되지 않는다.
		//forward로 넘겼기 때문에 주소값에 t2가 뜨고 s2.jsp로 페이지 이동이 이루어진다.
	}
	
	@GetMapping("/s2")
	public String s2() {
		return "s2";
	}
	
	//redirect : 서버가 클라이언트에게 
	//			 요청할 주소를 응답결과로 전달하는 것
	//			 redirect는 새로운 요청이 발생하는 것이므로
	//			 HttpServletRequest객체는 소멸 후 새롭게 생성되며
	//			 HttpSession객체는 그대로 유지됨
	
	//forward : 코드흐름이 서버상에서만 이동하는 것
	//			브라우저는 흐름이동을 알 수 없기 때문에 주소창의 주소
	//			변경되지 않음
	//			HttpServletRequest객체, HttpSession객체 다 유지됨
}
