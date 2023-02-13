package co.jw.sol.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.jw.sol.interceptor.Inter1;
import co.jw.sol.interceptor.Inter2;
import co.jw.sol.interceptor.Inter3;
import co.jw.sol.interceptor.Inter4;
import co.jw.sol.interceptor.Inter5;
import co.jw.sol.interceptor.Inter6;
import co.jw.sol.interceptor.Inter7;
import co.jw.sol.interceptor.Inter8;

//component를 적어줬기 때문에 componentScan을 등록해줘야 빈으로 등록이 됨
//MVC 관련한 설정해주는 파일
@Configuration
@EnableWebMvc
@ComponentScan("co.jw.sol.controller")
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

	public void addInterceptors(InterceptorRegistry reg) {
		// 인터셉터 등록
		WebMvcConfigurer.super.addInterceptors(reg);

		Inter1 i1 = new Inter1(); // HandlerInterceptor인터페이스 상속
		Inter2 i2 = new Inter2(); // HandlerInterceptorAdapter클래스 상속
		Inter3 i3 = new Inter3();
		Inter4 i4 = new Inter4();
		Inter5 i5 = new Inter5();
		Inter6 i6 = new Inter6();
		Inter7 i7 = new Inter7();
		Inter8 i8 = new Inter8();

		InterceptorRegistration r1 = reg.addInterceptor(i1);
		InterceptorRegistration r2 = reg.addInterceptor(i2);
		InterceptorRegistration r3 = reg.addInterceptor(i3);
		InterceptorRegistration r4 = reg.addInterceptor(i4);
		InterceptorRegistration r5 = reg.addInterceptor(i5);
		InterceptorRegistration r6 = reg.addInterceptor(i6);
		InterceptorRegistration r7 = reg.addInterceptor(i7);
		InterceptorRegistration r8 = reg.addInterceptor(i8);

//		=>출력순서
//		pre-Inter1
//		pre-Inter2
//		t1
//		post-Inter2
//		post-Inter1
//		afterCompletion-Inter2
//		afterCompletion-Inter1

		r1.addPathPatterns("/t1");// 인터셉터가 가로채갈 경로를 추가하는 작업(일종의 관심사가 여기서는 t1임)
		r2.addPathPatterns("/t1");
		r3.addPathPatterns("/t2");

		r4.addPathPatterns("/t1");
		r4.addPathPatterns("/t2");
		//r4같은 경우로 볼때 addPathPatterns(경로매핑)안적고 등록만 하면 그냥 뜬다. 
		
		r4.addPathPatterns("/t1","/t2");
		

//		=>출력순서
//		pre-Inter3
//		pre-Inter4
//		t2
//		post-Inter4
//		post-Inter3
//		afterCompletion-Inter4
//		afterCompletion-Inter3
		
		r5.addPathPatterns("/s1/*");//t1매핑된다. inter5만 매핑(경로 2개인것만 로딩)
		r6.addPathPatterns("/*");	//t1매핑된다.inter1,2,4,6매핑(경로 하나인것만 로딩)
		
//		=>출력순서
//		pre-Inter5
//		s1/t3
//		post-Inter5
//		afterCompletion-Inter5
		
		r7.addPathPatterns("/**");	 //경로하나건 두개건 상관없이 로딩하겠다.(모든 경로)
		r7.excludePathPatterns("/*");//인터셉터가 가로채가지 않을 경로를 세팅할수 있다.
		
		r8.addPathPatterns("/s1/t3","/s1/t4");	
//		=>출력순서
//		t1클릭시 inter2,4,5,6
//		t2클릭시 inter3,4,6
//		t3클릭시 inter4,7,8
//		t4클릭시 inter5,7,8

	}
}
