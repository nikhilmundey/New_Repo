<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr>
<td>Student Id</td>
<td>Student Name</td>
<td>Click to view Full Form</td>
</tr>
<c:forEach items="${slist}" var="student">
	
		<!-- viewStudentDetails?studentId=1 -->
		<c:url var="viewDetailsUrl" value="viewStudentDetails.lti">
				<c:param name="studentId" value="${student.studentId }"></c:param>
		</c:url>

		<tr>
	
		<td><c:out value="${student.studentId}"/> </td>
		<td><c:out value="${student.studentName}"/> </td>
		<!--  <td><c:out value="${student.studentBasicDetails.fatherName}"/> </td>  Student->StudentBasicDetails-->  
		<td><a href='<c:out value="${viewDetailsUrl}" />'>View Details</a></td>
 		<td><a href="viewFullForm.lti" />View Details</a></td>
 				<tr>
	
	</c:forEach>

</table>
</body>
</html>