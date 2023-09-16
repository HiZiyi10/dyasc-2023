import java.util.List;


public class imprimirFibonacci {
	
	public void mostrarSerieFibo(List<Integer> fibonacci, char orientacion,int nroFibo) {
        System.out.println("Fibo<" + nroFibo + ">:");
        
        if (orientacion == 'h') {
            // Orientación horizontal
            for (int num : fibonacci) {
                System.out.print(num + " ");
            }
        } else if (orientacion == 'v') {
            // Orientación vertical
            for (int num : fibonacci) {
                System.out.println(num);
            }//Ciero for
        }
    }
}
