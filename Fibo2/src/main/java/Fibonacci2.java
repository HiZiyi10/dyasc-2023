import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci2 {
    public static void main(String[] args) {
        String orientacion = "h"; // Por defecto, orientación horizontal
        String direccion = "d";  // Por defecto, dirección directa

        // Verifico si se proporcionan opciones de orientación y dirección
        if (args.length >= 1) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-o") && i + 1 < args.length) {
                    String opcion = args[i + 1];
                    if (opcion.equals("h") || opcion.equals("v")) {
                        orientacion = opcion;
                        i++; // Saltar la siguiente posición que contiene la opción
                    } else {
                        System.out.println("Opción no válida: " + opcion);
                        return;
                    }
                } else if (args[i].equals("-d") && i + 1 < args.length) {
                    String opcion = args[i + 1];
                    if (opcion.equals("d") || opcion.equals("i")) {
                        direccion = opcion;
                        i++; // Saltar la siguiente posición que contiene la opción
                    } else {
                        System.out.println("Opción no válida: " + opcion);
                        return;
                    }
                }
            }
        }

        if (args.length >= 1) {
            int n = Integer.parseInt(args[args.length - 1]);

            if (n <= 0) {
                System.out.println("Ingrese un número positivo mayor que cero.");
                return;
            }

            List<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(0);
            fibonacci.add(1);

            for (int i = 2; i < n; i++) {
                int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                fibonacci.add(next);
            }

            // Si la dirección es "i" (inversa), invertir la lista
            if (direccion.equals("i")) {
                Collections.reverse(fibonacci);
            }

            System.out.println("Fibonacci <" + n + ">" + orientacion + direccion + ":");
            
            if (orientacion.equals("h")) {
                // Orientación horizontal
                for (int num : fibonacci) {
                    System.out.print(num + " ");
                }
            } else if (orientacion.equals("v")) {
                // Orientación vertical
                for (int num : fibonacci) {
                    System.out.println(num);
                }
            }
        } else {
            System.out.println("Uso: java FibonacciApp [-o <orientación>] [-d <dirección>] <número>");
        }
    }
}

