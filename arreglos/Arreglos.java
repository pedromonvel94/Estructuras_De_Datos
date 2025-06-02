package arreglos;

public class Arreglos {
    public static void main(String[] args) {
        // Tipo de dato
        // Corchete
        // Nombre del arreglo
        int[] arreglo = new int[5];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;

        System.out.println(arreglo[0]);
        System.out.println("Tamaño total del arreglo: " + arreglo.length);

        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println(numeros);
        System.out.println("Tamaño total del arreglo: " + numeros.length);
        System.out.println("Ultimo valor del arreglo: " + numeros[numeros.length - 1]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + numeros[i]);
        }

        int suma = 0;
        for (int valor : numeros) {
            System.out.println("Valor en la posición: " + valor);
            suma += valor;
        }
        System.err.println("Suma total: " + suma);
    }
}