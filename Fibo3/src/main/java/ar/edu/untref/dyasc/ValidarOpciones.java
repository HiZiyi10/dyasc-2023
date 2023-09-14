public class ValidarOpciones {
	public boolean validarOpciones(String[] args) {
        if (args.length < 1) {
            System.out.println("No se proporcionaron argumentos.");
            return false;
        }

        // Validar el número de Fibonacci si es el último argumento
        if (!validarNumeroFibo(args[args.length - 1])) {
        	System.out.println("Opción no válida");
        	return false;
        }

        // Si hay opciones, validarlas
        if (args.length > 1) {
            String opciones = args[0].substring(3);

            // Validar las opciones de orientación y dirección
            if (!validarOpcionesDosArgumentos(opciones)) {
            	System.out.println("Opciones no válidas");
            	return false;
            }

            // Si hay tres argumentos, validar la opción de archivo o modo
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
            System.out.println("El número de Fibonacci debe ser un valor numérico válido.");
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
    	       String nombreArchivo = argumento.substring(3); // Obtener el valor después de "-f="
    	       if (nombreArchivo.endsWith(".txt")) {
    	            return true;
    	        } else {
    	            System.out.println("Nombre de archivo no válido. Debe tener la extensión '.txt'.");
    	            return false;
    	        }
    	}
		return false;
    }

       public boolean validarModo(String argumento){
    	  if (argumento.startsWith("-m=")) {
    	        String modo = argumento.substring(3); // Obtener el valor después de "-m="
    	        if (modo.equals("l") || modo.equals("s")) {
    	            return true;
    	        } else {
    	            System.out.println("Valor de modo no válido. Debe ser 'l' o 's'.");
    	            return false;
    	        }
    	  }
		return false;
       }


    	public boolean validarOpcionesTresArgumentos(String argumento) {
    	    if (validarF(argumento) || validarModo(argumento)) {
    	        return true;
    	    } else {
    	        System.out.println("Opción no válida. Debe ser '-f=' o '-m='.");
    	        return false;
    	    }
    	}


    public boolean validarOpcionesCuatroArgumentos(String arg1, String arg2) {
        if (validarF(arg1) && validarModo(arg2)) {
            return true;
        } else {
            System.out.println("Opciones no válidas.");
            return false;
        }
    }
  
}
