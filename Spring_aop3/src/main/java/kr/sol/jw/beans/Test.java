package kr.sol.jw.beans;

import org.springframework.stereotype.Component;

//@Component를 쓰면 @Bean을 안쓰고도 @ComponentScan을 쓴 데로 찾아가서 쓸수있었다
@Component
public class Test{
	public void m1() {
		System.out.println("m1함수");
		//int a=3/0;
	}
}
