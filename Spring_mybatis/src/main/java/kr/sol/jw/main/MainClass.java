package kr.sol.jw.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.sol.jw.beans.JBean;
import kr.sol.jw.config.BBean;
import kr.sol.jw.mapper.MapInterface;

public class MainClass {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml"); // 로딩을
		
		
		// 어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BBean.class);

		
		MapInterface m=ctx2.getBean("mm", MapInterface.class);
		
		JBean b1=new JBean();
		b1.setNum1(3);
		b1.setStr1("kim");
		m.in(b1);
		

		JBean b2=new JBean();
		b2.setNum1(3);
		b2.setStr1("kim2");
		m.up(b2);
		
		List<JBean> li=m.sel();
		for(JBean b3:li) {
			System.out.println(b3.getNum1());
			System.out.println(b3.getStr1());
		}
		m.de(3);
		//필드명과 이름만 맞춰주기만 하면 자동으로 mapping됨!!!
		
		ctx2.close();
	}
}
