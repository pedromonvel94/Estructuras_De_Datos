package arreglos.Bidimensionales;

public class Bidimensionales {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matriz.length);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ejemplo: " + matriz[i].length);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}