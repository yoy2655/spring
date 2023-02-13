package co.jw.sol.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {
	// 항상 AbstractAnnotationConfigDispatcherServletInitializer을 상속받아서 짜야한다.
	// 웹(프로젝트)에서 사용할 Bean들을 정의하기 위한 클래스를 지정하는 부분
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootAppContext.class };
	}

	// MVC 설정 위한 클래스 지정
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletAppContext.class };
	}

	//DispatcherServlet에 매핑할 요청주소를 세팅
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };

	}

	// 파라미터 인코딩 필터 설정 (한글로 파라미터를 입력했을 때 인식하기 위한거)
	protected Filter[] getServletFilters() {

		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] { encodingFilter };
	}
}
