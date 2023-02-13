package kr.sol.jw.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {
		//xml로딩은 이걸로 한다.
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml");
		
		Test t1=ctx.getBean("x1",Test.class);
		System.out.println(t1.getS1());
		System.out.println(t1.getS2());
		System.out.println(t1.getS3());
		//t4, t5는 그냥 출력하면 된다.
		//타입이 같으면(Spring2) 싱글톤으로 못들어가고 Autowired라서 구별을 못하기 때문에 @Qualifier("t4")에 이름을 써주어야 한다.
		System.out.println(t1.getS4());
		System.out.println(t1.getS5());
		
		System.out.println("===================================================");
		
		Test2 t3=ctx.getBean("x2",Test2.class);
		System.out.println(t3.getS1());
		System.out.println(t3.getS2());
		System.out.println(t3.getS3());
		System.out.println(t3.getS4());
		
		System.out.println("===================================================");
		
		//어노테이션일때 이걸로 한다
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
		Test t2=ctx2.getBean("x1",Test.class);
		System.out.println(t2.getS1());
		System.out.println(t2.getS2());
		System.out.println(t2.getS3());
		System.out.println(t2.getS4());
		System.out.println(t2.getS5());
		
		
		ctx2.close();
	}
}

