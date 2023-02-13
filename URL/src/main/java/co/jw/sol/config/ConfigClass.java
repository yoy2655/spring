package co.jw.sol.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ConfigClass extends AbstractAnnotationConfigDispatcherServletInitializer {

	//  Bean설정 파일
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootAppContext.class };
	}

	// 스프링 MVC설정 파일
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { ServletAppContext.class };
	}

	// DispatcherServlet 모든 경로로부터 받겠다.
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };

	}
	// 인코딩 필터 클래스에 캐릭터 리퀘스트로 캐릭터인코딩 utf-8로 설정해면 따로 선언할 필요가 없어짐.

	protected Filter[] getServletFilters() {

		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] { encodingFilter };
	}

}
