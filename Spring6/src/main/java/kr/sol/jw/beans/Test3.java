package kr.sol.jw.beans;

public class Test3 {
	private int s1;
	private String s2;
	private Spring2 s3;
	private Spring2 s4;

	public Test3(Spring2 s3, Spring2 s4) {
		this.s3 = s3;
		this.s4 = s4;
	}

	public Test3(int s1, String s2, Spring2 s3, Spring2 s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public Spring2 getS3() {
		return s3;
	}

	public void setS3(Spring2 s3) {
		this.s3 = s3;
	}

	public Spring2 getS4() {
		return s4;
	}

	public void setS4(Spring2 s4) {
		this.s4 = s4;
	}
}
