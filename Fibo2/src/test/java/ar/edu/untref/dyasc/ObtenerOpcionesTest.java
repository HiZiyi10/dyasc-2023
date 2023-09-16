import static org.junit.Assert.*;
import org.junit.Test;

public class ObtenerOpcionesTest {

    @Test
    public void testGetNumeroFiboConUnArgumento() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "5" };
        int numFibo = opciones.getNumeroFibo(argumentos);
        assertEquals(5, numFibo);
    }

    @Test
    public void testGetNumeroFiboConDosArgumentos() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "-o=vd", "7" };
        int numFibo = opciones.getNumeroFibo(argumentos);
        assertEquals(7, numFibo);
    }

    @Test
    public void testGetOrientacionConDosArgumentos() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "-o=vd", "7" };
        char orientacion = opciones.getOrientacion(argumentos);
        assertEquals('v', orientacion);
    }

    @Test
    public void testGetOrientacionSinDosArgumentos() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "7" };
        char orientacion = opciones.getOrientacion(argumentos);
        assertEquals('h', orientacion);
    }

    @Test
    public void testGetDireccionConDosArgumentos() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "-o=vd", "7" };
        char direccion = opciones.getDireccion(argumentos);
        assertEquals('d', direccion);
    }

    @Test
    public void testGetDireccionSinDosArgumentos() {
        ObtenerOpciones opciones = new ObtenerOpciones();
        String[] argumentos = { "7" };
        char direccion = opciones.getDireccion(argumentos);
        assertEquals('d', direccion);
    }
}
