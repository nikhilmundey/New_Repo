<!DOCTYPE html>
<html>
  <head>
    <title></title>
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
      <h2>BASIC DETAILS</h2>

    <form class="login-form" action="studentbasic.lti" method="post">
      <input type="text" name="community" placeholder="Community" required/>
      <input type="text" name="religion" placeholder="Religion" required/>
      <input type="text" name="fatherName" placeholder="Father's Name" required/>
      <input type="text" name="fatherProfession" placeholder="Father's Profession" required/>
      <input type="text" name="fatherIncome" placeholder="Father's Income"  required/>
      <input type="text" name="motherName" placeholder="Mother's Name" required/>
      <input type="text" name="motherProfession" placeholder="Mother's Profession" required/>
<table>
      <tr>
          <td>Marital Status :</td>
          <td>  <select name="maritalStatus" style="width: 200px; height:35px ;align-self: left;">
              <option value="married">Married</option>
              <option value="Single">Single</option>
          
            </select></td>
      </tr>
      <tr>
          <td>Disability :</td>
          <td>  <select name="isDisabled" style="width: 200px; height:35px ;align-self: left;">
              <option value="Yes">Yes</option>
              <option value="no">No</option>
            </select></td>
      </tr>
 </table>
      <input type="text" name="typeOfDisability" placeholder="Disability Type" >
      <input type="text" name="locality" placeholder="Locality" required/>
      <input type="text" name="city" placeholder="City" required/>
      <input type="text" name="state" placeholder="State" required/>
      <input type="text" name="pincode" placeholder="Pincode" pattern="[0-9]{1}[0-9]{5}" required/>
      
      <button type="submit" id="submit">Next</button>
      <!--onclick="window.location.href='bank.html'" -->
    </form>
  </div>
</div>
</body>
</html>