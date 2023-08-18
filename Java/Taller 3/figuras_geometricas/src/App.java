import models.Circulo;
import models.Cuadrado;
import models.FiguraGeometrica;
import models.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica cuadrado = new Cuadrado("cuadrado", 5);
        System.out.println("El area del cuadrado es: " + cuadrado.area());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.perimetro());

        FiguraGeometrica triangulo = new Triangulo("triangulo", 5, 3, 4, 4);
        System.out.println("El area del triangulo es: " + triangulo.area());
        System.out.println("El perimetro del triangulo es: " + triangulo.perimetro());

        FiguraGeometrica circulo = new Circulo("circulo", 26);
        System.out.println("El area del circulo es: " + circulo.area());
        System.out.println("El perimetro del circulo es: " + circulo.perimetro());
        

    }
}
