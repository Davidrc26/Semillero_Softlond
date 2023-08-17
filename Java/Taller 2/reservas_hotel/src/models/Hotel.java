package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<Habitacion>();
        this.reservas = new ArrayList<Reserva>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Habitacion> ListarHabitacionesDisponibles(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Habitacion> habitacionesDisponibles = new ArrayList<Habitacion>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaDisponible(fechaInicio, fechaFin)) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }
/* 
    public int consultarCantidadHabitacionesDisponibles() {
        return ListarHabitacionesDisponibles().size();
    } */

    public void realizarReserva(List<Habitacion> habitaciones, Cliente empresa, LocalDate fechaInicio,
            LocalDate fechaFin) {
        this.reservas.add(new Reserva(habitaciones, empresa, fechaInicio, fechaFin, this.reservas.size() + 1));
    }
    
    public void cancelarReserva(Reserva reserva){
        reserva.setEstado(EstadoReserva.CANCELADA);
    }

    public void crearHabitaciones(Habitacion ... habitaciones){
        for (Habitacion habitacion : habitaciones) {
            this.habitaciones.add(habitacion);
        }
    }

    public List<Reserva> getReservas() {
        return reservas;
    }




}