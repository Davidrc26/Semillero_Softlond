package models;

public class Cuadrado  extends FiguraGeometrica{
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }
}
