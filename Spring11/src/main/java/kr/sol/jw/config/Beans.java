package kr.sol.jw.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.sol.jw.beans.Spring;
import kr.sol.jw.beans.Spring2;
import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;
import kr.sol.jw.beans.Test4;
import kr.sol.jw.beans.Test5;
import kr.sol.jw.beans.Test6;

@Configuration
public class Beans {

	@Bean(initMethod = "init1", destroyMethod="destroy1")
	@Lazy
	public Test t1() {
		return new Test();
	}
	
	@Bean
	@Lazy
	public Test2 t2() {
		return new Test2();
	}
	
	@Bean
	public Spring s1() {
		return new Spring();
	}
	@Bean
	public Spring2 s2() {
		return new Spring2();
	}

	@Bean(autowire=Autowire.BY_NAME)
	public Test3 t3() {
		return new Test3();
	}
	
	@Bean
	public Test4 t4() {
		return new Test4();
	}
	
	@Bean
	public Test5 t5() {
		return new Test5();
	}
	
	@Bean
	public Test6 t6() {
		return new Test6();
	}
}
