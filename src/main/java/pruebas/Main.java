package pruebas;

import static pruebas.ClaseCadena.devuelveIniciales;

public class Main {
    public static void main(String[] args) {
        String cadena = devuelveIniciales("Hola 0und");
        System.out.println("Las iniciales del Nombre y apellido son: " + cadena);
    }
}
