package kr.sol.jw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"kr.sol.jw.advisor","kr.sol.jw.beans"})	//2개의 패키지를 스캔해서 찾아가지고 빈으로 등록을 하겠다..(그러기 위하여 configuration설정을 함)
@EnableAspectJAutoProxy
public class BBean {

}
