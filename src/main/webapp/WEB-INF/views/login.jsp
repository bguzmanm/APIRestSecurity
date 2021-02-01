<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mi pulento login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
	<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>

</head>
<body>
<div class="container">
	
	<form name="loginForm"
		action="${pageContext.request.contextPath}/login" method="POST" class="form-signin">
		<%
		String error = (String) request.getAttribute("error");
		if (error != null && error.equals("true")){
			out.println("<h3 style='color:red'>ERROR DE AUTENTICACIÓN</h3>");
		}
	%>

 	    <h2 class="form-signin-heading">Autenticación</h2>
        <p>
          <label for="usr" class="sr-only">Username</label>
          <input type="text" id="usr" name="usr" class="form-control" placeholder="Username" required autofocus>
        </p>
        <p>
          <label for="psw" class="sr-only">Password</label>
          <input type="password" id="psw" name="psw" class="form-control" placeholder="Password" required>
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
      </form>
     
</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>