package kr.sol.jw.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.sol.jw.mapper.MapInterface;

@Configuration
@ComponentScan(basePackages = { "kr.sol.jw.beans" })
public class BBean {

	// DB연결하기 위한 기본정보 세팅
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		source.setUsername("system");
		source.setPassword("221216");

		return source;
	}
	// Mybatis를 이용하면 기본세팅은 똑같은데 JdbcTemplate을 안쓴다
	//JDBC처리하는 객체
	@Bean
	public SqlSessionFactory fac(BasicDataSource source) throws Exception {
		SqlSessionFactoryBean f = new SqlSessionFactoryBean();

		f.setDataSource(source);
		SqlSessionFactory fa = f.getObject();
		return fa;
	}

	@Bean
	public MapperFactoryBean<MapInterface> mm(SqlSessionFactory factory) {
		MapperFactoryBean<MapInterface> f = new MapperFactoryBean<MapInterface>(MapInterface.class);

		f.setSqlSessionFactory(factory);
		return f;
	}
}
