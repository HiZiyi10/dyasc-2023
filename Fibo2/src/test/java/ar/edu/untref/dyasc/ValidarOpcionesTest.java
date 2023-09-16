import static org.junit.Assert.*;
import org.junit.Test;

public class ValidarOpcionesTest {

    @Test
    public void testValidarOpcionesSinArgumentos() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = {};
        assertFalse(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConUnArgumentoInvalido() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "xyz" };
        assertFalse(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConUnArgumentoValido() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "5" };
        assertTrue(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConDosArgumentosInvalidos() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "abc", "xyz" };
        assertFalse(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConDosArgumentosValidos() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "-o=hd", "7" };
        assertTrue(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConDosArgumentosValidosPeroNumeroInvalido() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "-o=vd", "-5" };
        assertFalse(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesConTresArgumentos() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "-o=hi", "10", "extra" };
        assertFalse(validador.validarOpciones(argumentos));
    }

    @Test
    public void testValidarOpcionesOrientacionDireccionValidas() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "-o=vi", "5" };
        assertTrue(validador.validarOpcionesOrientacionDireccion(argumentos));
    }

    @Test
    public void testValidarOpcionesOrientacionDireccionInvalidas() {
        ValidarOpciones validador = new ValidarOpciones();
        String[] argumentos = { "-o=xyz", "5" };
        assertFalse(validador.validarOpcionesOrientacionDireccion(argumentos));
    }
}
