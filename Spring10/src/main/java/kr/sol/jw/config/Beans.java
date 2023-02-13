package kr.sol.jw.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.sol.jw.beans.Spring;
import kr.sol.jw.beans.Spring2;
import kr.sol.jw.beans.Test;
@Configuration
public class Beans {
	
	@Bean
	public Test x1() {
		return new Test();
	}
	
	@Bean
	public Spring x2() {
		return new Spring();
	}
	
	@Bean
	public Spring2 t4() {
		return new Spring2();
	}
	
	@Bean
	public Spring2 t5() {
		return new Spring2();
	}
	
}
