package kr.sol.jw.beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Test4 {

	@Autowired
	@Qualifier("s1")
	private Spring s1;

	@Autowired
	@Qualifier("s2")
	private Spring2 s2;

	public Spring getS1() {
		return s1;
	}

	public Spring2 getS2() {
		return s2;
	}
}
