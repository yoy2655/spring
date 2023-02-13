package co.jw.sol.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpController {
	// 쿠키
	// 사용자 웹 브라우저에 저장됨
	// 요청 발생하면 웹 브라우저는 쿠키에 저장된 정보를 서버에 전달하게 된다.
	// 응답결과로 쿠키 정보가 전달되면 웹 브라우저가 쿠키에 저장하게 된다.
	// 모델2에서는 쿠키정보를 배열로 받아 사용할 수 있었으나
	// 스프링 MVC에서는 쿠키정보를 주입받아 사용할 수 있다.
	//쿠키정보는 브라우저가 살아있을때에만 전달할 수 있다.

	@GetMapping("/cookie")
	public String cookie(HttpServletResponse response) {
		try {
			String d1 = URLEncoder.encode("spring1", "UTF-8");
			String d2 = URLEncoder.encode("spring2", "UTF-8");

			Cookie c1 = new Cookie("c1", d1);
			Cookie c2 = new Cookie("c2", d2);

			c1.setMaxAge(365 * 24 * 60 * 60);

			response.addCookie(c1);
			response.addCookie(c2);
			// 응답결과에 쿠키정보를 담아 보내기 때문에 response객체를 이용해야함
			// 클라이언트한테 cookie전하려고 response객체에 쿠키정보를 저장

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "cookie";
	}

	@GetMapping("/cookie2")
	public String cookie2(HttpServletRequest request) {
		// cookie2 url 요청할때 요청정보에 cookie정보가 저장되어 넘어오기 때문에
		// request객체 주입받아야한다(=활용해야한다.)
		try {
			Cookie[] co = request.getCookies();

			for (Cookie c : co) {
				String str = URLDecoder.decode(c.getValue(), "UTF-8");

				if (c.getName().equals("c1")) {
					System.out.println(str);
				} else if (c.getName().equals("c2")) {
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "cookie2";
	}

	@GetMapping("/cookie3")
	public String cookie3(@CookieValue("c1") String c1, @CookieValue("c2") String c2) {
		System.out.println(c1);
		System.out.println(c2);

		return "cookie3";
	}

}
