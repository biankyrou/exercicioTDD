package exercicio;

import br.edu.ifsp.exercicio.ExTemperaturaSemana;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExTemperaturaSemanaTest {
    @Test
    public void testDiasAcimaDaMediaUm() {
        int[] temperaturas = {2, 2, 2, 2, 2, 2, 3};
        assertEquals("1", ExTemperaturaSemana.quantosDiasSemanaTempAcimaMedia(temperaturas));
    }
}
