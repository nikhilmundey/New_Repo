<!DOCTYPE html>
<html lang="en">

<head>
    <title></title>
    <!-- <link rel="stylesheet" href="app.css">
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
            <h2>Document Upload</h2>

            <form class="login-form" action="studentdoc.lti" method="post" enctype="multipart/form-data">
                <table cellspacing="5px" cellpadding="5%" ; align="center">

                    <tr>
                        <td>Domicile Certificate: </td>
                        <td><input id="dom_cert" type="file" placeholder="Domicile" name="domicileCertificatefile"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Student Photograph: </td>
                        <td><input id="student_photo" type="file" placeholder="Photo" name="studentPhotographfile"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Institute ID Card: </td>
                        <td><input id="Inst_id_card" type="file" placeholder="Institute ID Card" name="instituteIdCardfile"
                                style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>Caste Certificate: </td>
                        <td><input id="caste_cert" type="file" placeholder="Caste Certificate" name="casteCertificatefile"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Previous Year Marksheet: </td>
                        <td><input id="previous_year_marksheet" type="file" placeholder="Marksheet"
                                name="previousYearMarksheetfile" style="width: 215px;" required></td>
                    </tr>
                    <tr>
                        <td>Fee receipt: </td>
                        <td><input id="fee_receipt" type="file" placeholder="Fee receipt" name="feeReceiptfile"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Bank Passbook: </td>
                        <td><input id="bank_passbook" type="file" placeholder="Bank Passbook" name="bankPassbookfile"
                                style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Aadhar Card: </td>
                        <td><input id="aadhar" type="file" placeholder="Aadhar" name="aadharCardfile" style="width: 215px;"
                                required></td>
                    </tr>

                    <tr>
                        <td>Class 10th Marksheet: </td>
                        <td><input id="class_ten" type="file" placeholder="Class 10th Marksheet"
                                name="classTenthMarksheetfile" style="width: 215px;" required></td>
                    </tr>

                    <tr>
                        <td>Class 12th Marksheet: </td>
                        <td><input id="class_twelth" type="file" placeholder="Class 12th Marksheet"
                                name="classTwelthMarksheetfile" style="width: 215px;" required></td>
                    </tr>


                    </tr>
                    <td><button id="submit" type="submit">Submit</button></td>
                    <td><button id="reset" type="reset">Reset</button></td>
                </table>
</body>

</html>