package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.beans.User;

//Bean정의하는 클래스
@Configuration
public class RootAppContext {

	//로그인빈을 빈으로 등록을 해서 세션처리해줌
	@Bean("loginBean")
	@SessionScope
	public User loginBean() {
		return new User();
	}
}
