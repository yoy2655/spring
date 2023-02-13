package kr.sol.jw.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.sol.jw.beans.JBean;

@Component
public class MapperClass implements RowMapper<JBean>{
	//jdbc에서는 resultset(데이터 값)으로 반환받았었다
	//그런데 RowMapper를 이용하면 객체자체를 반환받을수 있다(원하는 값을 원하는 형태로 반환받을 수 있어서 스프링에서 많이 쓴다)
	//일종의 커넥션풀 역할을 하고 있어서 Connection, Statement 따로 안써줘도 된다 ++

	public JBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		JBean bean=new JBean();
		bean.setNum1(rs.getInt("num1"));
		bean.setStr1(rs.getString("str1"));
		
		return bean;
	}
}
