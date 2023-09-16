
class ObtenerOpciones {
	
	
	public int getNumeroFibo(String[] argumentos){
		
		if(argumentos.length == 1){
			return Integer.parseInt(argumentos[0]);
		}else{
			return Integer.parseInt(argumentos[1]);
		}
	}
	
	public char getOrientacion(String[] argumentos){
		
		if(argumentos.length == 2){
			return argumentos[0].charAt(3);
		}else{
			return 'h';
		}
	
	}

	public char getDireccion(String[] argumentos){
		
		if(argumentos.length == 2){
			return argumentos[0].charAt(4);
		}else{
			return 'd';
		}
	
	}
}
