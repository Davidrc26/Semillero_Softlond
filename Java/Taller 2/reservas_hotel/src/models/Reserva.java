package models;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private int numeroReserva;
    private List<Habitacion> habitaciones;
    private EstadoReserva estado;
    private Cliente empresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(List<Habitacion> habitaciones, Cliente empresa, LocalDate fechaInicio, LocalDate fechaFin, int numeroReserva) {
        this.habitaciones = habitaciones;
        this.estado = EstadoReserva.PENDIENTE;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroReserva = numeroReserva;
    }
    
    
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public EstadoReserva getEstado() {
        return estado;
    }

    public Cliente getEmpresa() {
        return empresa;
    }
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public int getNumeroReserva() {
        return numeroReserva;
    }

}
