package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//component를 적어줬기 때문에 componentScan을 등록해줘야 빈으로 등록이 됨
//MVC 관련한 설정해주는 파일
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="co.jw.sol.controller")
@ComponentScan(basePackages="co.jw.sol.dao")
@ComponentScan(basePackages="co.jw.sol.service")
public class ServletAppContext implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	//프로퍼티파일을 메시지로 등록하면 이 데이터는 jsp에서도 사용할 수 있다.
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource re = 
				new ReloadableResourceBundleMessageSource();
		
		re.setBasenames("/WEB-INF/properties/error");
		return re;
	}

}
