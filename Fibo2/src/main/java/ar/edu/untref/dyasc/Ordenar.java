import java.util.Collections;
import java.util.List;


public class Ordenar {
	
	public void invertirLista(char direccion,List<Integer> fibonacci){
		// Si la dirección es "i" (inversa), invertir la lista
		if (direccion == 'i') {
			Collections.reverse(fibonacci);
		}
	}
}
