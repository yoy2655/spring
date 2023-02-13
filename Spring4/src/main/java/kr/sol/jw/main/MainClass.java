package kr.sol.jw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Spring;
import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test t1 = new Test();
		t1.pr();
		System.out.println("======================");

		Test a1 = ctx.getBean("t1", Test.class);
		a1.pr();

		System.out.println("======================");
		Test t2 = new Test(400);
		t2.pr();
		
		System.out.println("======================");
		Test a2 = ctx.getBean("t2", Test.class);
		a2.pr();
		
		System.out.println("======================");
		Test t3=new Test(55.11);
		t3.pr();
		
		System.out.println("======================");
		Test a3=ctx.getBean("t3",Test.class);
		a3.pr();
		
		System.out.println("======================");
		Test t4=new Test("spring");
		t4.pr();
		
		System.out.println("======================");
		Test a4=ctx.getBean("t4",Test.class);
		a4.pr();
		
		System.out.println("======================");
		Test t5=new Test(400,55.11,"spring");
		t5.pr();
		
		System.out.println("======================");
		Test a5=ctx.getBean("t5",Test.class);
		a5.pr();
		
		System.out.println("======================");
		Spring s1=new Spring();
		Spring s2=new Spring();
		Test2 s3=new Test2(s1, s2);
		s3.pr();
		
		System.out.println("======================");
		Test2 a6=ctx.getBean("t6",Test2.class);
		a6.pr();
		
		System.out.println("======================");
		Test2 a7=ctx.getBean("t7",Test2.class);
		a7.pr();
	
		ctx.close();
	}
}
