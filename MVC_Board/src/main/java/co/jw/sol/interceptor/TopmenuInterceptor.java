package co.jw.sol.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import co.jw.sol.beans.BoardInfo;
import co.jw.sol.beans.User;
import co.jw.sol.service.TopmenuService;

public class TopmenuInterceptor implements HandlerInterceptor {

	@Autowired
	private TopmenuService topmenuService;

	@Resource(name = "loginBean")
	private User loginBean;

//	인터셉터는 자동주입으로 빈을 주입받지 못한다
//	그래서 항상 해주는 일이 
//	생성자를 만들고 ServletAppContext.java가서 주입받아야함
	public TopmenuInterceptor(TopmenuService topmenuService, User loginBean) {
		this.topmenuService = topmenuService;
		this.loginBean = loginBean;
	}

	// 1.인터셉터를 다 거치게 하는 작업
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		List<BoardInfo> topmenuList = topmenuService.getTopmenuList();

		request.setAttribute("topmenuList", topmenuList);
		// 인터셉터에 topmenuList를 담아서 보냈다.
		// 1팀, 2팀, 3팀, 4팀이 들어있다.
		request.setAttribute("loginBean", loginBean);
		// 인터셉터에 User객체를 담아서 보냈다.

		return true;
	}
}
