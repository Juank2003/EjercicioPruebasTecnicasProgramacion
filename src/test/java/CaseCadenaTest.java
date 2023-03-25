import org.junit.jupiter.api.Test;
import pruebas.ClaseCadena;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CaseCadenaTest {

    @Test
    void devuelveIniciales_conNombreCompleto_sinApellido_lanzaExcepcion() {
        String nombreCompleto = "Juan";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> ClaseCadena.devuelveIniciales(nombreCompleto));
        assertEquals("Error: Debe proporcionar al menos un nombre y un apellido separados por un espacio.", exception.getMessage());
    }

    @Test
    void devuelveIniciales_conNombreCompleto_conCaracteresEspeciales_lanzaExcepcion() {
        String nombreCompleto = "Juan Pérez 123";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> ClaseCadena.devuelveIniciales(nombreCompleto));
        assertEquals("Error: El nombre y apellido no pueden contener caracteres especiales o valores numéricos", exception.getMessage());
    }

}