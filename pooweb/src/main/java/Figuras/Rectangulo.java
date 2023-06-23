package Figuras;

public class Rectangulo extends Figura{
    
        //ATRIBUTOS
        private double lado;
        private double ancho;
    
        //METODO CONSTRUCTOR VACIO
        public Rectangulo(){

    }
        //METODO CONSTRUCTOR CON PARAMETROS
        public Rectangulo(double lado, double ancho) {
        super();
        this.lado = lado;
        this.ancho = ancho;
    }
        //METODO CALCULAR AREA
        
        public Double calcularArea(){
           Double area;
            area=(lado*ancho);

            System.out.println("El area del Rectangulo es "+area);
            return area;
        }
        //METODO CALCULAR PERIMETRO
        
        public Double calcularPerimetro(){
            Double perimetro;
            perimetro=(2*lado)+(2*ancho);
            return perimetro;
        }

}
