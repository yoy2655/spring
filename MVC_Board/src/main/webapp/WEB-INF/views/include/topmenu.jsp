<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- c:url var='root' value='/'를 바꿈 --%>
<c:set var="root" value="${pageContext.request.contextPath }/" />

<nav
	class="navbar navbar-expand-md bg-dark text-white fixed-top shadow-lg">
	<a class="navbar-brand" href="${root }main">화이팅♥</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navMenu">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navMenu">
		<ul class="navbar-nav">
			<c:forEach var='obj' items='${topmenuList }'>
				<a href="${root }board/main?board_info_idx=${obj.board_info_idx}"
					class="nav-link">${obj.board_info_name }</a>
			</c:forEach>
		</ul>
		<ul class="navbar-nav ml-auto">
			<c:choose>
				<c:when test="${loginBean.userLogin==true}"><!-- 로그인 성공했을때 -->
					<li class="nav-item"><a href="${root }user/modify" class="nav-link">정보수정</a></li>
					<li class="nav-item"><a href="${root }user/logout" class="nav-link">로그아웃</a></li>				
				</c:when>
				
				<c:otherwise><!-- 로그인 실패했을때 -->
				<li class="nav-item"><a href="${root }user/login" class="nav-link">로그인</a></li>
				<li class="nav-item"><a href="${root }user/join" class="nav-link">회원가입</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</nav>

<!-- 
	절대경로로 넣게 되면 새로운 요청이 발생했을 때
	localhost:8080 주소만 남음
	
	그 뒤에 href="/MVC2/main"만 남기 때문에
	하위경로가 어떻게 되어있던 관계없이
	원하는 페이지를 직접요청할 수 있다.
	c:url value="/ex/jsp/view.jsp" var="root"
	
	c:url var='root' value='/' : /주소를 포함한 절대경로를 포함하게 된다.
	c:url...을 쓰는 이유는 
	1. ContextPath를 자동으로 포함시킴
	2. 쿠키사용을 금지하면 로그인 유지가 힘들어진다. 이때 세션을 유지하깅 ㅟ해 링크 뒤에 
	특정값{sessionId}를 부여해줘서 로그인을 유지해준다.
 -->