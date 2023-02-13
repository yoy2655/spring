package kr.sol.jw.beans;

public class Test2 {
	private Spring s1;
	private Spring s2;
	
	public Test2(Spring s1, Spring s2) {
		this.s1=s1;
		this.s2=s2;
	}
	public void pr() {
		System.out.println(s1);
		System.out.println(s2);
	}
}
