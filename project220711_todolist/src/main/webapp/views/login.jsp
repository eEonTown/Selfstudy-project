<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.yh.user.model.vo.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String contextPath = request.getContextPath();
	User user = (User)session.getAttribute("user");
	String errorMsg = (String)request.getAttribute("fail");
	String succesMsg = (String)request.getAttribute("succes");
%>

	<% if(errorMsg != null){ %>
		<script>
			alert("<%= errorMsg %>");
		</script>
		<% request.removeAttribute("fail"); %>
	<% } else if(succesMsg != null){%>
		<script>
			alert("<%= succesMsg %>");
		</script>
		<% request.removeAttribute("succes"); %>
	<% } %>
	
	<% if(user == null){ %>
	    <form action="<%= contextPath %>/login.me" method="post">
	        <table>
	            <tr>
	                <td>아이디</td>
	                <td>
	                    <input type="text" name="userId" required>
	                </td>
	            </tr>
	            <tr>
	                <td>비밀번호</td>
	                <td>
	                    <input type="password" name="userPwd" required>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <button type="submit">로그인</button>
	                </td>
	                <td>
	                    <button type="button" onclick="join();">회원가입</button>
	                </td>
	            </tr>
	        </table>
	    </form>
	<% }else { %>
	    <div class="login">
	        <br><br>
	        <b><%= user.getUserName() %></b>님 환영합니다.
	    </div>
    <% } %>
    
    <script>
    	function join(){
    		location.href="<%= contextPath %>/regist.me";
    	}
    </script>
</body>
</html>