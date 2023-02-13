package kr.sol.jw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.sol.jw.beans.Test2;

@Configuration
@ComponentScan(basePackages = "kr.sol.jw.beans")
public class Beans {
	@Bean
	public Test2 t5() {
		return new Test2();
	}

	@Bean
	public Test2 t6() {
		return new Test2();
	}
}
