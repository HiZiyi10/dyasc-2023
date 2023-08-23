public class Fibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Fibonacci <número>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Por favor, ingresa un número positivo mayor que cero.");
            return;
        }

        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}

