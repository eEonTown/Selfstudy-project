<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="login.jsp" %>

	<hr>
	<br>
	<h3>회원가입</h3>
    <form action="join.me" method="post">
        <table>
            <tr>
                <td>*아이디</td>
                <td>
                    <input type="text" name="userId" required>
                </td>
            </tr>
            <tr>
                <td>*비밀번호</td>
                <td>
                    <input type="password" name="userPwd" required>
                </td>
            </tr>
            <tr>
                <td>*이름</td>
                <td>
                    <input type="text" name="userName" required>
                </td>
            </tr>
            <tr>
                <td>*성별</td>
                <td>
                    <input type="radio" name="gender" value="남" required>남<br>
                    <input type="radio" name="gender" value="여" required>여
                </td>
            </tr>
            <tr>
                <td>이메일</td>
                <td>
                    <input type="email" name="email">
                </td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td>
                    <input type="tel" name="phone">
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit">회원가입</button>
                </td>
                <td>
                    <button type="reset">초기화</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>