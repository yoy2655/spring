package kr.sol.jw.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {

	@Autowired
	private Spring s1;
	
	@Autowired
	@Qualifier("o2")
	private Spring2 s2;
	
	@Resource(name = "o3")
	private Spring3 s3;

	@Resource(name = "o4")
	private Spring3 s4;
	
	@Resource(name = "o5")
	private Spring3 s5;

	public Spring getS1() {
		return s1;
	}

	public Spring2 getS2() {
		return s2;
	}

	public Spring3 getS3() {
		return s3;
	}

	public Spring3 getS4() {
		return s4;
	}

	public Spring3 getS5() {
		return s5;
	}
	
	
}
