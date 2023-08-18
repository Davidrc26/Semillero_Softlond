package models;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(String nombre, double base, double altura, double lado1, double lado2) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
    @Override
    public double perimetro() {
       return lado1 + lado2 + base;
    }
    
}
