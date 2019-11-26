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

	<div class="login-page">
		<div class="form">
		
		
		
		<td><c:out value="${student.studentId}"/> </td>
		<td><c:out value="${student.studentName}"/> </td>
		
		
		
		
			<form action="" method="post" class="login-form"
				autocomplete="on">
				<h2 align="center">Details of Student</h2>
				
				<table cellspacing="5px" cellpadding="5%" ; align="center">

					<tr>
						<td>Name:</td>
						<td><input id="STUDENT_NAME" type="text"
							placeholder="AS IN MARKSHEET" name="studentName"
							style="width: 200px;" value="${student.studentName}"></td>



						<td>Date Of Birth:</td>
						<td><input type="date" id="STUDENT_DOB" name="sdob"
							style="height: 47px; width: 200px;" required></td>
					</tr>


					<tr>
						<td>Gender:</td>
						<td><select name="studentGender" style="width: 130px;">
								<option value="Male">Male</option>
								<option value="Female">Female</option>

						</select></td>


						<td>Mobile Number:</td>
						<td><input type="text" style="width: 200px;"
							name="studentMobileNo" id="STUDENT_MOBILE_NO"
							pattern="[1-9]{1}[0-9]{9}" required></td>
					</tr>

					<tr>
						<td>Email:</td>
						<td><input type="email" name="studentEmail"
							style="width: 200px;" id="STUDENT_EMAIL" /></td>

						<td>Institute Code:</td>
						<td><select style="width: 200px;"
							name="institute.instituteCode" id="INSTITUTE_CODE">
								<c:forEach items="${insdetails}" var="institute">

									<option value="${institute.getInstituteCode()}">${institute.getInstituteName()}</option>
								</c:forEach>
						</select></td>
					</tr>

					<tr>
						<td>Aadhar Number:</td>
						<td><input type="text" style="width: 200px;"
							name="studentaadhar" id="STUDENT_IAADHAR_NO"
							pattern="[1-9]{1}[0-9]{11}" required /></td>


						<td>State:</td>
						<td><input type="text" style="width: 200px;"
							name="studentState" id="STUDENT_STATE" /></td>
					</tr>

					<tr>
						<td>District:</td>
						<td><input type="text" style="width: 200px;"
							name="studentDistrict" id="STUDENT_DISTRICT" /></td>

						<td>Community :</td>
						<td><input type="text" name="community"
							 value="${StudentBasicDetails.community}" /></td>
					</tr>

					<tr>
						<td>Religion :</td>
						<td><input type="text" name="religion" placeholder="Religion"
							required /></td>

						<td>Father's Name:</td>
						<td><input type="text" name="fatherName"
							placeholder="Father's Name" required /></td>
					</tr>

					<tr>
						<td>Father's Profession :</td>
						<td><input type="text" name="fatherProfession"
							placeholder="Father's Profession" required /></td>

						<td>Father's Income :</td>
						<td><input type="text" name="fatherIncome"
							placeholder="Father's Income" required /></td>
					</tr>




					<tr>
						<td>Mother's Name :</td>
						<td><input type="text" name="motherName"
							placeholder="Mother's Name" required /></td>

						<td>Mother's Profession :</td>
						<td><input type="text" name="motherProfession"
							placeholder="Mother's Profession" required /></td>
					</tr>

					<tr>
						<td>Marital Status :</td>
						<td><select name="maritalStatus"
							style="width: 200px; height: 35px; align-self: left;">
								<option value="married">Married</option>
								<option value="Single">Single</option>

						</select></td>

						<td>Disability :</td>
						<td><select name="isDisabled"
							style="width: 200px; height: 35px; align-self: left;">
								<option value="Yes">Yes</option>
								<option value="no">No</option>
						</select></td>
					</tr>

					<tr>
						<td>Disability Type :</td>
						<td><input type="text" name="typeOfDisability"
							placeholder="Disability Type"></td>

						<td>Locality :</td>
						<td><input type="text" name="locality" placeholder="Locality"
							required /></td>
					</tr>

					<tr>
						<td>City</td>
						<td><input type="text" name="city" placeholder="City"
							required /></td>
						<td>State</td>
						<td><input type="text" name="state" placeholder="State"
							required /></td>
					</tr>

					<tr>
						<td>Pincode :</td>
						<td><input type="text" name="pincode" placeholder="Pincode"
							pattern="[0-9]{1}[0-9]{5}" required /></td>
					
						<td>Institute name:</td>
						<td><input id="inst_name" type="text" placeholder="NAME"
							name="instituteName" style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>Present course:</td>
						<td><input id="present_course" type="text"
							placeholder="COURSE" name="presentCourse" style="width: 215px;"
							required></td>
					
						<td>Present course year:</td>
						<td><input id="present_course_year" type="date"
							placeholder="YEAR" name="presentCourseYear" style="width: 215px;"
							required></td>
					</tr>

					<tr>
						<td>Mode of study:</td>
						<td><input id="mode_of_study" type="text" placeholder="MODE"
							name="modeOfStudy" style="width: 215px;" required></td>
					
						<td>Class start date:</td>
						<td><input id="class_start_date" type="date"
							placeholder="YEAR" name="classStartDate" style="width: 215px;"
							required></td>
					</tr>

					<tr>
						<td>UNIVERSITY NAME:</td>
						<td><input id="university_name" type="text"
							placeholder="UNIVERSITY NAME" name="universityName"
							style="width: 215px;" required></td>
					
						<td>PREVIOUS COURSE:</td>
						<td><input id="previous_course" type="text"
							placeholder="PREVIOUS COURSE" name="previousCourse"
							style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>PREVIOUS PASSING YEAR:</td>
						<td><input id="previous_passing_year" type="date"
							placeholder="PREVIOUS PASSING YEAR" name="previousPassingYear"
							style="width: 215px;" required></td>
					
						<td>ROLL NO 10th:</td>
						<td><input id="roll_no_tenth" type="text"
							placeholder="ROLL NO 10th" name="rollNoTenth"
							style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>BOARD NAME 10th :</td>
						<td><input id="board_name_tenth" type="text"
							placeholder="BOARD NAME 10th" name="boardNameTenth"
							style="width: 215px;" required></td>
					
						<td>PASSING YEAR 10th :</td>
						<td><input id="passing_year_tenth" type="text"
							placeholder="PASSING YEAR 10th" name="passingYearTenth"
							style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>MARKS 10th :</td>
						<td><input id="marks_tenth" type="text"
							placeholder="Marks 10th" name="marksTenth" style="width: 215px;"
							required></td>
					
						<td>ROLL NO 12th:</td>
						<td><input id="roll_no_twelth" type="text"
							placeholder="ROLL NO 12th" name="rollNoTwelth"
							style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>BOARD NAME 12th :</td>
						<td><input id="board_name_twelth" type="text"
							placeholder="BOARD NAME 12th" name="boardNameTwelth"
							style="width: 215px;" required></td>
					
						<td>PASSING YEAR 12th :</td>
						<td><input id="passing_year_twelth" type="text"
							placeholder="PASSING YEAR 12th" name="passingYearTwelth"
							style="width: 215px;" required></td>
					</tr>

					<tr>
						<td>MARKS 12th :</td>
						<td><input id="marks_twelth" type="text"
							placeholder="Marks 12th" name="marksTwelth" style="width: 215px;"
							required></td>
					
						<td>ADMISSION FEE :</td>
						<td><input id="adm_fee" type="text"
							placeholder="ADMISSION FEE" name="admissionFee"
							style="width: 215px;" required></td>
					</tr>
					<tr>
						<td>TUITION FEE :</td>
						<td><input id="tui_fee" type="text" placeholder="TUITION FEE"
							name="tuitionFee" style="width: 215px;" required></td>
					
						<td>OTHER FEE :</td>
						<td><input id="other_fee" type="text" placeholder="OTHER FEE"
							name="otherFee" style="width: 215px;" required></td>
					</tr>


				</table>
		
			</form> 
			
			
			
		</div>
	</div>

</body>
</html>