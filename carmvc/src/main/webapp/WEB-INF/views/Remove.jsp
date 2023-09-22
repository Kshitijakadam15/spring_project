<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.jspiders.carmvc.pojo.CarPOJO" %>
     <%@page import="java.util.List" %>
     <jsp:include page="CarNav.jsp"/>
     <%
String msg = (String) request.getAttribute("msg");
%>
 <%
List<CarPOJO> cars = (List<CarPOJO>)request.getAttribute("cars");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}
</style>
</head>
<body>
<div align="center">
		<fieldset>
			<legend></legend>
			<form action="./remove" method="post">
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
				<input type="submit" value="REMOVE">
			</form>
		</fieldset>
		<%
		if (msg != null) {
		%>
		<h3>
			<%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (cars != null) {
		%>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
				<th>COLOR</th>
				<th>FUELTYPE</th>
			</tr>
			<%
			for (CarPOJO pojo : cars) {
			%>
			<tr>
				<td><%=pojo.getId()%></td>
				<td><%=pojo.getName()%></td>
				<td><%=pojo.getPrice()%></td>
				<td><%=pojo.getColor()%></td>
				<td><%=pojo.getFueltype()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>
	</div>
</body>
</html>