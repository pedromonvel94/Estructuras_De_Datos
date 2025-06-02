package arreglos;

import java.util.Scanner;

public class Buscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] buscar = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Ingrese el número a buscar:");

        int numero = scanner.nextInt();
        int posicion = -1;

        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == numero) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            System.out.println("El número no se encuentra en el arreglo.");
        } else {
            System.out.println("El número se encuentra en la posición: " + posicion);
        }

    }
}