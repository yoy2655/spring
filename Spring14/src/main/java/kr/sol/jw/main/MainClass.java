package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		System.out.println("====================================");

		// 어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
		Test t1 = ctx2.getBean(Test.class);
		System.out.println(t1.getS1());
		System.out.println(t1.getS2());
		System.out.println(t1.getS3());
		System.out.println(t1.getS4());
		System.out.println(t1.getS5());

		System.out.println("====================================");

		Test2 t2 = ctx2.getBean(Test2.class);
		System.out.println(t2.getS1());
		System.out.println(t2.getS2());
		System.out.println(t2.getS3());
		System.out.println(t2.getS4());

		System.out.println("====================================");

		Test3 t3 = ctx2.getBean("a3", Test3.class);
		System.out.println(t3.getS1());
		System.out.println(t3.getS2());
		System.out.println(t3.getS3());
		System.out.println(t3.getS4());
		
		System.out.println("====================================");

//		Test3 t4 = ctx2.getBean(Test3.class);
//		System.out.println(t4.getS1());
//		System.out.println(t4.getS2());
//		System.out.println(t4.getS3());
//		System.out.println(t4.getS4());

		ctx2.close();
	}
}
