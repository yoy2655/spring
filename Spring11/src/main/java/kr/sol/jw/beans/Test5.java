package kr.sol.jw.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test5 {
	
	@Resource
	private Spring s1;
	
	@Resource
	private Spring2 s2;

	public Spring getS1() {
		return s1;
	}

	public Spring2 getS2() {
		return s2;
	}
}
