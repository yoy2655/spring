package kr.sol.jw.beans;

public class Test {

	public int m1() {
		System.out.println("메소드");

		int n = 4/0;	//일부러 에러를 낸다
		return 300;
	}
}
