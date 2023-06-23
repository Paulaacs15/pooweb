package Figuras;


public class Circulo extends Figura{
        //ATRIBUTOS 
        private double radio;

        //METODO CONSTRUCTOR VACIO
        public Circulo(){

        }
        //METODO CONTRUCTOR CON PARAMETROS 

        public Circulo(double radio) {
            super();
            this.radio = radio;
        }
        @Override
        //METODO CALCULAR AREA
        public Double calcularArea(){
            Double area;
            area=3.1416*Math.pow(radio,2);

            System.out.println("El area del circulo es "+area);
            return area;
        }

        //METODO CALCULAR PERIMETRO
        public Double calcularPerimetro(){
            Double perimetro;
            perimetro=(2*radio)*3.1416;
            return perimetro;
        }
    
    
}

