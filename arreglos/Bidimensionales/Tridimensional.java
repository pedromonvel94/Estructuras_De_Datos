package arreglos.Bidimensionales;

public class Tridimensional {
    public static void main(String[] args) {
        int[][][] matriz3D = {
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 },
                        { 10, 11, 12 }
                },
                {
                        { 13, 14, 15 },
                        { 16, 17, 18 }
                }
        };

        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    System.out.println(matriz3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}