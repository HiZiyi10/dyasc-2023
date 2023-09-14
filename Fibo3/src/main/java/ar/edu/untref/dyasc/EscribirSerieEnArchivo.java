import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class EscribirSerieEnArchivo{

	public void escribirSerieEnArchivo(String nombreArchivo, List<Integer> fibonacci, int nroFibo, char modo, char orientacion) {
        
		generarSerieFibonacci serie = new generarSerieFibonacci();
		
		try {
            PrintWriter writer = new PrintWriter(nombreArchivo);
            
            if(modo == 's'){
            	writer.println("fibo<"+nroFibo+">"+modo+":");
            	int suma = serie.calcularSumaFibonacci(fibonacci);
            	writer.println(suma);
            }else{
            	writer.println("fibo<"+nroFibo+">:");
	            if(orientacion == 'h'){
		            for (int num : fibonacci) {
		            	writer.print(num+" ");
		            }
	            }
	            if(orientacion == 'v'){
	            	for (int num : fibonacci) {
		                writer.println(num);
		            }
	            }
            }
            writer.close();
            System.out.println("fibo<"+ nroFibo +"> guardado en " + nombreArchivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}