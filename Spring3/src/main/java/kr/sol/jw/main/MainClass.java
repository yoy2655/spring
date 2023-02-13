package kr.sol.jw.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.beans.Test3;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");

		Test t1 = ctx.getBean("s1", Test.class);
		System.out.println(t1);

		System.out.println("=============================");

		Test2 t2 = ctx.getBean("s2", Test2.class);
		System.out.println(t2);

		System.out.println("=============================");
		Test3 t3 = ctx.getBean("s3", Test3.class);
		System.out.println(t3); // Test3 init호출(위에서 호출된게 아니고 bean에서 호출된 init-method가 우선순위가 위다)

		ctx.close();
	}
}
