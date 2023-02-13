package kr.sol.jw.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.sol.jw.beans.JBean;
import kr.sol.jw.config.BBean;
import kr.sol.jw.db.JdbcDAO;

public class MainClass {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml"); // 로딩을
		
		
		// 어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BBean.class);
		
		JdbcDAO dao=ctx2.getBean(JdbcDAO.class);
		
		JBean b1=new JBean();
		b1.setNum1(3);
		b1.setStr1("hong");
		dao.in_sert(b1);
		
		JBean b2=new JBean();
		b2.setNum1(3);
		b2.setStr1("lee");
		dao.up_date(b2);
		
		List<JBean> li=dao.sel_ect();
		
		for(JBean b3:li) {
			System.out.println(b3.getNum1());
			System.out.println(b3.getStr1());
		}
		
		dao.de_lete(3);
		
//		ctx2.close();
	}
}
