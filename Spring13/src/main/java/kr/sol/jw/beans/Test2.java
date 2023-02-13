package kr.sol.jw.beans;

import org.springframework.stereotype.Component;

//객체의 주소값을 이름을 통해서 가져올 수 있다
@Component("x3")
public class Test2 {
	public Test2() {
		System.out.println("Test2 생성자!!!!");
	}
}
