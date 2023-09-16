import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci2 {
    public static void main(String[] args) {
        char orientacion = 'h'; // Por defecto, orientación horizontal
        char direccion = 'd'; // Por defecto, dirección directa
        int nroFibo;
        
        generarSerieFibonacci serie = new generarSerieFibonacci();
        imprimirFibonacci print = new imprimirFibonacci();
        Ordenar orden = new Ordenar();
        ValidarOpciones validar = new ValidarOpciones();
        ObtenerOpciones opciones = new ObtenerOpciones();
        
		if(validar.validarOpciones(args)){
			
			nroFibo=opciones.getNumeroFibo(args);
			orientacion=opciones.getOrientacion(args);
			direccion=opciones.getDireccion(args);
			
			//Genero la serie de Fibonacci
			List<Integer> fibonacci = serie.generarFibo(nroFibo);

            // Si la dirección es "i" (inversa), invertir la lista
            orden.invertirLista(direccion,fibonacci);

            
			print.mostrarSerieFibo(fibonacci, orientacion,nroFibo);
        } else {
            return;
        }
    } // Cierro Main

}
