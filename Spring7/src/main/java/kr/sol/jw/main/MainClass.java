package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test1;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test1 t1 = ctx.getBean("a1", Test1.class);
		System.out.println(t1);

		Test1 t11 = ctx.getBean("a1", Test1.class);
		System.out.println(t11);
		ctx.close();

		System.out.println("======================================");

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);

		Test1 x1 = ctx2.getBean("x1", Test1.class);
		System.out.println(x1);
		
		System.out.println("======================================");

		Test1 x2 = ctx2.getBean("x1", Test1.class);
		System.out.println(x2);

		System.out.println("======================================");

		Test1 x3 = ctx2.getBean("java", Test1.class);
		System.out.println(x3);

		System.out.println("======================================");

		Test2 x4 = ctx2.getBean("x2", Test2.class);
		System.out.println(x4);

		System.out.println("======================================");

		Test3 x5 = ctx2.getBean("x3", Test3.class);
		System.out.println(x5);

		System.out.println("======================================");
		
		Test3 x6 = ctx2.getBean("x3", Test3.class);
		System.out.println(x6);
	}
}
