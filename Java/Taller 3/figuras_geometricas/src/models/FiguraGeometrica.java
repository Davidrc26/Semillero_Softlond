package models;
public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();

    public abstract double perimetro();

    public String getNombre() {
        return nombre;
    }
}
