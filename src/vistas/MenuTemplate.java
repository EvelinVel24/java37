package vistas;

import java.util.Scanner;

public class MenuTemplate {

    protected Scanner scanner = new Scanner(System.in);

    public void exportarDatos() {}
    public void crearAlumno() {}
    public void agregarMateria() {}
    public void agregarNotaPasoUno() {}
    public void listarAlumnos() {}
    public void terminarPrograma() {
        System.out.println("Finalizando el programa...");
        System.exit(0);
    }

    // Método que muestra el menú principal
    public void iniciarMenu() {
        while (true) {
            System.out.println("1. Crear Alumnos");
            System.out.println("2. Listar Alumnos");
            System.out.println("3. Agregar Materias");
            System.out.println("4. Agregar Notas");
            System.out.println("5. Salir");
            System.out.println("6. exportarDatos");
            System.out.print("Selección: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1: crearAlumno(); break;
                case 2: listarAlumnos(); break;
                case 3: agregarMateria(); break;
                case 4: agregarNotaPasoUno(); break;
                case 5: terminarPrograma(); break;
                case 6: exportarDatos(); break;
                default: System.out.println("Opción inválida.");
            }
        }
    }
}
