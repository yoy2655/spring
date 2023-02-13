package kr.sol.jw.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

import kr.sol.jw.beans.Spring;
import kr.sol.jw.beans.Spring2;
import kr.sol.jw.beans.Spring3;
import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;

public class Beans {
	@Bean
	public Test t1() {
		return new Test(3, "aa", new Spring());
	}

	@Bean
	public Test t2() {
		Test a1 = new Test();
		a1.setS1(44);
		a1.setS2("aa");
		a1.setS3(new Spring());

		return a1;
	}

	@Bean
	public Spring2 a1() {
		return new Spring2();
	}

	@Bean
	public Spring2 a2() {
		return new Spring2();
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public Test2 a3() {
		return new Test2();
	}
	
	@Bean
	public Spring3 a() {
		return new Spring3();
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public Test3 a4() {
		return new Test3();
	}
}
