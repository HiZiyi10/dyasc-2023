import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class EscribirSerieEnArchivoTest {

    private EscribirSerieEnArchivo escritor;
    private ByteArrayOutputStream consoleOutput;

    @Before
    public void setUp() {
        escritor = new EscribirSerieEnArchivo();
        consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
    }

    @Test
    public void testEscribirSerieModoSuma() {
        String nombreArchivo = "test.txt";
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);
        int nroFibo = 2;
        char modo = 's';
        char orientacion = 'h';

        escritor.escribirSerieEnArchivo(nombreArchivo, fibonacci, nroFibo, modo, orientacion);

        String expectedOutput = "fibo<2>s:\n3\nfibo<2> guardado en test.txt\n";
        assertEquals(expectedOutput, consoleOutput.toString());
        File file = new File(nombreArchivo);
        file.delete(); // Eliminar el archivo de prueba después de usarlo
    }

    @Test
    public void testEscribirSerieModoListaHorizontal() {
        String nombreArchivo = "test.txt";
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);
        int nroFibo = 2;
        char modo = ' ';
        char orientacion = 'h';

        escritor.escribirSerieEnArchivo(nombreArchivo, fibonacci, nroFibo, modo, orientacion);

        String expectedOutput = "fibo<2>:\n1 2 \nfibo<2> guardado en test.txt\n";
        assertEquals(expectedOutput, consoleOutput.toString());
        File file = new File(nombreArchivo);
        file.delete(); // Eliminar el archivo de prueba después de usarlo
    }

    @Test
    public void testEscribirSerieModoListaVertical() {
        String nombreArchivo = "test.txt";
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);
        int nroFibo = 2;
        char modo = ' ';
        char orientacion = 'v';

        escritor.escribirSerieEnArchivo(nombreArchivo, fibonacci, nroFibo, modo, orientacion);

        String expectedOutput = "fibo<2>:\n1\n2\nfibo<2> guardado en test.txt\n";
        assertEquals(expectedOutput, consoleOutput.toString());
        File file = new File(nombreArchivo);
        file.delete(); // Eliminar el archivo de prueba después de usarlo
    }
}
