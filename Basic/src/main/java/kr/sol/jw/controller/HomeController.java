package kr.sol.jw.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.sol.jw.model.Test;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String url = request.getRequestURI();// 요청한 리퀘스트를 가져오는 작업
		String name = null;

		if (url.contains("main.mvc")) {
			name = "main.jsp";
		} else if (url.contains("test1.mvc")) {
			String str1 = request.getParameter("d1");
			String str2 = request.getParameter("d2"); // 파라미터 추출하는 작업

			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);

			int r = n1 + n2;
			request.setAttribute("r", r);

			name = "test1.jsp";
		} else if (url.contains("test2.mvc")) {
			int r = Test.multi(request);

			request.setAttribute("r", r);
			name = "test2.jsp";
		}
		RequestDispatcher dis = request.getRequestDispatcher(name);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
