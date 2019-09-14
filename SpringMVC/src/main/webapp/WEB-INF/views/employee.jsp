<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.sgic.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
heool
<%
		Employee e = (Employee)request.getAttribute("obj");

		out.println(e.getName()+" "+e.getSalary());
		List<String> ddd = (List<String>) e.getDogs() ;
		for(String d : ddd ){
			out.println(d);
		}

%>

</body>
</html>