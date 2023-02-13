package co.jw.sol.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.bean.SpringBean;

@Controller
public class SpController {
//	Application : 서버가 가동될때부터~ 서버가 종료되는 시점까지
//	ApplicationScope : 메모리 영역이 만들어지고
//			   ServletContext라는 클래스타입의 객체로 관리된다
//	ServletContext에 저장된 데이터, 객체는 서버가 종료되기 전까지
//	웹 브라우저에 관계업싱 동한 메모리 공간을 사용하게된다.
//
//	ServletContext에 데이터나 객체를 담으면 서버가 종료될때까지 사용할
//	수 있다(=서버만 종료되지 않으면 다른 브라우저에서 같은 메모리공간을 사용할 수 있다) 

	@Autowired
	ServletContext app;
	//ApplicationScope일때는 ServletContext라고 적어줘야한다.
	//app에서 관리한다는 뜻이다.
	//=>자동주입받아서 HttpServletRequest를 받아오지않아도
	//Application객체에서 메모리를 받아서 사용할수 있게 하겠다는 의미이다.

	@GetMapping("/t1")
//	1번 방법
//	public String t1(HttpServletRequest request) {
//		app.setAttribute("d1", "spring1");
//		
//		ServletContext a=request.getServletContext();
//		a.setAttribute("d1", "spring1");
//		
//		return "t1";
//	}

//	2번 방법
	public String t1() {

		app.setAttribute("d1", "spring1");
		//app에 값을 저장한다.

		SpringBean sb = new SpringBean();
		sb.setS1("d1");
		sb.setS2("d2");
		
		app.setAttribute("sb", sb);

		return "t1";
	}

	@GetMapping("/s1")
	public String s1() {
		String str = (String) app.getAttribute("d1"); // Object객체이기 떄문에
		System.out.println(str);
		
		SpringBean s = (SpringBean)app.getAttribute("sb");
		System.out.println(s.getS1());
		System.out.println(s.getS2());
		return "s1";
	}
}
