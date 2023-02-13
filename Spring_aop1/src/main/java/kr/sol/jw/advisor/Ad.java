package kr.sol.jw.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Ad {

	public void beforemethod() {
		System.out.println("before");
	}
	public void aftermethod() {
		System.out.println("after");
	}
	
	public Object aroundmethod(ProceedingJoinPoint p) throws Throwable{
		System.out.println("around1");	
		//관심사 메소드 전후에 나오는 메소드인데 시점이 애매하다
		//그래서 ProceedingJoinPoint를 실행한다.
		
		Object obj=p.proceed();
		
		System.out.println("around2");
		//around2나오고 after나온다
		
		return obj;
	}
	public void afterReturningmethod() {
		System.out.println("afterreturn");
	}
	public void afterThrowingmethod(Throwable e) {	//에러가 난 이후에 등록한다
		System.out.println("throw");
		System.out.println(e);
	}
}
