package co.jw.sol.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Inter2 extends HandlerInterceptorAdapter {
	// controller메서드가 호출되기 전에 호출됨
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre-Inter2");
		return true;
	}

	// controller메서드가 호출된 이후에 호출됨(view처리 수행 전에 호출됨)
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("post-Inter2");
	}

	// view처리 끝나고 응답결과가 브라우저로 전달되기 전에 호출됨
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion-Inter2");
	}
}
