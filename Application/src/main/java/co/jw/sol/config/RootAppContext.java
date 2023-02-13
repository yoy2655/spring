package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.bean.SpringBean;

//Bean정의하는 클래스
@Configuration
public class RootAppContext {

	// 빈 주입
	@Bean
	@SessionScope
	public SpringBean sbean() {
		return new SpringBean();
	}
}
