<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link href="/studentmgmt/resources/css/bootstrap.css" rel="stylesheet" >
</head>
<body>

<div class="container mt-5" >
<h1>Student Registration Form</h1>
<form action="addstudentusingmodelattribute" method="post">
 <div class="mb-3">
    <label for="firstName" class="form-label">First Name</label>
    <input type="text" class="form-control" id="txtfirstName"  name="firstName" required="required" >
   </div>
   
   <div class="mb-3">
    <label for="lastName" class="form-label">Last Name</label>
    <input type="text" class="form-control" id="txtlastName" name="lastName"  required="required">
   </div>
   
   
    <div class="mb-3">
    <label for="gender" class="form-label">Gender</label>
    <input type="text" class="form-control" id="txtgender" name="gender"  required="required">
   </div>
   
   <div class="mb-3">
    <label for="mobileNo" class="form-label">MobileNo</label>
    <input type="text" class="form-control" id="txtmobileNo" name="mobileNo"  required="required" >
   </div>
   
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email"  required="required">
    </div>
    
   
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>