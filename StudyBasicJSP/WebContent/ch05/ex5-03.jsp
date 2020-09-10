<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예제3</title>
</head>
<body>
<%!
String name="이민주";
String getName()
{
	return name;
}
%>

<%
String hobby="드라마 보기";
%>

내 이름은 <%=getName() %>이고 <br>
내 취미는 <%=hobby %>이다.

</body>
</html>
