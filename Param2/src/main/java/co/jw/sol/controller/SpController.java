package co.jw.sol.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import co.jw.sol.bean.Data;

@Controller
public class SpController {

	// Map으로 파라미터를 받는다.
	@GetMapping("/t1")
	public String t1(@RequestParam Map<String, String> map, @RequestParam List<String> d3) {
		// d1, d2은 모든 파라미터를 한번에 Map으로 받는다.
		// d3은 동일한 이름의 파라미터를 보내는 경우에는 Map으로 못받는다.
		// key값은 중복허용이 안되기 때문이다.
		// 이 경우에 d3은 list로 값을 받을 수 있다.
		String d1 = map.get("d1");
		String d2 = map.get("d2");

		System.out.println(d1);
		System.out.println(d2);

		for (String a : d3) {
			System.out.println(a);
		}
		return "final";
	}

	@GetMapping("/t2")
	public String t2(@ModelAttribute Data b1) {
		//@ModelAttribute
		//파라미터를 객체로 주입받을 수 있다.
		//전달되는 파라미터 이름과 동일한 필드에 자동으로 주입된다.
		//생략가능
		System.out.println(b1.getD1());
		System.out.println(b1.getD2());

		for (int n : b1.getD3()) {
			System.out.println(n);
		}
		return "final";
	}
}
