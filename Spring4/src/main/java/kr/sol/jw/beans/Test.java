package kr.sol.jw.beans;

public class Test {
	private int s1;
	private double s2;
	private String s3;

	public Test() {
		System.out.println("Test");
		this.s1 = 0;
		this.s2 = 0.0;
		this.s3 = null;
	}

	public Test(int s1) {
		System.out.println("int");
		this.s1 = s1;
		this.s2 = 0.0;
		this.s3 = null;
	}

	public Test(double s2) {
		System.out.println("double");
		this.s1 = 0;
		this.s2 = s2;
		this.s3 = null;
	}

	public Test(String s3) {
		System.out.println("String");
		this.s1 = 0;
		this.s2 = 0.0;
		this.s3 = s3;
	}
	
	public Test(int s1, double s2, String s3) {
		System.out.println("Test생성자");
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}

	public void pr() {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
