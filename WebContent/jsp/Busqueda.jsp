<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Buscar Usuario</title>

</head>
<body style="background-color: #575757;">

	<main role="main" class="container my-auto">
		<div class="row">
			<div id="registro" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                    col-12">
                    <h2 class="text-center" style="color: white; font-size: 40px">Busqueda De Usuario</h2>
                    <form  class="form-group" action="http://localhost:8080/ChavezChamorro-EduardoIsaac-Examen/BuscarUser" method="post">
                    	<div class="form-group">      
                    		
                            
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="telefono">Numero de Telefono</label>
                            <input style="font-size: 20px" class="form-control" id="correo" name="telefono" class="form-control" placeholder="Telefono">
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="cedula">Cedula</label>
                            <input style="font-size: 20px" class="form-control" id="correo" name="cedula" class="form-control" placeholder="Cedula">
                           
                    	</div>
                    	<div class="form-group">
    						<INPUT style="font-size: 20px" type="submit" class="btn-info" value="Buscar"> <INPUT onclick="window.location.href='http://localhost:8080/ChavezChamorro-EduardoIsaac-Examen/index.html'" style="font-size: 20px" type="reset" class="btn-info" value="Salir">
    					</div>
                    </form>
			</div>
		</div>
	</main>
</body>
</html>