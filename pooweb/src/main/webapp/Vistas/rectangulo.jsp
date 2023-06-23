<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RECTANGULO</title>
</head>
<body>
        <h1>
            <center>Elegiste Rectangulo</center>
         </h1>
         <br><br>
            <center><img src="./Assets/img/RECTANGULO.PNG" width="200px" height="200px"></a></center>
     
         <br><br><br>
            <center>Ingresa el lago y ancho del Rectangulo para hallar el Area</center>
         <br><br>
     
    <center><form action="servlet" method="post">
        <label>lado</label>
        <input type="text" name="lado">
        <label>ancho</label>
        <input type="text" name="ancho">
        <button type="submit" name="control" value="areare">
            Enviar
        </button>
    </form></center>

    <br><br><br>
    <center>Ingresa el lago y ancho del Rectangulo para hallar el Perimetro</center>
    <br><br>


    <center><form action="servlet" method="post">
        <label>lado</label>
        <input type="text" name="lado">
        <label>ancho</label>
        <input type="text" name="ancho">
        <button type="submit" name="control" value="perimetrore">
            Enviar
        </button>
    </form></center>

</body>
</html>