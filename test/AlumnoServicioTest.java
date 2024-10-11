package test;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;
import servicios.AlumnoServicio;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AlumnoServicioTest {

    private AlumnoServicio alumnoServicio = new AlumnoServicio();

    @Test
    public void crearAlumnoTest() {
        alumnoServicio.crearAlumno("1.111.111-1", "Milton", "P.", "Casita 1");

        // Verificar que el alumno se haya agregado correctamente
        Map<String, Alumno> alumnos = alumnoServicio.listarAlumnos();
        assertTrue(alumnos.containsKey("1.111.111-1"));
        Alumno alumno = alumnos.get("1.111.111-1");
        assertEquals("Milton", alumno.getNombre());
        assertEquals("P.", alumno.getApellido());
        assertEquals("Casita 1", alumno.getDireccion());
    }

    @Test
    public void agregarMateriaTest() {
        alumnoServicio.crearAlumno("1.111.111-1", "Milton", "P.", "Casita 1");
        alumnoServicio.agregarMateria("1.111.111-1", 1); // Agregar Matemáticas

        Alumno alumno = alumnoServicio.listarAlumnos().get("1.111.111-1");
        assertEquals(1, alumno.getMaterias().size());
        assertEquals(MateriaEnum.MATEMATICAS, alumno.getMaterias().get(0).getNombre());
    }
    
    @Test
    public void listarAlumnosTest() {
        alumnoServicio.crearAlumno("1.111.111-1", "Milton", "P.", "Casita 1");
        alumnoServicio.crearAlumno("2.222.222-2", "Ana", "L.", "Casita 2");

        Map<String, Alumno> alumnos = alumnoServicio.listarAlumnos();
        assertEquals(2, alumnos.size());
    }
}
