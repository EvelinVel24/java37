package servicios;

import java.util.List;

public class PromedioServicioImp {

    // Método que calcula el promedio de una lista de notas
    public double calcularPromedio(List<Double> notas) {
        if (notas == null || notas.isEmpty()) {
            return 0.0;  // Retorna 0 si la lista es nula o vacía
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();  // Retorna el promedio de las notas
    }
}
