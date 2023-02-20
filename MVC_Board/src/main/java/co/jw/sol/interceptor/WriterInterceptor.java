package co.jw.sol.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.jw.sol.beans.Content;
import co.jw.sol.beans.User;
import co.jw.sol.service.BoardService;

public class WriterInterceptor implements HandlerInterceptor {

	// user_idx, content_writer_idx

	// 작성자와 로그인한 사람이 다르면 not_write로 간다
	private BoardService boardService;
	private User loginBean;

	public WriterInterceptor(BoardService boardService, User loginBean) {
		// TODO Auto-generated constructor stub
		this.boardService = boardService;
		this.loginBean = loginBean;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		int con_idx = Integer.parseInt(request.getParameter("content_idx"));
		Content con = boardService.ContentInfo(con_idx);

		if (con.getContent_writer_idx() != loginBean.getUser_idx()) {
			String str = request.getContextPath();
			response.sendRedirect(str + "/board/not_write");
			return false;
		}
		return true;
	}
}
