package kr.sol.jw.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;
import kr.sol.jw.beans.Test4;
import kr.sol.jw.beans.Test5;
import kr.sol.jw.beans.Test6;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		
		//어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
		
		Test a1=ctx2.getBean("t1", Test.class);
		//출력안해도 자동으로 출력된다
		
		Test2 a2=ctx2.getBean("t2",Test2.class);
		
		System.out.println("==================================");
		
		Test3 a3=ctx2.getBean("t3",Test3.class);	//자동으로 호출한 메소드를 안써줬다
		System.out.println(a3.getS1());
		System.out.println(a3.getS2());
		
		System.out.println("==================================");
		
		Test4 a4=ctx2.getBean("t4", Test4.class);
		System.out.println(a4.getS1());
		System.out.println(a4.getS2());
		
		System.out.println("==================================");
		
		Test5 a5=ctx2.getBean("t5", Test5.class);
		System.out.println(a5.getS1());
		System.out.println(a5.getS2());

		System.out.println("==================================");
		
		Test6 a6=ctx2.getBean("t6", Test6.class);
		System.out.println(a6.getS11());
		System.out.println(a6.getS22());
		
		ctx2.close();	//ctx2 컨테이너 종료
	}
}

