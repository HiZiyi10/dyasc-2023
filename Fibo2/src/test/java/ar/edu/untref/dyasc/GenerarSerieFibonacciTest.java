import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class GenerarSerieFibonacciTest {

    @Test
    public void testGenerarFiboConUno() {
        generarSerieFibonacci generador = new generarSerieFibonacci();
        List<Integer> resultado = generador.generarFibo(1);
        assertEquals(Integer.valueOf(0), resultado.get(0));
        assertEquals(Integer.valueOf(1), resultado.get(1));
    }

    @Test
    public void testGenerarFiboConTres() {
        generarSerieFibonacci generador = new generarSerieFibonacci();
        List<Integer> resultado = generador.generarFibo(3);
        assertEquals(3, resultado.size());
        assertEquals(Integer.valueOf(0), resultado.get(0));
        assertEquals(Integer.valueOf(1), resultado.get(1));
        assertEquals(Integer.valueOf(1), resultado.get(2));
    }
    @Test
    public void testGenerarFiboConCinco() {
        generarSerieFibonacci generador = new generarSerieFibonacci();
        List<Integer> resultado = generador.generarFibo(5);
        assertEquals(5, resultado.size());
        assertEquals(Integer.valueOf(0), resultado.get(0));
        assertEquals(Integer.valueOf(1), resultado.get(1));
        assertEquals(Integer.valueOf(1), resultado.get(2));
        assertEquals(Integer.valueOf(2), resultado.get(3));
        assertEquals(Integer.valueOf(3), resultado.get(4));
    }
    
    @Test
    public void testGenerarFiboConDiez() {
        generarSerieFibonacci generador = new generarSerieFibonacci();
        List<Integer> resultado = generador.generarFibo(10);
        assertEquals(10, resultado.size());
        assertEquals(Integer.valueOf(0), resultado.get(0));
        assertEquals(Integer.valueOf(1), resultado.get(1));
        assertEquals(Integer.valueOf(1), resultado.get(2));
        assertEquals(Integer.valueOf(2), resultado.get(3));
        assertEquals(Integer.valueOf(3), resultado.get(4));
        assertEquals(Integer.valueOf(5), resultado.get(5));
        assertEquals(Integer.valueOf(8), resultado.get(6));
        assertEquals(Integer.valueOf(13), resultado.get(7));
        assertEquals(Integer.valueOf(21), resultado.get(8));
        assertEquals(Integer.valueOf(34), resultado.get(9));
    }

}
