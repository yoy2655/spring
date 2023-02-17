package co.jw.sol.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.jw.sol.beans.User;

public class LoginInterceptor implements HandlerInterceptor {

	private User loginBean;

	public LoginInterceptor(User loginBean) {
		this.loginBean = loginBean;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (loginBean.isUserLogin() == false) {
			String str = request.getContextPath();
			response.sendRedirect(str + "/user/notlogin");
			return false;
		}
		return true;
	}
}
