<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Assets/css/estilos.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FIGURAS</title>
</head>
<body>
    <br><br><br><br><br>
   <h1>
      <center>BIENVENIDO</center>
      <center>Elige una figura a la que deseas encontrar el area o perimetro</center>

   </h1>
   <br><br><br><br><br>
    <div class="div1">
       <a href="servlet?control=circulo">
         <img src="./Assets/img/circulo.PNG" width="200px" height="200px"></a>
        <p>CIRCULO</p>
    </div>

    <div class="div2">
        <a href="servlet?control=triangulo">
         <img src="./Assets/img/triangulo.PNG" width="200px" height="200px"></a>
         <p>TRIANGULO</p>
     </div>

     <div class="div3">
        <a href="servlet?control=rectangulo">
         <img src="./Assets/img/RECTANGULO.PNG" width="200px" height="200px"></a>
         <p>RECTANGULO</p>
     </div>

     <div class="div4">
        <a href="servlet?control=pentagono">
         <img src="./Assets/img/pentagono.PNG" width="200px" height="200px"></a>
         <p>PENTAGONO</p>
     </div>

</body>
</html>
