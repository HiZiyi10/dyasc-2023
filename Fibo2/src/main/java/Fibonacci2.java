import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci2 {
    public static void main(String[] args) {
        String orientacion = "h"; // Por defecto, orientacion horizontal
        String direccion = "d"; // Por defecto, direccion directa

        // Obtener opciones de orientacion y direccion
        String[] opciones = obtenerOpciones(args);
        if (opciones != null) {
            orientacion = opciones[0];
            direccion = opciones[1];
        } else {
            return; // Ocurrio un error al procesar las opciones, se muestra un mensaje y se sale del programa.
        }

        if (args.length >= 1) {
            int n = Integer.parseInt(args[args.length - 1]);

            if (n <= 0) {
                System.out.println("Ingrese un numero positivo mayor que cero.");
                return;
            }

            List<Integer> fibonacci = generarFibonacci(n);

            // Si la direccion es "i" (inversa), invertir la lista
            if (direccion.equals("i")) {
                Collections.reverse(fibonacci);
            }

            imprimirFibonacci(fibonacci, orientacion,n);
        } else {
            System.out.println("Uso: java Fibonacci [-o <orientacion>] [-d <direccion>] <numero>"); // Sale este msj cuando no se ingreso nada
        }
    } // Cierro Main

    public static String[] obtenerOpciones(String[] args) {
        String orientacion = "h"; // Por defecto, orientacion horizontal
        String direccion = "d"; // Por defecto, direccion directa

        // Verifico si se proporcionaron opciones de orientacion y direccion
        if (args.length >= 1) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-o") && i + 1 < args.length) {
                    String opcion = args[i + 1];
                    if (opcion.equals("h") || opcion.equals("v")) {
                        orientacion = opcion;
                        i++; // Avanzo a la siguiente posicion que contiene la opcion
                    } else {
                        System.out.println("Opcion no valida: " + opcion);
                        return null; // Devolver null para indicar un error
                    }
                } else if (args[i].equals("-d") && i + 1 < args.length) {
                    String opcion = args[i + 1];
                    if (opcion.equals("d") || opcion.equals("i")) {
                        direccion = opcion;
                        i++; // Saltar a la siguiente posicion que contiene la opcion, osea el i de for empieza en 2, asi leo si se pasaron opciones para direccion
                    } else {
                        System.out.println("Opcion no valida: " + opcion);
                        return null; // Devolver null para indicar un error
                    }
                }
            }
        }

        // Devolver las opciones INGRESADAS como un vector de Strings
        return new String[] { orientacion, direccion };
    }

      // Generar la serie de Fibonacci y almacenarla en una lista
    private static List<Integer> generarFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < n; i++) {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
        }

        return fibonacci;
    }

    // Imprimir la serie de Fibonacci segun la orientacion especificada
    private static void imprimirFibonacci(List<Integer> fibonacci, String orientacion,int n) {
        System.out.println("fibo<" + n + ">:");
        
        if (orientacion.equals("h")) {
            // Orientacion horizontal
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        } else if (orientacion.equals("v")) {
            // Orientacion vertical
            for (int num : fibonacci) {
                System.out.println(num);
            }
        }
    }
}


