package test;

import servicios.PromedioServicioImp;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromedioServicioTest {

    private PromedioServicioImp promedioServicio = new PromedioServicioImp();

    @Test
    public void calcularPromedioTest() {
        double promedio = promedioServicio.calcularPromedio(Arrays.asList(6.0, 7.0, 5.0));
        assertEquals(6.0, promedio, 0.001); // Permitir una pequeña variación
    }

    @Test
    public void calcularPromedioConNotasVaciasTest() {
        double promedio = promedioServicio.calcularPromedio(Arrays.asList());
        assertEquals(0.0, promedio, 0.001); // Debe retornar 0.0 si la lista está vacía
    }

    @Test
    public void calcularPromedioConNotasNulasTest() {
        double promedio = promedioServicio.calcularPromedio(null);
        assertEquals(0.0, promedio, 0.001); // Debe retornar 0.0 si la lista es nula
    }
}
