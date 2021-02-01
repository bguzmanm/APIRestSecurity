<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de Productos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

</head>

<body>
	<div class="container">
		<h1>Listado de Productos</h1>
		<a href="${pageContext.request.contextPath}/logout">Vete...</a>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre</th>
					<th scope="col">Descripción</th>
					<th scope="col">Costo</th>
					<th scope="col">Precio</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${productos}">
				<tr>
					<td><c:out value="${p.getProduct_id()}"></c:out></td>
					<td><c:out value="${p.getProduct_name()}"></c:out></td>
					<td><c:out value="${p.getDescription()}"></c:out></td>
					<td><c:out value="${p.getStandard_cost()}"></c:out></td>
					<td><c:out value="${p.getList_price()}"></c:out></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>