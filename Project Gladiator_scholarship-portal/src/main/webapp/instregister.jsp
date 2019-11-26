<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title></title>
    <!-- <link rel="stylesheet" href="app.css" type="text/css"> 
	<link href="<c:url value="/resources/css/app.css" />" rel="stylesheet">-->
	
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
            <h2>Institute Registration</h2>

            <form class="login-form" action="register.lti" method="post" enctype="multipart/form-data">

                <table>
                
                    <tr>
                        <td>Institute Category :</td>
                        <td>  <select name="instituteCategory" style="width: 200px; height:35px ;align-self: left;">
                            <option value="Government">Government</option>
                            <option value="Autonomous">Autonomous</option>
                            <option value="Private">Private</option>
                           
                          </select></td>
                    </tr>

                    <tr>
                        <td>Institute Name :</td>
                        <td><input type="text" name="instituteName" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute DISE Code :</td>
                        <td><input type="text" name="instituteDISECode" pattern="[1-9]{1}[0-9]{3}" required><br></td>
                    </tr>

                    <tr>
                        <td>University name :</td>
                        <td><input type="text" name="universityName" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute Password :</td>
                        <td><input type="password" name="institutePass"><br></td>
                    </tr>

                    <tr>
                        <td>Institute Establishment Certificate :</td>
                        <td><input type="file" name="instituteEstbCertFile" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute Affiliation Certificate :</td>
                        <td><input type="file" name="instituteAffCertFile" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute location :</td>
                        <td><input type="text" name="instituteLoc" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute city :</td>
                        <td><input type="text" name="instituteCity" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute state :</td>
                        <td><input type="text" name="instituteState" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute pincode :</td>
                        <td><input type="text" name="institutePincode" pattern="[1-9]{1}[0-9]{5}" required><br></td>
                    </tr>

            

                    <tr>
                        <td><button type="submit">Submit</button></td>
                    <td> <button type="reset">Reset</button></td>
                    </tr>

                </table>

            </form>
        </div>
    </div>

</body>

</html>