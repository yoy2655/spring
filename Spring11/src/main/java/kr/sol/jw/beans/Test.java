package kr.sol.jw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {
	public Test() {
		System.out.println("Test1");
	}

	public void init1() {
		System.out.println("Test1 init");
	}

	public void destroy1() {
		System.out.println("Test1 destroy");
	}
}
