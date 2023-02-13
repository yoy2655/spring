package kr.sol.jw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Spring;
import kr.sol.jw.beans.Test;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

//		Test t1 = new Test();
//		t1.setS1(3);
//		
//		System.out.println(t1.getS1());
		
		Test t1=ctx.getBean("t1", Test.class);
		System.out.println("t1.getS1() : "+t1.getS1());
		System.out.println("t1.getS2() : "+t1.getS2());
		System.out.println("t1.isS3() : "+t1.isS3());
		System.out.println("t1.getS4() : "+t1.getS4());
		System.out.println("t1.getS5() : "+t1.getS5());
		System.out.println("t1.getS6() : "+t1.getS6());

		ctx.close();
	}
}
