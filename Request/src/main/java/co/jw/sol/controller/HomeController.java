package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//HomeController를 Bean으로 등록을 하고 컨트롤러로 지정해서 사용을 하겠다고 설정하는 작업
@Controller
public class HomeController {
	//RequestMapping: 경로와 방식을 작성하는 부분이다.
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "index";
	}
}
