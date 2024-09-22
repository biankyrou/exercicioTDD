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

    @Test
    public void testDiasAcimaDaMediaDois() {
        int[] temperaturas = {21, 10, 13, 34, 30, 21, 34};
        assertEquals("3", ExTemperaturaSemana.quantosDiasSemanaTempAcimaMedia(temperaturas));
    }

    @Test
    public void testDiasAcimaDaMediaTres() {
        int[] temperaturas = {2, 2, 2, 2, 2, 2, 1};
        assertEquals("6", ExTemperaturaSemana.quantosDiasSemanaTempAcimaMedia(temperaturas));
    }
}
