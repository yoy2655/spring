package kr.sol.jw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.sol.jw.beans.Test;


@Configuration
//지정된 패키지의 Bean클래스들의 어노테이션을 분석하여 Bean으로 등록
@ComponentScan(basePackages="kr.sol.jw.beans2")
@ComponentScan(basePackages="kr.sol.jw.beans3")
public class Beans {
	@Bean 
	public Test t1() {
		return new Test();
	}
}
