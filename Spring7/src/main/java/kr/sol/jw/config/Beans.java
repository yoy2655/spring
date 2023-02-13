package kr.sol.jw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.sol.jw.beans.Test1;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;

@Configuration
public class Beans {

	@Bean
	public Test1 x1() {
		Test1 t1=new Test1();
		return t1;
	}
	
	@Bean(name="java")
	public Test1 jj() {
		Test1 t1=new Test1();
		return t1;
	}
	@Bean
	@Lazy
	public Test2 x2() {
		Test2 t2=new Test2();
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public Test3 x3() {
		Test3 t3 = new Test3();
		return t3;
	}
	
}
