<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%int a=Integer.parseInt(request.getParameter("num1"));%>

<%for(int i=1;i<=10;i++)
{%>
<table border="1px" style="width:100px">
<tr>
<td><%=a %></td>
<td><%="*" %></td>
<td><%=i %></td>
<td><%="=" %></td>
<td><%=a*i %></td>
</tr>
</table>	
<%} %>

</body>
</html>