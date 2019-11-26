<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <!--  <link rel="stylesheet" href="app.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
    <script src="app/js/app.js"></script>-->
<style>
/* @import url(https://fonts.googleapis.com/css?family=Roboto:300); */

.login-page {
  width: 700px;
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 600px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: rgb(146, 220, 250);
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: rgb(146, 220, 250);
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color:rgb(146, 220, 250);
  text-decoration: none;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  font-family: "Roboto", sans-serif;
  background: rgb(146, 220, 250);
}
</style>
</head>

<body>
    <div class="login-page">
        <div class="form">
            <h2>Student Registration</h2>

            <form  action="studentregister.lti" method="post" class="login-form" autocomplete="on">
                <h2 align="center">Fresh Student Application Form</h2>
                <table cellspacing="5px" cellpadding="5%" ; align="center">

                    <tr>
                        <td>Name:</td>
                        <td><input id="STUDENT_NAME" type="text" placeholder="AS IN MARKSHEET" name="studentName"
                                style="width: 200px;" required></td>
                    </tr>

                    <tr>
                        <td>Date Of Birth:</td>
                        <td><input type="date" id="STUDENT_DOB" name="sdob" style="height: 47px; width: 200px;" required></td>
                    </tr>

                    <tr>
                        <td>Gender:</td>
                        <td><select name="studentGender" style="width: 130px;">
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>

                            </select></td>
                    </tr>
                    <tr>
                        <td>Mobile Number:</td>
                        <td><input type="text" style="width: 200px;" name="studentMobileNo" id="STUDENT_MOBILE_NO" pattern="[1-9]{1}[0-9]{9}"
                                required></td>
                    </tr>

                    <tr>
                        <td>Email:</td>
                        <td><input type="email" name="studentEmail" style="width: 200px;" id="STUDENT_EMAIL" /></td>
                    </tr>

                    <tr>
                        <td>Institute Code:</td>
                        <td><select style="width: 200px;" name="institute.instituteCode" id="INSTITUTE_CODE">
                           <c:forEach items="${insdetails}"  var ="institute">
                        
                           <option value="${institute.getInstituteCode()}">${institute.getInstituteName()}</option>
                           </c:forEach>
                           </select>
                    </td>
                    </tr>

                    <tr>
                        <td>Aadhar Number:</td>
                        <td><input type="text" style="width: 200px;" name="studentaadhar" id="STUDENT_IAADHAR_NO" pattern="[1-9]{1}[0-9]{11}" required/>
                        </td>
                    </tr>
                    <tr>
                        <td>Set your Password:</td>
                        <td><input type="password" style="width: 200px;" name="studentPassword" id="STUDENT_PASSWORD" />
                        </td>
                    </tr>
                    <tr>
                        <td>State:</td>
                        <td><input type="text" style="width: 200px;" name="studentState" id="STUDENT_STATE" /></td>
                    </tr>
                    <tr>
                        <td>District:</td>
                        <td><input type="text" style="width: 200px;" name="studentDistrict" id="STUDENT_DISTRICT" /></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" value="confirm">
                        </td>
                        <td>ALL THE INFORMATION FURNISHED BY ME <br> IS TRUE TO
                            BEST OF MY KNOWLEDGE.
                        </td>
                    </tr>
                    <td><button id="submit" type="submit">Submit</button></td>
                    <td><button id="reset" type="reset">Reset</button></td>
                </table>
        </div>
        </form>
</body>
</html>