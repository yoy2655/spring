package kr.sol.jw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {
	private int s1;
	private Spring s2;

	//자동주입을 변수에 설정=>자동으로 setter메소드가 추가되어 setter메소드를 통해 주입받게 됨
	@Autowired
	private Spring s3;
	
	@Autowired
	@Qualifier("t4")
	private Spring2 s4;
	
	@Autowired
	@Qualifier("t5")
	private Spring2 s5;
	
	
	public Spring getS3() {
		return s3;
	}
	
	public Spring2 getS4() {
		return s4;
	}

	public Spring2 getS5() {
		return s5;
	}
	
	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public Spring getS2() {
		return s2;
	}
	@Autowired
	public void setS2(Spring s2) {
		this.s2 = s2;
	}
}
