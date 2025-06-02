package arreglos.Bidimensionales;

import javax.swing.JOptionPane;

public class FilasColumnas {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] matriz = new int[filas][columnas];
        int[][] matriz1 = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String input = JOptionPane.showInputDialog("Introduce el valor de la posicion [" + i + "][" + j + "].");
                matriz[i][j] = Integer.parseInt(input);
                // Averiguar como funciona JOptionPane como por ejemplo JOptionPane.ShowMessage
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String input = JOptionPane.showInputDialog("Introduce el valor de la posicion [" + i + "][" + j + "].");
                matriz1[i][j] = Integer.parseInt(input);
                // Averiguar como funciona JOptionPane como por ejemplo JOptionPane.ShowMessage
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] + matriz1[i][j];
            }
        }

        System.out.println(resultado);
    }
}