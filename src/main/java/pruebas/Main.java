package pruebas;

import java.util.Scanner;

import static pruebas.ClaseCadena.devuelveIniciales;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo:");
        String nombreCompleto = scanner.nextLine();

        String iniciales = devuelveIniciales(nombreCompleto);
        System.out.println("Las iniciales son: " + iniciales);
    }
}
