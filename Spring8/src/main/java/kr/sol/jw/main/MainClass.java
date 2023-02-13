package kr.sol.jw.main;

import java.beans.Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test t1=ctx.getBean("x1",Test.class);
		ctx.close();
		
		System.out.println("=========================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(Beans.class);
		
		Test t2=ctx2.getBean("j1",Test.class);
		ctx.close();
	}
}
