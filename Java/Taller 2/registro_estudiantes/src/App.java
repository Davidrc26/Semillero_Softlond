public class App {
    public static void main(String[] args) {
        SistemaAlumnos sistema = new SistemaAlumnos();
        //Se crean los estudiantes, se agregan al sistema y se les asignan algunas calificaciones
        Estudiante estudiante1 = new Estudiante("Juan", 20);
        sistema.agregarEstudiante(estudiante1);
        estudiante1.agregarCalificacion(10);
        estudiante1.agregarCalificacion(9);
        estudiante1.agregarCalificacion(8);
        
        Estudiante estudiante2 = new Estudiante("Pedro", 21);   
        sistema.agregarEstudiante(estudiante2);
        estudiante2.agregarCalificacion(10);
        estudiante2.agregarCalificacion(9);
        estudiante2.agregarCalificacion(8);
        
        Estudiante estudiante3 = new Estudiante("Maria", 22);
        sistema.agregarEstudiante(estudiante3);
        estudiante3.agregarCalificacion(10);
        estudiante3.agregarCalificacion(9);
        estudiante3.agregarCalificacion(8);

        //Se muestran los datos de los estudiantes
        System.out.println(sistema.mostrarInformacionEstudiantes());

        //Se calcula el promedio de calificaciones de un estudiante
        System.out.println("Promedio de calificaciones de " + estudiante1.getNombre() + ": " + sistema.calcularPromedioCalificaciones(estudiante1));
        
    }
}
