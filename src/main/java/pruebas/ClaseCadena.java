package pruebas;

public class ClaseCadena {

    public static String devuelveIniciales(String cadena){
        String inicial = "";
        try {
            String[] palabras = cadena.split(" ");

            if (palabras.length == 1) {
                inicial= palabras[0].substring(0, 1)+".";
            }
            else if(palabras.length > 1){
                for(String palabra : palabras){
                    if (!palabra.matches("\\D+")){
                        throw new IllegalAccessException("Error: El nombre y apellido no pueden contener valores numéricos");
                    }
                inicial += palabra.substring(0, 1)+".";
                }
            }
            else {
                throw new IllegalAccessException("Error: El nombre y apellido no pueden estar vacíos");
            }

        } catch (IllegalAccessException e) {
           System.out.println(e.getMessage());
        }
        return inicial.toUpperCase();
    }
}
