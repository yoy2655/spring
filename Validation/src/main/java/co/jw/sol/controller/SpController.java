package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.bean.SpringBean;

@Controller
public class SpController {
	// 컨트롤러에 가서 경로매핑해준다.
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}

	@PostMapping("/check")
	public String check(@Valid SpringBean sbean, BindingResult result) {
		System.out.println(sbean.getD1());
		System.out.println(sbean.getD2());
		System.out.println(result);
		// 에러에 대한 메시지(메시지가 50이하여야합니다)가 뜬다.->@Max에 대한 defaultMessage

		// 혹시 유효성검사가 위배된다면
		if (result.hasFieldErrors()) {
			for (ObjectError obj : result.getAllErrors()) {
				System.out.println("메시지" + obj.getDefaultMessage());
				System.out.println("코드명" + obj.getCode());
				System.out.println("오브젝트명" + obj.getObjectName());

				String[] str = obj.getCodes();
				// str[0]:Max.springBean.d1
				// str[1]:Max.d1

				for (String s : str) {
					System.out.println(s);

					if (str[0].equals("Max.springBean.d1")) {
						System.out.println("d1는 50이하여야함!!!!");
					} else if (str[0].equals("Size.springBean.d2")) {
						System.out.println("d2는 3~10글자여야함!!!!");
					}
				}
			}
			return "t1";
		}
		return "t2";
	}
}
