<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CIRCULO</title>
</head>
<body>
    <br><br><br><br><br>
    <h1>
       <center>Elegiste Circulo</center>
    </h1>
    <br><br>
       <center><img src="./Assets/img/circulo.PNG" width="200px" height="200px"></a></center>

    <br><br><br>
       <center>Ingresa el radio del circulo para hallar el area</center>
    <br><br>

    <div class="formulario">
    <center><form action="servlet" method="post">
        <label>Radio</label>
        <input type="text" name="radio">
        <button type="submit" name="control" value="areaci">
            Enviar
        </button>
    </form></center>

    <br><br><br>
    <center>Ingresa el radio para hallar el Perimetro del circulo</center>
    <br><br>

    <center><form action="servlet" method="post">
        <label>Perimetro</label>
        <input type="text" name="radio_perimetro">
        <button type="submit" name="control" value="perimetroci">
            Enviar
        </button>
    </form></center>
</div>
</body>
</html>