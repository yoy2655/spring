package co.jw.sol.config;

import javax.annotation.Resource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.jw.sol.beans.User;
import co.jw.sol.interceptor.LoginInterceptor;
import co.jw.sol.interceptor.TopmenuInterceptor;
import co.jw.sol.interceptor.WriterInterceptor;
import co.jw.sol.mapper.BoardMapper;
import co.jw.sol.mapper.TopmenuMapper;
import co.jw.sol.mapper.UserMapper;
import co.jw.sol.service.BoardService;
import co.jw.sol.service.TopmenuService;

//component를 적어줬기 때문에 componentScan을 등록해줘야 빈으로 등록이 됨
//MVC 관련한 설정해주는 파일
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "co.jw.sol.controller")
@ComponentScan(basePackages = "co.jw.sol.dao")
@ComponentScan(basePackages = "co.jw.sol.service")
@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer {

	@Value("${db.classname}")
	private String db_classname;

	@Value("${db.url}")
	private String db_url;

	@Value("${db.username}")
	private String db_username;

	@Value("${db.password}")
	private String db_password;

	// addInterceptors메서드에서
	// 생성자 안에 객체를 넣기 위하여
	// ServletAppContext.java파일에서 주입받지 못한 TopmenuService를 자동주입받아
	// 파라미터로 넣어준다
	@Autowired
	private TopmenuService topmenuService;

	@Resource(name = "loginBean")
	private User loginBean;

	@Autowired
	private BoardService boardService;

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);

		return source;
	}

	@Bean
	public SqlSessionFactory fac(BasicDataSource so) throws Exception {
		SqlSessionFactoryBean fac = new SqlSessionFactoryBean();
		fac.setDataSource(so);
		SqlSessionFactory f = fac.getObject();
		return f;
	}

	@Bean
	public MapperFactoryBean<BoardMapper> getBoardMapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<BoardMapper> fac = new MapperFactoryBean<BoardMapper>(BoardMapper.class);
		fac.setSqlSessionFactory(factory);
		return fac;
	}

	@Bean
	public MapperFactoryBean<TopmenuMapper> getTopmenuMapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<TopmenuMapper> fac = new MapperFactoryBean<TopmenuMapper>(TopmenuMapper.class);
		fac.setSqlSessionFactory(factory);
		return fac;
	}

	@Bean
	public MapperFactoryBean<UserMapper> getUserMapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<UserMapper> fac = new MapperFactoryBean<UserMapper>(UserMapper.class);
		fac.setSqlSessionFactory(factory);
		return fac;
	}

	// 2.인터셉터 등록
	// 로그인 여부 확인, 등급별 서비스 권한 확인 등에 이용목적
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 작성자와 로그인한 사람이 다르면 글쓰기 수정, 글쓰기 삭제 url들어갈수없음
		
		WebMvcConfigurer.super.addInterceptors(registry);
		TopmenuInterceptor topmenuInterceptor = new TopmenuInterceptor(topmenuService, loginBean);
		// 인터셉터레지스트레이션을 등록
		InterceptorRegistration re1 = registry.addInterceptor(topmenuInterceptor);

		re1.addPathPatterns("/**");
		
		//다음의 url주소가 들어오기 전에 LoginInterceptor의 preHandle부터 검사를 하겠다.
		LoginInterceptor loginInterceptor=new LoginInterceptor(loginBean);
		InterceptorRegistration reg2=registry.addInterceptor(loginInterceptor);
		reg2.addPathPatterns("/user/modify","/board/*","/user/logout");
		reg2.excludePathPatterns("/board/main");
		
		WriterInterceptor writerInterceptor = new WriterInterceptor(boardService, loginBean);
		InterceptorRegistration reg3=registry.addInterceptor(writerInterceptor);
		reg3.addPathPatterns("/board/modify", "/board/delete");
	}

	// 하나는 위에서 주입받고
	// 하나는 메서드로 등록했다.
	// 프로퍼티 파일을 2개이상 등록하면 오류난다
	// 프로퍼티 파일을 2개이상 등록하면 PropertySourcesPlaceholderConfigurer로 빈정의를 따로 등록 해줘야한다.

	@Bean
	public static PropertySourcesPlaceholderConfigurer PropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
		res.setBasename("/WEB-INF/properties/error");
		return res;
	}

}