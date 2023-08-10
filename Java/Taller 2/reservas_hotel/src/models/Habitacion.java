package models;

public class Habitacion {
    private Cliente ocupante;
    private int numero;
    private EstadoHabitacion estado;

    public EstadoHabitacion getEstado() {
        return estado;
    }
    public int getNumero() {
        return numero;
    }
}
