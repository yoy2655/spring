package kr.sol.jw.beans;

public class Test3 {
	public Test3() {
		System.out.println("생성자");
	}
	public void Test3_init() {
		System.out.println("Test3 init");
	}
	public void Test3_destroy() {
		System.out.println("Test3 destroy");
	}
	
	public void Test2_init() {
		System.out.println("Test2 init");
	}
	public void Test2_destroy() {
		System.out.println("Test2 destroy");
	}
}
