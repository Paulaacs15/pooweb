package Figuras;

public class Triangulo extends Figura{
    //ATRIBUTOS
    private double base;
    private double altura;



    //METODO CONSTRUCTOR VACIO
    public Triangulo(){

    }
    //METODO CONSTRUCTOR CON PARAMETROS
    
    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
        //METODO CALCULAR AREA
        @Override
        public Double calcularArea(){
            Double area;
            area=(base*altura)/2;

            System.out.println("El area del triangulo es "+area);
            return area;
        }
    //METODO CALCULAR PERIMETRO
        
    public Double calcularPerimetro(){
        Double perimetro;
        Double lado3;
        
        perimetro=Math.pow(base, 2)+Math.pow(altura, 2);
        lado3=Math.sqrt(perimetro);
        return perimetro;

    }
    
}
