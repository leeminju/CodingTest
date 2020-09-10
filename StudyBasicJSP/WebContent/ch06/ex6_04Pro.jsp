<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%request.setCharacterEncoding("utf-8"); %>
<h2>입력한 숫자만큼 반복수행</h2>
<%
	int number=Integer.parseInt(request.getParameter("number"));

%>
<table border="1" width="300">
	 <thead>
            <tr>
                <th>글번호</th>
                <th>글제목</th>
                <th>글내용</th>
            </tr>
        </thead>
         <tbody>
         	<%
         	while(number>0)
         	{
         		%>
            <tr>
                <td><%=number%></td>
                <td>제목<%=number%></td>
                <td>내용<%=number%></td>
            </tr>
            <% 
				number--;
			}         
         	%>
         </tbody>
            
        
	
</table>
</body>
</html>

