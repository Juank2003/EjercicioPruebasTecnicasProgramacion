package pruebas;

public class ClaseCadena {

    public static String devuelveIniciales(String cadena){
        String inicial = "";
        try {
            if (cadena == null || cadena.isEmpty()) {
                throw new IllegalArgumentException("Error: El nombre y apellido no pueden estar vacíos");
            }

            String[] palabras = cadena.split(" ");

            if (palabras.length == 1 && palabras[0].matches("^[a-zA-Z]+$")) {
                throw new IllegalArgumentException("Error: Debe proporcionar al menos un nombre y un apellido separados por un espacio.");
            }
            else if (palabras.length == 1 && !palabras[0].matches("^[a-zA-Z]+$")) {
                throw new IllegalAccessException("Error: El nombre y apellido no pueden contener caracteres especiales o valores numéricos");
            }
            else if(palabras.length > 1){
                for(String palabra : palabras){
                    if (!palabra.matches("^[a-zA-Z\\s]+$")){
                        throw new IllegalAccessException("Error: El nombre y apellido no pueden contener caracteres especiales o valores numéricos");
                    }
                inicial += palabra.charAt(0)+".";
                }
            }
            else {
                throw new IllegalArgumentException("Error: Debe proporcionar al menos un nombre y un apellido separados por un espacio.");
            }

        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        return inicial.toUpperCase();
    }
}
