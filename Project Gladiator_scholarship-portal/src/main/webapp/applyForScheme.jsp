<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <link rel="stylesheet" href="app.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
    <script src="app/js/app.js"></script>

<style>

@import url(https://fonts.googleapis.com/css?family=Roboto:300);

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

/* for applyForScheme.html */
.column {
  float: left;
  width: 33.33%;
  
  
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

.row1::before {
  content: "";
  display: table;
  clear: both;
}

</style>
</head>

<body>
    <div class="login-page">
        <div class="form">
            <h2>Apply For Scheme</h2>

            <form action="selectscheme.lti" method="post" class="login-form" autocomplete="on">
                <h2 align="center"></h2>

                <div class="row">

                    <div class="column">

                        Scheme 1:</br>
                        Post Matric Scholarship</br>
                        <p><b>Eligibility Criteria :</b> </br>
                            <ol>
                                <li align=left>Caste/Category such as SC/ ST/ OBC or other minorities.</li>
                                <li align=left>The candidates applying for this Scholarship 2019-2020
                                    must have completed 10th and 12th from a recognized board with a minimum 
                                    of 60% marks in aggregate.</li>
                                <li align=left>Maximum two members
                                    of a family belonging to the minority category can apply for
                                    the scholarship.</li>
                                <li align=left>Students applying for this Scholarship 
                                    2019-2020 must have Aadhaar Card enrolled in the State.</li>
                                <li align=left>The applicant must produce all the documents prescribed
                                    by the state.</li>
                            </ol>
                        </p>
                    </div>
                    <div class="column">
                        Scheme 2:<br>
                        Pragati Scholarship</br>
                        <p><b>Eligibility Criteria :</b> </br>
                            <ol>
                                <li align=left>'One Girl' per family and it can be extended for Two Girl Child per
                                    family
                                    where the family income is less than Rs. 8 Lakh /annum (In case of married girl
                                    child,
                                    the income of parents/ in laws whichever is higher is to be considered).</li>
                                <li align=left>The selection of candidate will be made on merit on the basis of
                                    qualifying
                                    examination to persue the respective Technical Degree/Diploma course from any of
                                    the AICTE approved institution. Amount of scholarship: Tuition Fee of Rs. 30,000/-
                                </li>
                            </ol>
                        </p>
                    </div>
                    <div class="column">
                        Scheme 3:<br>
                        National Merit Scholarship</br>
                        <p><b>Eligibility Criteria :</b> </br>
                            <ol>
                                <li align=left>Candidates must be an Indian national.</li>
                                <li align=left>A minimum of 60% marks Class IX is required.</li>
                                <li align=left>SC, ST and PH candidates will need 55% marks in Class IX.</li>
                                <li align=left>Candidate must be studying in a recognized school in their respective
                                    State.</li>
                            </ol>

                        </p>
                    </div>
                    <div class="row1">
                        <tr>
                            <td><b>Select Scheme to Apply:</b></td>
                            <td><select name="scheme.schemeId"  id="SCHEME_ID" style="width: 200px; height: 40px; border-color:black;">
                                        <c:forEach items="${schemelist}" var="scheme">
                                        <option value="${scheme.getSchemeId()}">${scheme.getSchemeName()}</option> 
										</c:forEach>                                
                                </select></td><br><br>
                        </tr>
                        <tr>
                            <td><button type="submit" value="Submit"
                                    style="height: max-content; width: min-content;"
                                    >Submit</button></td>
                        </tr>
                    </div>
                </div>


        </div>
        </form>
</body>

</html>