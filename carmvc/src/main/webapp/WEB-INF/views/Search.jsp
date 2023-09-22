<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="CarNav.jsp"/>
      <%@page import="com.jspiders.carmvc.pojo.CarPOJO" %>
     <%@page import="java.util.List" %>
 <%
List<CarPOJO> cars = (List<CarPOJO>) request.getAttribute("cars");
CarPOJO pojo = (CarPOJO) request.getAttribute("car");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<fieldset>
			<legend>Search Cars Details</legend>
			<form action="./search" method="post">
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
				<input type="submit" value="SEARCH">
			</form>
		</fieldset>
		<%
		if (msg != null) {
		%>
		<h3><%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (pojo != null) {
		%>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>CONTACT</th>
				<th>ADDRESS</th>
			</tr>
			<tr>
				<td><%=pojo.getId()%></td>
				<td><%=pojo.getName()%></td>
				<td><%=pojo.getPrice()%></td>
				<td><%=pojo.getColor()%></td>
				<td><%=pojo.getFueltype()%></td>
			</tr>
		</table>
		<%
		}
		%>
		<h1>Search Car Page</h1>
	</div>
</body>
</html>