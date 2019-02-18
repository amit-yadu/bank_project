<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--<h1>Users Registration Form</h1>
 <form:form method="post" action="save" modelAttribute="command">
	<table>
		<tr>
			<td>UserName :</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>DOB :</td>
			<td><form:input path="dob" /></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>Male <form:radiobutton path="gender" value="Male" /> Female
				<form:radiobutton path="gender" value="Female" />
			</td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td>Role :</td>
			<td><input type="text" name="role_id"></td>
		</tr>
		  
		<tr>
			<td>AddressLine-1 :</td>
			<td><input type="text" name="addressline"></td>
		</tr>
		<tr>
			<td>City :</td>
			<td><input type="text" name="city"></td>
		</tr>

		<tr>
			<td>State :</td>
			<td><input type="text" name="state"></td>
		</tr>

		<tr>
			<td>Country :</td>
			<td><input type="text" name="country"></td>
		</tr>

		<tr>
			<td>Email :</td>
			<td><input type="text" name="email"></td>
		</tr>

		<tr>
			<td>Mobile :</td>
			<td><input type="text" name="mobile"></td>
		</tr>

		<tr>
			<td>Pin :</td>
			<td><input type="text" name="pin"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form> --%>







<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.header {
	overflow: hidden;
	background-color: orange;
	padding: 20px 10px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}

.header a.active {
	background-color: dodgerblue;
	color: white;
}

.header-right {
	float: right;
}

@media screen and (max-width: 500px) {
	.header a {
		float: none;
		display: block;
		text-align: left;
	}
	.header-right {
		float: none;
	}
}

/* header close */
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 7%;
	background-color: orange;
	color: white;
	text-align: center;
}

/* footer close */
<
style>* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 70%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
	padding: 8px;
}

label {
	padding: 12px 12px 12px ;
	display: inline-block;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 40px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: left;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 30px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>
<body>

	<!-- <h2>User Registration Form</h2> -->
	<div class="header">
		<a href="#default" class="logo">Moto bank</a>
		<div class="header-right">
			<a class="active" href="#logout">logout</a>

		</div>
	</div>

	<div>
		<a>name</a>|<a>contact</a>|<a>add update</a>
	</div>

	<div class="container">
		<form:form method="post" action="save" modelAttribute="command">
			<div class="row">
				<div class="col-25">
					<label for="fname">User Name :</label>
				</div>
				<div class="col-75">
					<form:input placeholder="username" path="username" />
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="fname">DOB :</label>
				</div>
				<div class="col-75">
					<form:input placeholder="date of birth" path="dob" />
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="fname">Password :</label>
				</div>
				<div class="col-75">
					<form:input placeholder="password" path="password" />
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="fname">Gender :</label>
				</div>
				<div class="col-75">
					Male
					<form:radiobutton path="gender" value="Male" />
					Female
					<form:radiobutton path="gender" value="Female" />
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="country">User Role :</label>
				</div>
				<div class="col-75">
					<select id="country" name="role_id">
						<option>Chose Options</option>
						<option value="1">Admin</option>
						<option value="2">Manager</option>
						<option value="3">Customer</option>
						<option value="4">Clerk</option>

					</select>
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">Address Line-1 :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="addressline"
						placeholder="address line">
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">City :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="city" placeholder="city">
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">State :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="state" placeholder="state">
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">Country :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="country" placeholder="country">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="lname">Email :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="email" placeholder="email">
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">Mobile :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="mobile" placeholder="mobile">
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="lname">Pin :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="pin" placeholder="pin">
				</div>
			</div>
			<br>
			<div class="row">
				<input type="submit" value="save">
			</div>
			<br>
			<br>
		</form:form>


		<div class="footer">
			<p>© Copyright 2014, All Rights Reserved</p>
		</div>
	</div>

</body>
</html>

