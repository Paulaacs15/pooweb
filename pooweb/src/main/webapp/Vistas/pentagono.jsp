<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PENTAGONO</title>
</head>
<body>
    <br><br><br><br><br>
    <h1>
       <center>Elegiste Pentagono</center>
    </h1>
    <br><br>
       <center><img src="./Assets/img/pentagono.PNG" width="200px" height="200px"></a></center>

    <br><br><br>
       <center>Ingresa los lados y apotema del Pentagono para hallar el area</center>
    <br><br>

    <center><form action="servlet" method="post">
        <label>lados</label>
        <input type="text" name="lados">
        <label>apotema</label>
        <input type="text" name="apotema">
        <button type="submit" name="control" value="areape">
            Enviar
        </button>
    </form></center>

    <br><br><br>
    <center>Ingresa el radio para hallar el Perimetro del Pentagono</center>
    <br><br>


    <center><form action="servlet" method="post">
        <label>lados</label>
        <input type="text" name="lados">
        <label>apotema</label>
        <input type="text" name="apotema">
        <button type="submit" name="control" value="perimetrope">
            Enviar
        </button>
    </form></center>
</body>
</html>