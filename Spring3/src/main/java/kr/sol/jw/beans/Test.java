package kr.sol.jw.beans;

public class Test {
	public Test() {
		System.out.println("생성자");
	}
	
	public void Test_init() {
		System.out.println("Test init");
	}
	public void Test_destroy() {
		System.out.println("Test destroy");
	}
}

//싱글톤인 경우 xml파일 로딩할때 객체 생성됨
//싱글톤이고 lazy-init속성이 true인 경우 getBean() 호출 시 객체 생성됨
//prototype인 경우 getBean() 호출 시 객체 생성됨

//IoC컨테이너가 종료할때 객체소멸 ..
