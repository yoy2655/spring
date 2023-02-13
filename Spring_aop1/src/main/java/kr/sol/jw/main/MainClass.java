package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;


public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		
		Test t1=ctx.getBean("a1",Test.class);
		int n=t1.m1();
		System.out.println(n);//함수호출해준다
		System.out.println("====================================");

		// 어노테이션일때 이걸로 한다
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);

//		ctx2.close();
	}
}
