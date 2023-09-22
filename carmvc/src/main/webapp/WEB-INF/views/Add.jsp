<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:include page="CarNav.jsp"/>
     <%
String msg = (String) request.getAttribute("msg");
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
			<legend>Add Car Details</legend>
			<form action="" method="post">
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><input type="text" name="price"></td>
					</tr>
					<tr>
						<td>Color</td>
						<td><input type="text" name="color"></td>
					</tr>
					<tr>
						<td>FuelType</td>
						<td><input type="text" name="fueltype"></td>
					</tr>
				</table>
				<input type="submit" value="ADD">
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
	</div>
</body>
</html>