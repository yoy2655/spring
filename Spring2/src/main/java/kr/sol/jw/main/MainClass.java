package kr.sol.jw.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.sol.jw.beans.Test;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		
		Test t1=ctx.getBean("s1", Test.class);
		System.out.println(t1);
		
		Test t2=ctx.getBean("s1", Test.class);
		System.out.println(t2);
		
		//id가 s2인 bean객체 주소값 받아옴
		Test t3=ctx.getBean("s2", Test.class);
		System.out.println(t3);
		
		Test t4=ctx.getBean("s2", Test.class);
		System.out.println(t4);
		
		System.out.println("=========================");
		
		//객체가 2번생성되고 객체가 생성될때마다 생성자가 호출되서 생성자도 2번 생성된다
		//(scope="prototype"속성 부여)
		Test t5=ctx.getBean("s3", Test.class);
		System.out.println(t5);
	
		Test t6=ctx.getBean("s3", Test.class);
		System.out.println(t6);
		
		ctx.close();
	}
}
