package arreglos;

import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        sc.close();
    }
}