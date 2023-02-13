package kr.sol.jw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test t1 = ctx.getBean("a1", Test.class);
		System.out.println(t1.getS1());
		System.out.println(t1.getS2());
		
		System.out.println("===========================");
		Test t2 = ctx.getBean("a2",Test.class);
		System.out.println(t2.getS1());
		System.out.println(t2.getS2());
		
		System.out.println("===========================");
		Test2 t3=ctx.getBean("a3",Test2.class);
		System.out.println(t3.getS1());
		System.out.println(t3.getS2());
		
		System.out.println("===========================");
		Test3 t4=ctx.getBean("a4",Test3.class);
		System.out.println(t4.getS1());
		System.out.println(t4.getS2());
		System.out.println(t4.getS3());
		System.out.println(t4.getS4());
		
		System.out.println("===========================");
		Test3 t5=ctx.getBean("a5",Test3.class);
		System.out.println(t5.getS1());
		System.out.println(t5.getS2());
		System.out.println(t5.getS3());
		System.out.println(t5.getS4());
		
		System.out.println("===========================");
		Test3 t6=ctx.getBean("a6",Test3.class);
		System.out.println(t6.getS1());
		System.out.println(t6.getS2());
		System.out.println(t6.getS3());
		System.out.println(t6.getS4());

		System.out.println("===========================");
		Test3 t7=ctx.getBean("a7",Test3.class);
		System.out.println(t7.getS1());
		System.out.println(t7.getS2());
		System.out.println(t7.getS3());
		System.out.println(t7.getS4());
		ctx.close();
	}
}
