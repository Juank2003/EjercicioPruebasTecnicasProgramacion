import org.junit.Test;
import pruebas.ClaseCadena;

import static org.junit.Assert.*;

public class CadenaClaseTest {

    @Test
    public void testDevuelveIniciales() {
        String iniciales = ClaseCadena.devuelveIniciales("Andreas Dulac");
        assertEquals("A.D.", iniciales);
    }
}
