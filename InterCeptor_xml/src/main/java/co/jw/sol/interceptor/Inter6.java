package co.jw.sol.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Inter6 implements HandlerInterceptor {

	// controller메서드가 호출되기 전에 호출됨
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre-Inter6");
		return true;
	}

	// controller메서드가 호출된 이후에 호출됨(view처리 수행 전에 호출됨)
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("post-Inter6");
	}

	// view처리 끝나고 응답결과가 브라우저로 전달되기 전에 호출됨
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion-Inter6");
	}

}
