package pruebas;

public class ClaseCadena {

public static String devuelveIniciales(String cadena){
    if (cadena == null || cadena.trim().isEmpty()) {
        throw new IllegalArgumentException("Error: El nombre y apellido no pueden estar vacíos");
    }

    String[] palabras = cadena.split("\\s+");

    if (palabras.length < 2) {
        throw new IllegalArgumentException("Error: Debe proporcionar al menos un nombre y un apellido separados por un espacio.");
    }

    for (String palabra : palabras) {
        if (!palabra.matches("^[a-zA-Z0-9'-]+$") || !palabra.matches("^[a-zA-Z0-9'-]+$")) {
            throw new IllegalArgumentException("Error: El nombre y apellido no pueden contener caracteres especiales o valores numéricos");
        }
    }

    StringBuilder iniciales = new StringBuilder();

    for (String palabra : palabras) {
        iniciales.append(palabra.charAt(0)).append(".");
    }

    return iniciales.toString().toUpperCase();
}
}
