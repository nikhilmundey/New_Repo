<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
		
		
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: rgb(146, 220, 256);
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* .topnav a.active {
  background-color: #4CAF50;
  color: white;
} */
</style>
</head>


<body>
<div class="topnav">

  <a href="basic.jsp">BASIC DETAILS</a>  
  <a href="studAcademic.jsp">ACADEMIC DETAILS</a> 
  <a href="bank.jsp">BANK DETAILS</a>
  <a href="stdDoc.jsp">DOCUMENT UPLOADS</a> 
</div>

<div style="padding-left:16px">
  <h3>Please complete your details </h3>
</div>
Welcome, ${sessionScope.student.studentName}

</body>
</html>
