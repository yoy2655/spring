package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/sol/jw/config/beans.xml"); // 로딩을
																												// 해준다
		Test t1 = ctx.getBean("t1", Test.class);
		t1.m1(); // 위빙 안되었다
		t1.m1(3); // 위빙 되었다
		t1.m1("aa");// 위빙 되었다
		t1.m1(4, 4);
		t1.m1(4, "bb");

		Test2 t2 = ctx.getBean("t2", Test2.class);
		t2.m1();

		kr.sol.jw.beans2.Test t3 = ctx.getBean("t3", kr.sol.jw.beans2.Test.class);
		t3.m1();
		// 어노테이션일때 이걸로 한다
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);
//		ctx2.close();
	}
}
