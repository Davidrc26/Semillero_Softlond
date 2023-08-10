package models;

import java.util.List;

public class Reserva {
    private List<Habitacion> habitaciones;
    private Empresa empresa;
    private EstadoReserva estado;

    public Reserva(List<Habitacion> habitaciones, Empresa empresa) {
        this.habitaciones = habitaciones;
        this.empresa = empresa;
        this.estado = EstadoReserva.PENDIENTE;
    }
    
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

}
