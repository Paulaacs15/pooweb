package Figuras;


public class Pentagono extends Figura{
    //ATRIBUTOS 
    private double lados;
    private double apotema;



    //METODO CONSTRUCTOR VACIO
    public Pentagono(){

    }
    //METODO CONTRUCTOR CON PARAMETROS 
    public Pentagono(double lados, double apotema){
        super();
        this.lados = lados;
        this.apotema = apotema;
    }
    @Override
    //METODO CALCULAR AREA
    public Double calcularArea(){
        Double area, perimetro;
        perimetro=(lados*5);
        area=(perimetro*apotema)/2;

        System.out.println("El area del pentagono es "+area);
        return area;
    }
    //METODO CALCULAR PERIMETRO
        public Double calcularPerimetro(){
            Double perimetro;
            perimetro=(lados*5);
            return perimetro;
        }
}
