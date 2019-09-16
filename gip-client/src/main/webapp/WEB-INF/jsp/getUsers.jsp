<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h3 style="color: red;">Add New Employee</h3>

	<div id="addUser">
		<form:form action="http://localhost:9091/oauth/authorize"
			method="post" modelAttribute="user">
			<p>
				<label>Enter Employee Id</label>
				 <input type="text" name="response_type" value="code" /> 
				 <input type="text" name="client_id" value="juliana" />
				 <input type="text" name="redirect_uri" value="http://localhost:9091/showUsers" />
				 <input type="text" name="scope" value="read" /> 
				 <input type="SUBMIT" value="Get Users info" />
		</form:form>
	</div>
</body>
</html>
