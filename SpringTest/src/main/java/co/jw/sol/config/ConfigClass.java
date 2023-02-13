package co.jw.sol.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 웹에서 사용할 Bean들을 정의하기 위한 클래스를 지정해야함
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootAppContext.class };
	}

	// MVC설정위한 클래스 지정
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletAppContext.class };
	}

	// DispatcherServlet에 매핑할 요청주소를 세팅
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };

	}
	// 파라미터 인코딩 필터 설정

	protected Filter[] getServletFilters() {

		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] { encodingFilter };
	}

}
