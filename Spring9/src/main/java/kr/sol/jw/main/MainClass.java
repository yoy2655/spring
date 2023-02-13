package kr.sol.jw.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import kr.sol.jw.beans.Test;
import kr.sol.jw.beans.Test2;
import kr.sol.jw.config.Beans;

public class MainClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(Beans.class);

		Test t1 = ctx2.getBean("t1", Test.class);
		System.out.println(t1.getS1());
		System.out.println(t1.getS2());
		System.out.println(t1.getS3());

		System.out.println("=========================================");
		Test t2 = ctx2.getBean("t2", Test.class);
		System.out.println(t1.getS1());
		System.out.println(t1.getS2());
		System.out.println(t1.getS3());

		System.out.println("=========================================");
		Test2 t3 = ctx2.getBean("a3", Test2.class);
		System.out.println(t3.getS1());
		System.out.println(t3.getS2());

		ctx2.close();
	}
}
