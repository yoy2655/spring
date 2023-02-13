package kr.sol.jw.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class Test2 {
	public Test2() {
		System.out.println("Test2");
	}

	// 생성자 호출 후 자동으로 호출
	@PostConstruct
	public void init2() {
		System.out.println("Test2 init");
	}

	// 객체 소멸되기 전에 자동으로 호출
	@PreDestroy
	public void destroy2() {
		System.out.println("Test2 destroy");
		// 스택구조라서 Test2 destroy, Test destroy순서로 나중에 들어간거 먼저 소멸된다.
	}
}
