package arreglos;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] multiplos = { 4, 8, 15, 16, 23, 42 };
        System.out.println("Ingrese el valor: ");
        int x = scanner.nextInt();
        boolean encontrado = false;

        for (int numero : multiplos) {
            if (numero % x == 0) {
                System.out.println("El número " + numero + " es múltiplo de " + x);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún múltiplo de " + x);
        }
    }
}