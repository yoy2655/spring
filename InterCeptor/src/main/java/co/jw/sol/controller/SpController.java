package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//인터셉터(방해자, 끼어들기) - AOP 개념(관점지향프로그래밍)
//가로채는작업(before, after, around 등등)
//언제끼어들지 작성을 해줄수 있다.
//	 /write	      /modify /delete
//로그인.. 게시글 작성, 수정, 삭제 등등을 인터셉터를 이용해서 확인해주는 작업을 해주면 중복이 줄어들것이다.

//interceptor : 요청주소에 관심을 갖고 요청이 발생하게 되면
//	      요청주소를 확인하여 controller의 메소드를
//	      호출하기 전이나 후에 다른 메소드를 호출할 수 있도록
//	      가로채 가는 개념
//
//인터페이스를 구현해주어야한다.(handler, adapter...)상속받아서 사용한다.
//
//
//interceptor
//유효성 검사 -> 어노테이션들을 알아본다

@Controller
public class SpController {

	@GetMapping("/t1")
	public String t1() {
		System.out.println("t1");
		return "t1";
	}

	@GetMapping("/t2")
	public String t2() {
		System.out.println("t2");
		return "t2";
	}

	@GetMapping("/s1/t3")
	public String t3() {
		System.out.println("s1/t3");
		return "t3";
	}

	@GetMapping("/s1/t4")
	public String t4() {
		System.out.println("s1/t4");
		return "t4";
	}
}
