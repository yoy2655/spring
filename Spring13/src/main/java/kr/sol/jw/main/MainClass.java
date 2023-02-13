package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		System.out.println("====================================");

		// 어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
		Test t1 = ctx2.getBean(Test.class);
		System.out.println(t1);

		Test t2 = ctx2.getBean(Test.class);
		System.out.println(t2);
		
		System.out.println("====================================");
		
		Test2 t3=ctx2.getBean("x3",Test2.class);
		System.out.println(t3);
		
		Test2 t4=ctx2.getBean("t5",Test2.class);
		System.out.println(t4);
		
		Test2 t5=ctx2.getBean("t6",Test2.class);
		System.out.println(t5);
		
		System.out.println("====================================");
		
		ctx2.close();
	}
}
