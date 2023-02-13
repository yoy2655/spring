package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;

//Bean정의하는 클래스
@Configuration
public class RootAppContext {

	@Bean
	@RequestScope	//새로운 요청이 있을때마다 빈객체를 자동 주입(생성) 받을 거임
	public SpringBean bean1() {
		return new SpringBean();
	}
	
	@Bean("sbean2")
	@RequestScope
	public SpringBean2 bean2() {
		return new SpringBean2();
	}
}
