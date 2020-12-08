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
	href=" http://localhost:8080/JPA-PRACTICA/diseno/css/diseno.css">
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
<title>Buscar Productos</title>

</head>
<body style="background-color: #575757;">
	<c:set var="p" scope="request" value="${telefono}" />
	<main role="main" class="container my-auto">
		<div class="row">
			<div id="registro" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                    col-12">
                    <h2 class="text-center" style="color: white; font-size: 40px">Formulario de Registro de Usuario</h2>
                    <form  class="form-group" >
                    	<div class="form-group">      
                    		<label style="color: white; font-size: 20px; padding-top: 15px" for="nombre">Nombre</label>
                            <input style="font-size: 20px" class="form-control" id="nombre" name="nombre" class="form-control" placeholder="${p.us_tel_id.nombre}">
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="apellido">Apellido</label>
                            <input style="font-size: 20px" class="form-control" id="apellido" name="apellido" class="form-control" placeholder="${p.us_tel_id.apellido}">
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="cedula">Cedula</label>
                            <input style="font-size: 20px" class="form-control" id="cedula" name="cedula" class="form-control" placeholder="${p.us_tel_id.cedula}">
                            
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="correo">Correo Electrónico</label>
                            <input style="font-size: 20px" class="form-control" id="correo" name="correo" class="form-control" placeholder="${p.us_tel_id.correo}">
                            <label style="color: white; font-size: 20px; padding-top: 8px" pxfor="contrasena">Telefono</label>
                            <input style="font-size: 20px" class="form-control" id="contrasena" name="contrasena" type="password" class="form-control" placeholder="${p.numero}">
                    	</div>
                    	<div class="form-group">
    						<INPUT onclick="window.location.href='http://localhost:8080/ChavezChamorro-EduardoIsaac-Examen/index.html'" style="font-size: 20px" type="reset" class="btn-info" value="Salir">
    					</div>
                    </form>
			</div>
		</div>
	</main>
	

</body>
</html>