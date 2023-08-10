import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<Double>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double[] getCalificaciones() {
        double[] calificaciones = new double[this.calificaciones.size()];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = this.calificaciones.get(i);
        }
        return calificaciones;
    }

    public void agregarCalificacion(double calificacion) {
        this.calificaciones.add(calificacion);
    }

    public double calcularPromedioCalificaciones() {
        double suma = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma += calificaciones.get(i);
        }
        return suma / calificaciones.size();
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }

    



}

