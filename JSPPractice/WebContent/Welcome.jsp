<%@page import="p1.DaoOperation"%>
<%@page import="p1.HospitalSchedule"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<% String uname=(String) session.getAttribute("username"); %>
<%ArrayList<HospitalSchedule> array=new ArrayList<HospitalSchedule>();
String spe=null;
String name=null;
DaoOperation dao=new DaoOperation();
array=dao.reterive(uname);
for(HospitalSchedule doc:array){
	name=doc.getName();
	spe=doc.getSpecialization();
	
}
%>
Welcome <%=name %><br><br>
Your Schedule is as follows<br><br>
Specialization : <%=spe %><br><br>
<table border="2">
<tr>
<th>Day </th>
<th>Time</th>
</tr>
<% for(HospitalSchedule doc:array){
	%>
	<tr><td><%=doc.getDay()%>
	</td>
	<td><%=doc.getTime()%>
	</td></tr><% 
}%>


</table>
</body>
</html>