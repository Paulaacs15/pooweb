import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figuras.Circulo;
import Figuras.Pentagono;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al Servlet");
        String control=req.getParameter("control");

        switch (control) {
            case "circulo":
                req.getRequestDispatcher("Vistas/circulo.jsp").forward(req, resp);
                break;
        
            case "triangulo":
                req.getRequestDispatcher("Vistas/triangulo.jsp").forward(req, resp);
                break;

            case "rectangulo":
                req.getRequestDispatcher("Vistas/rectangulo.jsp").forward(req, resp);
                break;

            case "pentagono":
                req.getRequestDispatcher("Vistas/pentagono.jsp").forward(req, resp);

            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entre al doPost");   
        String control=req.getParameter("control");
        System.out.println("el control es"+control);
        switch (control){
            case "areaci":
                double radio=Double.parseDouble(req.getParameter("radio"));
                Circulo ci=new Circulo(radio);

                req.setAttribute("area", ci.calcularArea());
                System.out.println("El area del Circulo es: "+ci.calcularArea());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;
            case "perimetroci":
                double perimetroci=Double.parseDouble(req.getParameter("radio_perimetro"));
                Circulo cir=new Circulo(perimetroci);

                req.setAttribute("perimetro", cir.calcularPerimetro());
                System.out.println("El perimetro del Circulo es: "+cir.calcularPerimetro());
                req.getRequestDispatcher("Vistas/perimetro.jsp").forward(req, resp);
                    break;
            
            case "areape":
                double ladosA=Double.parseDouble(req.getParameter("lados"));
                double apotemaA=Double.parseDouble(req.getParameter("apotema"));
                Pentagono pe=new Pentagono(ladosA, apotemaA);

                req.setAttribute("area",pe.calcularArea());
                System.out.println("El area del Pentagono es: "+pe.calcularArea());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;

            case "perimetrope":
                double lados=Double.parseDouble(req.getParameter("lados"));
                double apotema=Double.parseDouble(req.getParameter("apotema"));
                Pentagono per=new Pentagono(lados,apotema);


                req.setAttribute("perimetro", per.calcularPerimetro());
                System.out.println("El perimetro del Pentagono es: "+per.calcularPerimetro());
                req.getRequestDispatcher("Vistas/perimetro.jsp").forward(req, resp);
                    break;

            case "areare":
                double lado=Double.parseDouble(req.getParameter("lado"));
                double ancho=Double.parseDouble(req.getParameter("ancho"));
                Rectangulo an=new Rectangulo (lado,ancho);

                req.setAttribute("area",an.calcularArea());
                System.out.println("El area del Rectangulo es: "+an.calcularArea());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;

            case "perimetrore":
            double ladosR=Double.parseDouble(req.getParameter("lado"));
            double anchoR=Double.parseDouble(req.getParameter("ancho"));
            Rectangulo rec=new Rectangulo(ladosR,anchoR);

                req.setAttribute("Perimetro",rec.calcularPerimetro());
                System.out.println("El Perimetro del Rectangulo es: "+rec.calcularPerimetro());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;

            case "areatri":
                double altura=Double.parseDouble(req.getParameter("altura"));
                double base=Double.parseDouble(req.getParameter("base"));
                Triangulo tri=new Triangulo (altura,base);

                req.setAttribute("area",tri.calcularArea());
                System.out.println("El area del Triangulo es: "+tri.calcularArea());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;

            case "perimetrotri":
                double alturaT=Double.parseDouble(req.getParameter("altura"));
                double baseT=Double.parseDouble(req.getParameter("base"));
                Triangulo tria=new Triangulo (alturaT,baseT);

                req.setAttribute("Perimetro",tria.calcularPerimetro());
                System.out.println("El area del Triangulo es: "+tria.calcularPerimetro());
                req.getRequestDispatcher("Vistas/calcular.jsp").forward(req, resp);
                    break;
        }
   
    }
}
