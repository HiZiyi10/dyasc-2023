import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci3 {
    public static void main(String[] args) {
        char orientacion = 'h'; // Por defecto, orientación horizontal
        char direccion = 'd'; // Por defecto, dirección directa
        int nroFibo;
        char modo = 'l'; // Modo predeterminado es "l" (lista)
        String nombreArch = "";

        generarSerieFibonacci serie = new generarSerieFibonacci();
        imprimirFibonacci print = new imprimirFibonacci();
        Ordenar orden = new Ordenar();
        ValidarOpciones validar = new ValidarOpciones();
        ObtenerOpciones opciones = new ObtenerOpciones();
        EscribirSerieEnArchivo arch = new EscribirSerieEnArchivo();

        if (validar.validarOpciones(args)) {

            nroFibo = opciones.getNumeroFibo(args);
            orientacion = opciones.getOrientacion(args);
            direccion = opciones.getDireccion(args);
            if (opciones.existeModo(args)) {
                modo = opciones.getModo(args);
            }
            if (opciones.existeNombreArchivo(args)) {
                nombreArch = opciones.getNombreArchivo(args);
            }

            // Genero la serie de Fibonacci
            List<Integer> fibonacci = serie.generarFibo(nroFibo);

            // Si la dirección es "i" (inversa), invertir la lista
            orden.invertirLista(direccion, fibonacci);


			if (modo == 's') {
			    int suma = serie.calcularSumaFibonacci(fibonacci);
			    
			    if (!nombreArch.isEmpty()) {
			        arch.escribirSerieEnArchivo(nombreArch, fibonacci, nroFibo, 's', orientacion);
			    } else {
			        System.out.println("fibo<" + nroFibo + ">s: " + suma);
			    }
			} else {
			    // Si se proporciona un nombre de archivo, escribir la serie en el archivo
			    if (!nombreArch.isEmpty()) {
			        arch.escribirSerieEnArchivo(nombreArch, fibonacci, nroFibo, ' ', orientacion);
			    }else{
			    	// Mostrar la serie de Fibonacci en el modo "l" (lista)
				    print.mostrarSerieFibo(fibonacci, orientacion, nroFibo);
			    }
			}
        } else {
            //System.out.println("Opciones no válidas");
        	return;
        }
    } // Cierro Main

    
}
