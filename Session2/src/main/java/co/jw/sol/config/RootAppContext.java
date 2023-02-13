package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;

//Bean정의하는 클래스
@Configuration
public class RootAppContext {
	
	//빈 주입
	@Bean
	@SessionScope
	public SpringBean sbean() {
		return new SpringBean();
	}

	@Bean("sbean2")
	@SessionScope
	public SpringBean2 sbean2() {
		return new SpringBean2();
	}
}
