package kr.sol.jw.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages= {"kr.sol.jw.beans", "kr.sol.jw.db"})
public class BBean {
	
	//DB연결하기 위한 기본정보 세팅
	@Bean
	public BasicDataSource source() {
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		source.setUsername("system");
		source.setPassword("221216");
		
		return source;
	}
	//DB에 접속해 쿼리 전달하는 빈 등록해야함(기본적인 세팅작업임)
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db=new JdbcTemplate(source);
		return db;
	}
}
