package kr.sol.jw.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test6 {
	
	@Resource(name="s1")
	private Spring s11;
	
	@Resource(name="s2")
	private Spring2 s22;

	public Spring getS11() {
		return s11;
	}

	public Spring2 getS22() {
		return s22;
	}
}
