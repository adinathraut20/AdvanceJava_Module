<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<spr:form action="reg.htm" method="post" commandName="user" >
		ID : <spr:input path="userId"/><br>
		User Name : <spr:input path="userName"/><br>
		Password : <spr:input type="password" path="userPass"/><br>
		Gender : <spr:radiobutton path="gender" value="male" />Male
				<spr:radiobutton path="gender" value="female" />Female<br>
		Salary : <spr:input path="salary"/><br>
		City : <spr:select path="city">
			<spr:option value="Mumbai">Mumbai</spr:option>
			<spr:option value="Pune">Pune</spr:option>
			<spr:option value="Nashik">Nashik</spr:option>
		</spr:select><br>
		<input type="submit" value="Register" >
		</spr:form>
</body>
</html>