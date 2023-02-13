package kr.sol.jw.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.sol.jw.beans.JBean;

@Component
public class JdbcDAO {

	// JDBC관리를 해주는 객체를 주입받을 거임
	// BBean.java에서 반환받은 객체의 주소값을 db(private JdbcTemplate db)필드에 넣을거임 -> 타입기준
	// 타입이 같기 때문에 @Autowired로 자동주입이 가능하다!

	@Autowired
	private JdbcTemplate db;

	// Mapper클래스 자동 주입
	@Autowired
	private MapperClass mapper;

	public void in_sert(JBean bean) {
		String sql = "insert into spr_table(num1,str1) values(?,?)";
		db.update(sql, bean.getNum1(), bean.getStr1());
	}

	public List<JBean> sel_ect(){
		String sql="select num1,str1 from spr_table";
		List<JBean> li=db.query(sql, mapper);
		//아까 테이블로부터 값을 꺼내서 bean에 저장한 것 반환받음
		return li;
	}
	public void up_date(JBean bean) {
		String sql="update spr_table set str1=? where num1=?";
		db.update(sql,bean.getStr1(),bean.getNum1());
	}
	public void de_lete(int n) {
		String sql="delete from spr_table where num1=?";
		db.update(sql,n);
	}
}
