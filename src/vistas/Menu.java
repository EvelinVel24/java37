package vistas;

import servicios.AlumnoServicio;
import servicios.ArchivoServicio;

public class Menu extends MenuTemplate {

    private AlumnoServicio alumnoServicio = new AlumnoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();

    @Override
    public void crearAlumno() {
        System.out.println("--- Crear Alumno ---");
        System.out.print("Ingresa RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Ingresa nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa dirección: ");
        String direccion = scanner.nextLine();
        
        alumnoServicio.crearAlumno(rut, nombre, apellido, direccion);
        System.out.println(" --- ¡Alumno agregado! ---");
    }

    @Override
    public void agregarMateria() {
        System.out.println("--- Agregar Materia ---");
        System.out.print("Ingresa rut del Alumno: ");
        String rut = scanner.nextLine();

        System.out.println("1. MATEMATICAS");
        System.out.println("2. LENGUAJE");
        System.out.println("3. CIENCIA");
        System.out.println("4. HISTORIA");
        System.out.print("Selecciona una Materia: ");
        int opcionMateria = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        
        alumnoServicio.agregarMateria(rut, opcionMateria);
        System.out.println(" --- ¡Materia agregada! ---");
    }

    @Override
    public void exportarDatos() {
        System.out.println("--- Exportar Datos ---");
        System.out.print("Ingresa la ruta del archivo: ");
        String ruta = scanner.nextLine();
        archivoServicio.exportarDatos(alumnoServicio.listarAlumnos(), ruta);
        System.out.println("Datos exportados correctamente.");
    }
}
