package pruebas;

public class ClaseCadena {

    public static String devuelveIniciales(String cadena){
        String[] palabras = cadena.split("");

        if(palabras.length < 1){
            return "";
        }
        StringBuilder iniciales = new StringBuilder();

        for(String palabra : palabras){
            if (!palabra.isEmpty()){
                iniciales.append(palabra.charAt(0)).append(".");
            }
        }
        return iniciales.toString();
    }
}
