<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- name�� ������Ƽ �̸��̶� ��ġ�� �ʿ�� ����.
     Model�� �ڵ������� �ƴϰ� set�޼ҵ带 �̿��ؼ� �����Ѱ��̱� �����̴�.  -->
�̸� : <input type="text" name="name" value="${requestScope.springBean.name}"><br>
���̵� : <input type="text" name="name" value="${requestScope.springBean.id}"><br>
��й�ȣ : <input type="text" name="name" value="${requestScope.springBean.pw}"><br>
�ּ� : <input type="text" name="name" value="${requestScope.springBean.adr}"><br>
</body>
</html>