package kr.sol.jw.model;

import javax.servlet.http.HttpServletRequest;

public class Test {
	public static int multi(HttpServletRequest request) {
		String str1 = request.getParameter("d1");
		String str2 = request.getParameter("d2"); // 파라미터 추출하는 작업

		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);

		int r = n1 * n2;
		return r;
	}
}
