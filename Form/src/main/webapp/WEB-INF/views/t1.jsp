<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- name은 프로퍼티 이름이랑 일치할 필요는 없다.
     Model로 자동주입이 아니고 set메소드를 이용해서 저장한것이기 때문이다.  -->
이름 : <input type="text" name="name" value="${requestScope.springBean.name}"><br>
아이디 : <input type="text" name="name" value="${requestScope.springBean.id}"><br>
비밀번호 : <input type="text" name="name" value="${requestScope.springBean.pw}"><br>
주소 : <input type="text" name="name" value="${requestScope.springBean.adr}"><br>
</body>
</html>