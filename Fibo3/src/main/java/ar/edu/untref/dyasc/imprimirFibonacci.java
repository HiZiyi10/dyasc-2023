import java.util.List;


public class imprimirFibonacci {
	
	public void mostrarSerieFibo(List<Integer> fibonacci, char orientacion,int nroFibo) {
        System.out.println("Fibo<" + nroFibo + ">:");
        
        if (orientacion == 'h') {
            // Orientaci�n horizontal
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        } else if (orientacion == 'v') {
            // Orientaci�n vertical
            for (int num : fibonacci) {
                System.out.println(num);
            }//Ciero for
        }
    }
}
