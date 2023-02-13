package kr.sol.jw.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//getBean메소드를 호출할 때 객체가 생성된다.
//Singleton이다.
@Lazy
public class Test3 {
	
	public Test3() {
		System.out.println("Test3 생성자!!!!");
	}
}
