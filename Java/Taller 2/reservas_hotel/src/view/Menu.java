package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Cliente;
import models.Habitacion;
import models.Hotel;
import models.Huesped;
import models.Reserva;

public class Menu {
    private ArrayList<Hotel> hoteles;

    public void init() {
        this.hoteles = new ArrayList<Hotel>();
        Hotel hotel1 = new Hotel("Hotel Carretero");
        Hotel hotel2 = new Hotel("Termales el otono");
        Hotel hotel3 = new Hotel("Hotel el bosque");
        Hotel hotel4 = new Hotel("Hacienda venecia");
        Hotel hotel5 = new Hotel("Hotel el bosque");

        Habitacion habitacion1 = new Habitacion(1, hotel1);
        Habitacion habitacion2 = new Habitacion(2, hotel1);
        Habitacion habitacion3 = new Habitacion(3, hotel1);
        Habitacion habitacion4 = new Habitacion(4, hotel1);
        Habitacion habitacion5 = new Habitacion(5, hotel1);
        Habitacion habitacion6 = new Habitacion(6, hotel1);
        Habitacion habitacion7 = new Habitacion(7, hotel1);

        Habitacion habitacion8 = new Habitacion(1, hotel2);
        Habitacion habitacion9 = new Habitacion(2, hotel2);
        Habitacion habitacion10 = new Habitacion(3, hotel2);
        Habitacion habitacion11 = new Habitacion(4, hotel2);
        Habitacion habitacion12 = new Habitacion(5, hotel2);
        Habitacion habitacion13 = new Habitacion(6, hotel2);
        Habitacion habitacion14 = new Habitacion(7, hotel2);

        Habitacion habitacion15 = new Habitacion(1, hotel3);
        Habitacion habitacion16 = new Habitacion(2, hotel3);
        Habitacion habitacion17 = new Habitacion(3, hotel3);
        Habitacion habitacion18 = new Habitacion(4, hotel3);
        Habitacion habitacion19 = new Habitacion(5, hotel3);
        Habitacion habitacion20 = new Habitacion(6, hotel3);
        Habitacion habitacion21 = new Habitacion(7, hotel3);

        Habitacion habitacion22 = new Habitacion(1, hotel4);
        Habitacion habitacion23 = new Habitacion(2, hotel4);
        Habitacion habitacion24 = new Habitacion(3, hotel4);
        Habitacion habitacion25 = new Habitacion(4, hotel4);
        Habitacion habitacion26 = new Habitacion(5, hotel4);
        Habitacion habitacion27 = new Habitacion(6, hotel4);
        Habitacion habitacion28 = new Habitacion(7, hotel4);

        Habitacion habitacion29 = new Habitacion(1, hotel5);
        Habitacion habitacion30 = new Habitacion(2, hotel5);
        Habitacion habitacion31 = new Habitacion(3, hotel5);
        Habitacion habitacion32 = new Habitacion(4, hotel5);
        Habitacion habitacion33 = new Habitacion(5, hotel5);
        Habitacion habitacion34 = new Habitacion(6, hotel5);
        Habitacion habitacion35 = new Habitacion(7, hotel5);

        hotel1.crearHabitaciones(habitacion1, habitacion2, habitacion3, habitacion4, habitacion5, habitacion6,
                habitacion7);
        hotel2.crearHabitaciones(habitacion8, habitacion9, habitacion10, habitacion11, habitacion12, habitacion13,
                habitacion14);
        hotel3.crearHabitaciones(habitacion15, habitacion16, habitacion17, habitacion18, habitacion19, habitacion20,
                habitacion21);
        hotel4.crearHabitaciones(habitacion22, habitacion23, habitacion24, habitacion25, habitacion26, habitacion27,
                habitacion28);
        hotel5.crearHabitaciones(habitacion29, habitacion30, habitacion31, habitacion32, habitacion33, habitacion34,
                habitacion35);

        hoteles.add(hotel1);
        hoteles.add(hotel2);
        hoteles.add(hotel3);
        hoteles.add(hotel4);
        hoteles.add(hotel5);

    }

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido a la aplicacion de reservas de hoteles");
            System.out.println("1. Reservar habitaciones");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Consultar detalles de una reserva");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    menuReservarHabitacion(sc);
                    break;
                case 2:
                    menuCancelarReserva(sc);
                    break;
                case 3:
                    menuConsultarReserva(sc);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
        sc.close();
    }

    private void menuConsultarReserva(Scanner sc) {

        System.out.println("ingrese el nombre del hotel en el que reservó: ");
        sc.nextLine();
        String nombreHotel = sc.nextLine();
        System.out.println("ingrese el numero de la reserva:");
        int numeroReserva = sc.nextInt();
        Hotel hotel = this.buscarHotel(nombreHotel);
        if (hotel != null) {
            for (Reserva reserva : hotel.getReservas()) {
                if (reserva.getNumeroReserva() == numeroReserva) {
                    System.out.println("Reserva encontrada");
                    System.out.println("Numero de reserva: " + reserva.getNumeroReserva());
                    System.out.println("Nombre de la empresa: " + reserva.getEmpresa().getNombre());
                    System.out.println("Nit de la empresa: " + reserva.getEmpresa().getNit());
                    System.out.println("Direccion de la empresa: " + reserva.getEmpresa().getDireccion());
                    System.out.println("Telefono de la empresa: " + reserva.getEmpresa().getTelefono());
                    System.out.println("Fecha de inicio de la reserva: " + reserva.getFechaInicio());
                    System.out.println("Fecha de fin de la reserva: " + reserva.getFechaFin());
                    System.out.println("Habitaciones reservadas: ");
                    for (Habitacion habitacion : reserva.getHabitaciones()) {
                        System.out.println("Numero de habitacion: " + habitacion.getNumero());
                        System.out.println("Ocupante: " + habitacion.getOcupante());
                    }
                    return;
                }
            }
        } else {
            System.out.println("No se encontro el hotel");
        }
    }

    private void menuReservarHabitacion(Scanner sc) {
        System.out.println("seleccione un hotel: ");
        for (int i = 0; i < hoteles.size(); i++) {
            System.out.println(i + ". " + hoteles.get(i).getNombre());
        }
        int opcion = sc.nextInt();
        Hotel hotel = hoteles.get(opcion);
        System.out.println("ingrese el numero de habitaciones que desea reservar: ");
        int cantidadHabitaciones = sc.nextInt();

        try {
            System.out.println("ingrese la fecha de inicio de la reserva en el formato aaaa-mm-dd: ");
            LocalDate fechaInicio = LocalDate.parse(sc.next());
            System.out.println("ingrese la fecha de fin de la reserva en el formato aaaa-mm-dd: ");
            LocalDate fechaFin = LocalDate.parse(sc.next());
            if (cantidadHabitaciones > hotel.ListarHabitacionesDisponibles(fechaInicio, fechaFin).size()) {
                System.out.println("El hotel no tiene tantas habitaciones");
                return;
            }
            List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            boolean salir = false;
            System.out.println("Vamos a seleccionar las habitaciones...\n");
            List<Habitacion> habitacionesDisponibles = hotel.ListarHabitacionesDisponibles(fechaInicio,
                    fechaFin);
            while (!salir) {
                System.out.println("seleccione una habitacion de las disponibles o 0 para salir: ");
                for (int j = 0; j < habitacionesDisponibles.size(); j++) {
                    System.out.println(habitacionesDisponibles.get(j).getNumero());
                }
                opcion = sc.nextInt();
                if (opcion == 0) {
                    salir = true;
                    break;
                } else {
                    System.out.println("ingrese el nombre de la persona que ocupara la habitacion: ");
                    String nombre = sc.next();
                    System.out.println("ingrese la cedula de la persona que ocupara la habitacion: ");
                    sc.nextLine();
                    String cedula = sc.nextLine();
                    Habitacion hbt = habitacionesDisponibles.get(opcion - 1);
                    habitacionesDisponibles.remove(hbt);
                    hbt.setOcupante(new Huesped(cedula, nombre));
                    habitaciones.add(hbt);
                }

            }

            if (habitaciones.size() == 0) {
                System.out.println("No ha seleccionado ninguna habitacion");
                return;
            } else {
                System.out.println("A continuacion tomaremos algunos datos de la empresa que realiza la reserva");
                System.out.println("ingrese el nombre de la empresa: ");
                String nombreEmpresa = sc.next();
                System.out.println("ingrese el nit de la empresa: ");
                String nit = sc.next();
                System.out.println("ingrese el telefono de la empresa: ");
                String telefono = sc.next();
                System.out.println("ingrese la direccion de la empresa: ");
                String direccion = sc.next();
                hotel.realizarReserva(habitaciones, new Cliente(nombreEmpresa, nit, direccion, telefono), fechaInicio,
                        fechaFin);
                System.out.println("Reserva realizada con exito");
            }

        } catch (Exception e) {
            System.out.println("Se produjo un error: detalles ---->" + e.getMessage());
        }

    }

    private void menuCancelarReserva(Scanner sc) {
        System.out.println("ingrese el nombre del hotel en el que reservó: ");
        String nombreHotel = sc.nextLine();
        System.out.println("ingrese el numero de la reserva:");
        sc.nextLine();
        int numeroReserva = sc.nextInt();
        Hotel hotel = this.buscarHotel(nombreHotel);
        if (hotel != null) {
            for (Reserva reserva : hotel.getReservas()) {
                if (reserva.getNumeroReserva() == numeroReserva) {
                    System.out.println("Reserva encontrada");
                    System.out.println("Desea cancelar la reserva? (s/n)");
                    String opcion = sc.next();
                    if (opcion.equals("s")) {
                        hotel.cancelarReserva(reserva);
                        System.out.println("Reserva cancelada con exito");
                        return;
                    } else {
                        System.out.println("No se cancelo la reserva");
                        return;
                    }
                }
            }
        } else {
            System.out.println("No se encontro el hotel");
        }

    }

    public Hotel buscarHotel(String nombreHotel) {
        for (Hotel hotel : hoteles) {
            System.out.println(hotel.getNombre());
            System.out.println(nombreHotel);
            if (hotel.getNombre().equals(nombreHotel.replaceAll("[\n\r]", ""))) {
                return hotel;
            }
        }
        return null;
    }

}
