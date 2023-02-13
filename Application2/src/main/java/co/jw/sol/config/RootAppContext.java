package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import co.jw.sol.bean.SpringBean;
import co.jw.sol.bean.SpringBean2;

//Bean정의하는 클래스
@Configuration
public class RootAppContext {

	@Bean
	@ApplicationScope
	public SpringBean s1() {
		return new SpringBean();
	}

	@Bean("app2")
	@ApplicationScope
	public SpringBean2 s2() {
		return new SpringBean2();
	}
	//@ApplicationScope: 서버가동될때 자동으로 주입됨
	//					 주입만 이뤄지고 application영역에 값이 저장은 안됨
}
