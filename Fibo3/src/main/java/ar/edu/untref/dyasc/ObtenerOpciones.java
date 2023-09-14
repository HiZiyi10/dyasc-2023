class ObtenerOpciones {
	
	
	public int getNumeroFibo(String[] argumentos){
		
		return Integer.parseInt(argumentos[argumentos.length - 1]);
	}
	
	public char getOrientacion(String[] argumentos){
		
		if(argumentos.length >= 2){
			return argumentos[0].charAt(3);
		}else{
			return 'h';  // Valor predeterminado
		}
	
	}

	public char getDireccion(String[] argumentos){
		
		if(argumentos.length >= 2){
			return argumentos[0].charAt(4);
		}else{
			return 'd';  // Valor predeterminado
		}
	
	}
	
	public boolean existeModo(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("-m=")) {
                return true;
            }
        }
        return false;
    }
	
	public char getModo(String[] argumentos) {
        for (String arg : argumentos) {
            if (arg.startsWith("-m=") && arg.length() > 2) {
                return arg.charAt(3);
            }
        }
        return 'l'; // Valor predeterminado
    }
	
	public boolean existeNombreArchivo(String[] args) {
        for (String arg : args) {
            if (arg.startsWith("-f=")) {
                return true;
            }
        }
        return false;
    }
	
	public String getNombreArchivo(String[] argumentos) {
        for (String arg : argumentos) {
            if (arg.startsWith("-f=") && arg.length() > 2) {
                return arg.substring(3);
            }
        }
        return ""; // Valor predeterminado
    }

}
