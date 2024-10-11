package servicios;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class AlumnoServicio {

    // Mapa para almacenar alumnos, utilizando su RUT como clave
    private Map<String, Alumno> listaAlumnos = new HashMap<>();

    // Método para crear un nuevo alumno
    public void crearAlumno(String rut, String nombre, String apellido, String direccion) {
        Alumno alumno = new Alumno();
        alumno.setRut(rut);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setDireccion(direccion);
        alumno.setMaterias(new ArrayList<>()); // Inicializa la lista de materias
        listaAlumnos.put(rut, alumno);
    }

    // Método para agregar una materia a un alumno
    public void agregarMateria(String rut, int opcionMateria) {
        Alumno alumno = listaAlumnos.get(rut);
        if (alumno != null) {
            Materia materia = new Materia();
            switch (opcionMateria) {
                case 1:
                    materia.setNombre(MateriaEnum.MATEMATICAS);
                    break;
                case 2:
                    materia.setNombre(MateriaEnum.LENGUAJE);
                    break;
                case 3:
                    materia.setNombre(MateriaEnum.CIENCIA);
                    break;
                case 4:
                    materia.setNombre(MateriaEnum.HISTORIA);
                    break;
                default:
                    System.out.println("Opción de materia inválida.");
                    return; // Salir si la opción es inválida
            }
            // Añadir la materia a la lista de materias del alumno
            List<Materia> materias = alumno.getMaterias(); // Obtener la lista de materias
            materias.add(materia); // Agregar la nueva materia
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    // Método para listar todos los alumnos
    public Map<String, Alumno> listarAlumnos() {
        return listaAlumnos;
    }
}
