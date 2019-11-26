<!DOCTYPE html>
<html lang="en">

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
            <h2>Academic Details</h2>

            <form class="login-form" action="studentacademic.lti" method="post">
                <table cellspacing="5px" cellpadding="5%" ; align="center">

                   

                    <tr>
                        <td>PRESENT COURSE: </td>
                        <td><input id="present_course" type="text" placeholder="COURSE" name="presentCourse"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>PRESENT COURSE YEAR: </td>
                        <td><input id="present_course_year" type="text" placeholder="YEAR" name="presentCourseYear"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>MODE OF STUDY: </td>
                        <td><input id="mode_of_study" type="text" placeholder="MODE" name="modeOfStudy"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>CLASS START DATE: </td>
                        <td><input id="class_start_date" type="date" placeholder="Date" name="csd"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>UNIVERSITY NAME: </td>
                        <td><input id="university_name" type="text" placeholder="UNIVERSITY NAME" name="universityName"
                                style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>PREVIOUS COURSE: </td>
                        <td><input id="previous_course" type="text" placeholder="PREVIOUS COURSE" name="previousCourse"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>PREVIOUS PASSING YEAR: </td>
                        <td><input id="previous_passing_year" type="text" placeholder="PREVIOUS PASSING YEAR"
                                name="previousPassingYear" style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>ROLL NO 10th: </td>
                        <td><input id="roll_no_tenth" type="text" placeholder="ROLL NO 10th" name="rollNoTenth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>BOARD NAME 10th : </td>
                        <td><input id="board_name_tenth" type="text" placeholder="BOARD NAME 10th" name="boardNameTenth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>PASSING YEAR 10th : </td>
                        <td><input id="passing_year_tenth" type="text" placeholder="PASSING YEAR 10th" name="passingYearTenth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>MARKS 10th : </td>
                        <td><input id="marks_tenth" type="text" placeholder="Marks 10th" name="marksTenth"
                                style="width: 215px;" required></td>
                    </tr>
                   
                    <tr>
                        <td>ROLL NO 12th: </td>
                        <td><input id="roll_no_twelth" type="text" placeholder="ROLL NO 12th" name="rollNoTwelth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>BOARD NAME 12th : </td>
                        <td><input id="board_name_twelth" type="text" placeholder="BOARD NAME 12th" name="boardNameTwelth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>PASSING YEAR 12th : </td>
                        <td><input id="passing_year_twelth" type="text" placeholder="PASSING YEAR 12th" name="passingYearTwelth"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>MARKS 12th : </td>
                        <td><input id="marks_twelth" type="text" placeholder="Marks 12th" name="marksTwelth"
                                style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>ADMISSION FEE : </td>
                        <td><input id="adm_fee" type="text" placeholder="ADMISSION FEE" name="admissionFee"
                                style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>TUITION FEE : </td>
                        <td><input id="tui_fee" type="text" placeholder="TUITION FEE" name="tuitionFee"
                                style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>OTHER FEE : </td>
                        <td><input id="other_fee" type="text" placeholder="OTHER FEE" name="otherFee"
                                style="width: 215px;" required></td>
                    </tr>
               
                    </tr>
                    <td><button  type="submit"id="submit">Submit</button></td>
                    <td><button id="reset" type="reset">Reset</button></td>
                </table>
</body>

</html>