<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Employees</title>
</head>
<body>

	<h3 style="color: red;">Show All Users</h3>
	<ul>
		<c:forEach var="listValue" items="${users}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>