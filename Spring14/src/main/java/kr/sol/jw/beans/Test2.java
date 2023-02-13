package kr.sol.jw.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test2 {
	private int s1;
	private String s2;
	private Spring4 s3;
	private Spring5 s4;
	
	public Test2(@Value("3")int s1, @Value("aa")String s2, Spring4 s3, Spring5 s4){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		
		
	}

	public int getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}

	public Spring4 getS3() {
		return s3;
	}

	public Spring5 getS4() {
		return s4;
	}
}
