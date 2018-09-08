<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updatet Employee Details</title>
</head>
<body>
	<h1>Update the details..</h1>
		<hr>
			<form action="updateEmployee" method="post">
		
		<br><br>
		<label>Employee id:</label>
		 <input type="number" name="empId" required />
		<br> 
		<label>Employee Name:</label> 
		<input type="text"name="empName" size="15" />
		<br> 
		<label>Employee Salary:</label>
		<input type="number" name="empSalary" size="15" /> 
		<br>
		 <label>
		 Employee
			Department:</label> <select name="empDept" required>
			<option value="">---select---</option>
			<option value="IT">IT</option>
			<option value="BU">BU</option>
			<option value="ADMIN">ADMIN</option>
			<option value="FINANCE">FINANCE</option>
			<option value="HR">HR</option>
		</select> <br> <input type="submit" value="Update" />
		</form>
		

</body>
</html>