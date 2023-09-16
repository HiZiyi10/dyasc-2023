
public class ValidarOpciones {

    public boolean validarOpciones(String[] arg) {
        if (arg.length == 0) {
        	System.out.println("Opción no válida");
            return false;
        } else if (arg.length == 1) {
            return validarNumeroFibo(arg[arg.length - 1]);
        } else if (arg.length == 2) {
            return (validarOpcionesOrientacionDireccion(arg) && validarNumeroFibo(arg[arg.length - 1]));
        } else {
            return false;
        }
    }


    private boolean validarNumeroFibo(String arg) {
        try {
            int numeroFibo = Integer.parseInt(arg);
            if (numeroFibo < 1) {
            	System.out.println("Opción no válida");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
        	System.out.println("Opción no válida");
            return false;
        }
    }

    public boolean validarOpcionesOrientacionDireccion(String[] arg) {
        try {
            String opciones = arg[0];
            switch (opciones.substring(3)) {
                case "hd":
                case "hi":
                case "vd":
                case "vi":
                    return true;
                default:
                    System.out.println("Opciones no válidas");
                    return false;
            }
        } catch (Exception e) {
        	System.out.println("Opción no válida");
            return false;
        }
    }
}