package kr.sol.jw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.sol.jw.beans.Test;

@Configuration
public class Beans {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public Test j1() {
		return new Test();
	}

}
