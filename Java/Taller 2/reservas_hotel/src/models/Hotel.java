package models;

import java.lang.reflect.Array;
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

    public List<Habitacion> ListarHabitacionesDisponibles() {
        List<Habitacion> habitacionesDisponibles = new ArrayList<Habitacion>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getEstado() == EstadoHabitacion.DISPONIBLE) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }

    public Reserva[] listarReservas(){
        return (Reserva[]) this.reservas.toArray();
    }

    public void realizarReserva(ArrayList<Habitacion> habitacionesRequeridas, Empresa empresa) {
       this.reservas.add(new Reserva(habitacionesRequeridas, empresa));
    }

    public void cancelarReserva(Reserva reserva){
        reserva.setEstado(EstadoReserva.CANCELADA);
    }




}