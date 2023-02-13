package kr.sol.jw.beans;

public class Test {
	private int s1;
	private String s2;
	private Spring s3;

	public Test() {
	}

	public Test(int s1, String s2, Spring s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
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

	public Spring getS3() {
		return s3;
	}

	public void setS3(Spring s3) {
		this.s3 = s3;
	}
}