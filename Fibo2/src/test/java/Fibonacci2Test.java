import org.junit.Test;
import static org.junit.Assert.*;

public class Fibonacci2Test {

    @Test
    public void testFibonacciHorizontalDirecta() {
        String[] args = {"-o", "h", "-d", "d", "5"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola con assertEquals
    }

    @Test
    public void testFibonacciVerticalDirecta() {
        String[] args = {"-o", "v", "-d", "d", "5"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola con assertEquals
    }

    @Test
    public void testFibonacciHorizontalInversa() {
        String[] args = {"-o", "h", "-d", "i", "5"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola con assertEquals
    }

    @Test
    public void testFibonacciVerticalInversa() {
        String[] args = {"-o", "v", "-d", "i", "8"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola con assertEquals
    }

    @Test
    public void testFibonacciSinOpciones() {
        String[] args = {"5"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola con assertEquals
    }

    @Test
    public void testFibonacciOpcionInvalida() {
        String[] args = {"-o", "z", "5"};
        Fibonacci2.main(args);
        // Verificar la salida en la consola para una opción no válida
    }


}

