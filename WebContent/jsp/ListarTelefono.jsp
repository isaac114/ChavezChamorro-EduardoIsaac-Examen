<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
	<!-- Google Fonts -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
	<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
	<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css"
	rel="stylesheet">
<title>Listar Telefonos</title>
</head>
<body style="background-color: #575757; padding: 50px;" >
	<c:set var="p" scope="request" value="${lista}" />
	<table class="table table-striped" style="padding: 50px;">
		<tr>
				<td style="color: white; font-size: 25px" scope="col"><strong>Usuario</strong></td>
				<td style="color: white; font-size: 25px" scope="col"><strong>Telefono</strong></td>
				<td style="color: white; font-size: 25px" scope="col"><strong>Tipo</strong></td>
				<td style="color: white; font-size: 25px" scope="col"><strong>Operadora</strong></td>
		</tr>
		<c:forEach var="p" items="${lista}">
			<tr scope="row">
				<td style="color: white; font-size: 20px">${p.us_tel_id.nombre} ${p.us_tel_id.apellido}</td>
				<td style="color: white; font-size: 20px">${p.numero}</td>
				<td style="color: white; font-size: 20px">${p.tt_tel_id.nombre}</td>
				<td style="color: white; font-size: 20px">${p.op_tel_id.nombre}</td>
			</tr>
		</c:forEach>
	</table>
	<INPUT onclick="window.location.href='http://localhost:8080/ChavezChamorro-EduardoIsaac-Examen/index.html'" style="font-size: 20px" type="reset" class="btn-info" value="Salir">
</body>
</html>