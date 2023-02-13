package kr.sol.jw.main;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans2.Test3;
import kr.sol.jw.beans2.Test4;
import kr.sol.jw.beans3.Test5;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test4 t5=ctx.getBean("x4", Test4.class);
		System.out.println(t5);

		Test4 t6=ctx.getBean("x5", Test4.class);
		System.out.println(t6);
		
		Test5 t7=ctx.getBean(Test5.class);
		System.out.println(t7);
		
		System.out.println("====================================");
		
		//어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
		
		Test3 t3=ctx2.getBean(Test3.class);
		System.out.println(t3);
		
		Test4 t4=ctx2.getBean("a4", Test4.class);
		System.out.println(t4);
		
		Test5 t8=ctx2.getBean(Test5.class);
		System.out.println(t8);
		
		ctx2.close();	//ctx2 컨테이너 종료
	}
}

