package arreglos.Bidimensionales;

public class Transpuesta {
    public static void main(String[] args) {

        // 3 Filas y 2 columnas
        int[][] matriz = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };

        int[][] transpuesta = new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int col = 0; col < matriz[filas].length; col++) {
                transpuesta[col][filas] = matriz[filas][col];
            }
        }
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");

            }
            System.out.println();
        }
    }
}
