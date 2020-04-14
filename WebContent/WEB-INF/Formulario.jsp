<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="contact_form" action="controller" id="contact_form" method="post" >
<div>
<ul>
<li> <h2>Registro de Empleados</h2> <span class="required_notification">* Datos requeridos</span> </li>
<li> <label for = "name">Codigo:</label> <input type="text" name="codigo" placeholder="1151555" required/> </li>
<li> <label for = "name">Cedula:</label> <input type="text" name="cedula" placeholder="10903648773" required/> </li>
<li> <label for = "name">Nombre:</label> <input type="text" name="nombre" placeholder="Geovany Mantilla" required/> </li>
<li> <label for = "email">Fecha Nacimiento:</label> <input type="Date" name="fechaNacimiento" placeholder="12/01/2000" required/> </li>
<li> <label for = "email">Fecha Ingreso:</label> <input type="Date" name="fechaIngreso" placeholder="12/01/2000" required/> </li>
<li> <label for = "email">Fecha Retiro:</label> <input type="Date" name="fechaRetiro" placeholder="12/01/2000" required/> </li>
<li> <button class="submit" type="submit">Registrar</button>
<li> <button class="submit" type="submit">Volver</button>

</ul>
</div>

</form>

</body>
</html>