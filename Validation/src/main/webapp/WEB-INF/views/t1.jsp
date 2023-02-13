<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- error가 나면 errors라는 객체에 담아진다.
	 defaultMessage에서 메세지를 띄워준다. -->
	<form action="check" method="post">
		d1 : <input type="text" name="d1"><br>
		<sp:hasBindErrors name="springBean">
			<c:if test="${errors.hasFieldErrors('d1')}">
			${errors.getFieldError('d1').defaultMessage}<br>
			</c:if>
		</sp:hasBindErrors>

		d2 : <input type="text" name="d2"><br>
		<sp:hasBindErrors name="springBean">
			<c:if test="${errors.hasFieldErrors('d2')}">
			${errors.getFieldError('d2').defaultMessage}<br>
			</c:if>
		</sp:hasBindErrors>

		<button type="submit">check</button>

	</form>
</body>
</html>