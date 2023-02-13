<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
.st {
	color: orange;
	font-weight: bold;
}
</style>
</head>
<body>
	<form:form action="check" method="post" modelAttribute="springBean">
		<table>
			<tr>
				<td>이름</td>
				<td class="st">*</td>
				<td><input type="text" placeholder="홍길동" name="name"><br>
					<form:errors path="name" /><br></td>

			</tr>
			<tr>
				<td>주민등록번호</td>
				<td class="st">*</td>
				<td><input type="text" placeholder="111111" name="jumin1">
					- <input type="text" placeholder="1111111" name="jumin2"><br>
					<form:errors path="jumin1" /><br> <form:errors path="jumin2" /><br>
				</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td class="st">*</td>
				<td><input type="text" placeholder="aaaa" name="id"><br>
					<form:errors path="id" /><br></td>

			</tr>
			<tr>
				<td>비밀번호</td>
				<td class="st">*</td>
				<td><input type="password" placeholder="aaa" name="pwd1"><br>
					<form:errors path="pwd1" /><br></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td class="st">*</td>
				<td><input type="password" placeholder="aaa" name="pwd2"><br>
					<form:errors path="pwd2" /><br></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td></td>
				<td><input type="text" placeholder="aa@aa" name="email1"><br>
					<form:errors path="email1" /><br></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td></td>
				<td><input type="text" placeholder="1234" name="zipcode"><br>
					<form:errors path="zipcode" /><br></td>
			</tr>
			<tr>
				<td>주소</td>
				<td></td>
				<td><input type="text" placeholder="서울" name="addr1">
					<input type="text" placeholder="종로" name="addr2"><br>
					<form:errors path="addr1" /><br> 
					<form:errors path="addr2" /><br></td>

			</tr>
			<tr>
				<td>핸드폰번호</td>
				<td></td>
				<td><input type="text" placeholder="010-1234-5678" name="phone"><br>
					<form:errors path="phone" /><br></td>

			</tr>
			<tr>
				<td>직업</td>
				<td></td>
				<td><select name="job" multiple>
				<option>학생</option>
				<option>컴퓨터/인터넷</option>
				<option>언론</option>
				<option>프로그래머</option>
				</select><br>
					<form:errors path="job" /><br></td>

			</tr>
			<tr>
				<td>메일/SMS 정보 수신</td>
				<td></td>
				<td><input type="radio" name="no" value="수신">수신<input type="radio"
					name="no" value="수신거부" checked>수신거부<br> <form:errors path="no" /><br>
				</td>

			</tr>
			<tr>
				<td></td>
				<td colspan="2" style="text-align: right;"><input type="submit"
					id="join" value="회원가입"> <input type="reset" value="취소"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
</body>
</html>



