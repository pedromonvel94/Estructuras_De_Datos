package arreglos;

import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            int valor;

            do {
                System.out.println("Número " + (i + 1) + ":");
                valor = scanner.nextInt();

                if (valor > 1 || valor < 60) {
                    System.out.println("El valor debe estar entre 1 y 60. Ingrese el valor nuevamente...");
                }
            } while (valor < 1 || valor > 60);

            numeros[i] = valor;
        }

        System.out.println("Numeros ingresados:");

        for (int num : numeros) {
            System.out.println(num);
        }

        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("La suma es: " + suma);

        System.out.println("El promedio es: " + promedio);

    }
}