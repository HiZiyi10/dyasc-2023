public class ValidarOpciones {
	public boolean validarOpciones(String[] args) {
        if (args.length < 1) {
            System.out.println("No se proporcionaron argumentos.");
            return false;
        }

        // Validar el n�mero de Fibonacci si es el �ltimo argumento
        if (!validarNumeroFibo(args[args.length - 1])) {
        	System.out.println("Opci�n no v�lida");
        	return false;
        }

        // Si hay opciones, validarlas
        if (args.length > 1) {
            String opciones = args[0].substring(3);

            // Validar las opciones de orientaci�n y direcci�n
            if (!validarOpcionesDosArgumentos(opciones)) {
            	System.out.println("Opciones no v�lidas");
            	return false;
            }

            // Si hay tres argumentos, validar la opci�n de archivo o modo
            if (args.length == 3) {
                if (!validarOpcionesTresArgumentos(args[1])) {
                    return false;
                }
            }

            // Si hay cuatro argumentos, validar todas las opciones
            if (args.length == 4) {
                if (!validarOpcionesCuatroArgumentos(args[1], args[2])) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validarNumeroFibo(String arg) {
        try {
            int numeroFibo = Integer.parseInt(arg);
            if (numeroFibo < 1) {
                ;
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("El n�mero de Fibonacci debe ser un valor num�rico v�lido.");
            return false;
        }
    }

    public boolean validarOpcionesDosArgumentos(String opciones) {
        switch (opciones) {
            case "hd":
            case "hi":
            case "vd":
            case "vi":
                return true;
            default:
                
                return false;
        }
    }
    
    public boolean validarF(String argumento){
    	if (argumento.startsWith("-f=")) {
    	       String nombreArchivo = argumento.substring(3); // Obtener el valor despu�s de "-f="
    	       if (nombreArchivo.endsWith(".txt")) {
    	            return true;
    	        } else {
    	            System.out.println("Nombre de archivo no v�lido. Debe tener la extensi�n '.txt'.");
    	            return false;
    	        }
    	}
		return false;
    }

       public boolean validarModo(String argumento){
    	  if (argumento.startsWith("-m=")) {
    	        String modo = argumento.substring(3); // Obtener el valor despu�s de "-m="
    	        if (modo.equals("l") || modo.equals("s")) {
    	            return true;
    	        } else {
    	            System.out.println("Valor de modo no v�lido. Debe ser 'l' o 's'.");
    	            return false;
    	        }
    	  }
		return false;
       }


    	public boolean validarOpcionesTresArgumentos(String argumento) {
    	    if (validarF(argumento) || validarModo(argumento)) {
    	        return true;
    	    } else {
    	        System.out.println("Opci�n no v�lida. Debe ser '-f=' o '-m='.");
    	        return false;
    	    }
    	}


    public boolean validarOpcionesCuatroArgumentos(String arg1, String arg2) {
        if (validarF(arg1) && validarModo(arg2)) {
            return true;
        } else {
            System.out.println("Opciones no v�lidas.");
            return false;
        }
    }
  
}
