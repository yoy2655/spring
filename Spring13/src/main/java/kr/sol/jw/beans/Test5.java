package kr.sol.jw.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Test5 {
	public Test5() {
		System.out.println("Test5 생성자!!!!");
	}
	
	@PostConstruct
	public void a() {
		System.out.println("aa");
	}
	@PreDestroy
	public void b() {
		System.out.println("bb");
	}
}
