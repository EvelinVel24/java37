package utilidades;

public class Utilidad {

    // Método para limpiar la pantalla
    public static void limpiarPantalla() {
        try {
            // Para Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para Unix/Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla.");
        }
    }

    // Método para mostrar mensajes
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
