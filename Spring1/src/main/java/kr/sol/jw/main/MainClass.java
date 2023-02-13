package kr.sol.jw.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.sol.jw.beans.Test;

public class MainClass {
	public static void s1() {

		// BeanFactory
		ClassPathResource c1 = new ClassPathResource("kr/sol/jw/config/beans.xml");
		XmlBeanFactory fac = new XmlBeanFactory(c1);
		Test t1 = fac.getBean("s1", Test.class);
		System.out.println(t1);

		Test t2 = fac.getBean("s1", Test.class);
		System.out.println(t2); // t1, t2는 주소값이 같다(싱글톤에서 가져옴)
	}

	public static void s2() {

		// ApplicationContext ->더 많이 쓴다
		ClassPathXmlApplicationContext c2 	= new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml"); // 아까 그 객체
		
		//생성자가 한번만 출력된다(싱글톤이라서) -> 싱글톤 아니면 생성자는 2번출력된다

		Test t1 = c2.getBean("s1", Test.class);
		System.out.println(t1);

		Test t2 = c2.getBean("s1", Test.class);
		System.out.println(t2);

		c2.close();// 컨테이너 닫기
	}

	public static void main(String[] args) {
//		s1();
		s2();
	}
}
