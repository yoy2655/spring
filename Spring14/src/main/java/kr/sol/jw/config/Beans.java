package kr.sol.jw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.sol.jw.beans.Spring3;
import kr.sol.jw.beans.Spring4;
import kr.sol.jw.beans.Spring5;
import kr.sol.jw.beans.Test3;


@Configuration
@ComponentScan(basePackages = "kr.sol.jw.beans")
public class Beans {
	
	@Bean
	public Spring3 o4() {
		return new Spring3();
	}
	@Bean
	public Spring3 o5() {
		return new Spring3();
	}
	
	@Bean
	public Test3 a3() {
		Test3 t=new Test3(3,"glgl", new Spring4(), new Spring5());
		return t;
	}
}
