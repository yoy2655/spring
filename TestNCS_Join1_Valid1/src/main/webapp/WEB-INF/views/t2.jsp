<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>success!!!!!!</h3><br>
이름: ${springBean.name }<br>
주민등록번호: ${springBean.jumin1 }-${springBean.jumin2 }<br>
id: ${springBean.id }<br>
pw1: ${springBean.pwd1 }<br>
pw2: ${springBean.pwd2 }<br>
이메일: ${springBean.email1 }<br>
우편번호: ${springBean.zipcode }<br>
주소: ${springBean.addr1 } ${springBean.addr2 }<br>
핸드폰번호: ${springBean.phone }<br>
직업: ${springBean.job }<br>
메일/SMS 정보 수신: ${springBean.no }<br>
</body>
</html>