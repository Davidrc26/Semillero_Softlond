package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion {
    private Huesped ocupante;
    private int numero;
    private Hotel hotel;
    ArrayList<Reserva> reservas;

    public Habitacion(int numero, Hotel hotel) {
        this.numero = numero;
        this.hotel = hotel;
        this.reservas = new ArrayList<Reserva>();
    }

    public void setOcupante(Huesped ocupante) {
        this.ocupante = ocupante;
    }

    public String getOcupante() {
        return "Nombre ocupante: "+ocupante.getNombre() +"\nCedula ocupante: "+ocupante.getCedula();
    }
    
    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        for (Reserva reserva : reservas) {
            if (reserva.getEstado() == EstadoReserva.PENDIENTE) {
                if (reserva.getFechaInicio().isBefore(fechaFin) && reserva.getFechaFin().isAfter(fechaInicio)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

}
