package co.jw.sol.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.jw.sol.mapper.BoardMapper;
import co.jw.sol.mapper.TopmenuMapper;

//component를 적어줬기 때문에 componentScan을 등록해줘야 빈으로 등록이 됨
//MVC 관련한 설정해주는 파일
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "co.jw.sol.controller")
@ComponentScan(basePackages = "co.jw.sol.dao")
@ComponentScan(basePackages = "co.jw.sol.service")
@PropertySource("/WEB0INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer {

	@Value("${db.classname}")
	private String db_classname;

	@Value("${db.url}")
	private String db_url;

	@Value("${db.username}")
	private String db_username;

	@Value("${db.password}")
	private String db_password;

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
		source.setUsername(db_username);
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
}
