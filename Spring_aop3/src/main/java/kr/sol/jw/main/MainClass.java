package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.config.BBean;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml"); // 로딩을
		
		Test t1=ctx.getBean(Test.class);
		t1.m1();
		
		// 어노테이션일때 이걸로 한다
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BBean.class);
//		
//		ctx2.close();
	}
}
