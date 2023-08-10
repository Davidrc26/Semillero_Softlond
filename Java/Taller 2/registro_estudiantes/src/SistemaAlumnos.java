import java.util.ArrayList;

public class SistemaAlumnos {
    private ArrayList<Estudiante> estudiantes;

    public SistemaAlumnos() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public double calcularPromedioCalificaciones(Estudiante estudiante) {
        return estudiante.calcularPromedioCalificaciones();
    }

    public String mostrarInformacionEstudiante(Estudiante estudiante) {
        return estudiante.toString();
    }

    public String mostrarInformacionEstudiantes() {
        String informacion = "";
        for (int i = 0; i < estudiantes.size(); i++) {
            informacion += estudiantes.get(i).toString() + "\n";
        }
        return informacion;
    }

}
