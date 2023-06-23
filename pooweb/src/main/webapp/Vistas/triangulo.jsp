<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TRIANGULO</title>
</head>
<body>
    <h1>
        <center>Elegiste Rectangulo</center>
     </h1>
     <br><br>
        <center><img src="./Assets/img/triangulo.PNG" width="200px" height="200px"></a></center>
 
     <br><br><br>
        <center>Ingresa la base y altura del Triangulo para hallar el area</center>
     <br><br>

    <center><form action="servlet" method="post">
        <label>base</label>
        <input type="text" name="base">
        <label>altura</label>
        <input type="text" name="altura">
        <button type="submit" name="control" value="areatri">
            Enviar
        </button>
    </form></center>

    <br><br><br>
    <center>Ingresa la base y altura del Triangulo para hallar el Perimetro</center>
    <br><br>

    <center><form action="servlet" method="post">
        <label>base</label>
        <input type="text" name="base">
        <label>altura</label>
        <input type="text" name="altura">
        <button type="submit" name="control" value="perimetrotri">
            Enviar
        </button>
    </form></center>

</body>
</html>