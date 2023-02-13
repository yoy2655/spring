package kr.sol.jw.beans;

public class Test {

	public void m1() {
		System.out.println("m1");
	}

	public void m1(int a1) {
		System.out.println("int");
	}

	public void m1(String a2) {
		System.out.println("String");
	}

	public void m1(int a1, int a2) {
		System.out.println("int 2개");
	}

	public void m1(int a1, String a2) {
		System.out.println("int, String");
	}
}
