<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CM Directory</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>

	<div class="container">

		<h1>CM Directory</h1>
		<hr />

		<p>${NOTIFICATION}</p>

		<p>
			<button class="btn btn-primary"
				onclick="window.location.href = 'employee-form.jsp'">Add
				Employee</button>
		</p>

		<table class="table table-striped table-bordered">

			<tr class="thead-dark">
				<th>ID</th>
				<th>Name</th>
				<th>Qualification</th>
				<th>State</th>
				<th>End Date</th>
				<th>Party</th>
				<th>Actions</th>

			</tr>

			<c:forEach items="${list}" var="cm">

				<tr>
				<td>${cm.id}</td>
					<td>${cm.name}</td>
					<td>${cm.qualification}</td>
					<td>${cm.state}</td>
					<td>${cm.date}</td>
					<td>${cm.party}</td>
					<td>
						| <a
						href="${pageContext.request.contextPath}/CMController?action=DELETE&id=${employee.id}">Delete</a>
					</td>
				</tr>

			</c:forEach>

		</table>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>