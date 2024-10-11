package servicios;

import modelos.Alumno;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ArchivoServicio {

    private PromedioServicioImp promedioServicio = new PromedioServicioImp();

    // Método para exportar los datos de los alumnos a un archivo
    public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
        try (FileWriter writer = new FileWriter(ruta + "/promedios.txt")) {
            for (Alumno alumno : alumnos.values()) {
                writer.write("Alumno: " + alumno.getRut() + " - " + alumno.getNombre() + "\n");
                for (var materia : alumno.getMaterias()) {
                    double promedio = promedioServicio.calcularPromedio(materia.getNotas());
                    writer.write("Materia: " + materia.getNombre() + " - Promedio: " + promedio + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
