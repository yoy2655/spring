package kr.sol.jw.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Ad {

	@Before("execution(* m1())")	//모든 타입의 m1함수가 관심사이다. m1이 실행되기전에 before를 실행하겠다.
	@Order(1)
	public void beforeMethod() {
		System.out.println("before");
	}
	
	//aspectJ 어노테이션이라고 하고 인식하기 위해서는 <aopLaspectj-autoproxy/>를 지정해주어야 한다.
	
	@After("execution (* m1())")
	public void afterMethod() {
		System.out.println("after");
	}
	
	@Around("execution(* m1())")
	public Object aroundMethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("around1");
		Object o=p.proceed();
		System.out.println("around2");
		return o;
	}
	
	@AfterReturning("execution(* m1())")
	public void afterReturn() {
		System.out.println("afterReturn");
	}
	
	@AfterThrowing("execution(* m1())")
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}
	//원래 aop에서 정의한 순서 : around -> before -> afterthrow -> afterreturn -> after -> around
	//동작순서를 보장하지는 않기 때문에 @Order(1)어노테이션으로 동작순서를 보장해줄수있다
	//around, @Order어노테이션은 애매하기때문에 많이 쓰이지는 않는다..
}
