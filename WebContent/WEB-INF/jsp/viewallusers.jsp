
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {box-sizing: border-box;}

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
   height:7%;
   background-color: orange;
   color: white;
   text-align: center;
}

/* footer close */

<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 25%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
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
  padding: 20px;
}

.col-25 {
  float: left;
  width: 15%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 85%;
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
    <a class="active" href="logout">logout</a>
    
  </div>
</div>

<div>
		 <a href="customerform">Add New Users</a>  
		|<a>contact</a>|<a>add update</a>
	</div>
<div class="container">

 <h1>Users List</h1>  
    <table border="2" width="70%" cellpadding="2">  
    <tr><th>Id</th><th>Name</th><th>Password</th><th>DOB</th><th>Gender</th><th>Edit</th><th>Delete</th></tr>  
       <c:forEach var="usr" items="${list}">   
       <tr>  
       <td>${usr.id}</td>  
       <td>${usr.username}</td>  
       <td>********</td>  
       <td>${usr.dob}</td>  
       <td>${usr.gender}</td>  
       
       <td><a href="edituser/${usr.id}">Edit</a></td>  
       <td><a href="deleteuser/${usr.id}">Delete</a></td>  
       </tr>  
       </c:forEach>  
       </table>  
       <br/>  
       <a href="customerform">Add New Users</a>  





</div>
<div class="footer">
  <p> © Copyright 2019, All Rights Reserved</p>
</div>
<br>
<br>

</body>
</html>

