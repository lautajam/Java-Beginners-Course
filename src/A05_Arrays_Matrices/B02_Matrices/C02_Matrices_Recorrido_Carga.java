package A05_Arrays_Matrices.B02_Matrices;

import java.util.Scanner;

public class C02_Matrices_Recorrido_Carga {

    static final int CANT_FILAS = 3;
    static final int CANT_COLUMNAS = 3;

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        int[][] matriz = new int[CANT_FILAS][CANT_COLUMNAS];

        // Carga matriz

        for (int i = 0; i < CANT_FILAS; i++) {
            for (int j = 0; j < CANT_COLUMNAS; j++) {
                System.out.println("Ingrese un numero para guardar en la matriz: ");
                matriz[i][j] = KEYBOARD.nextInt();
            }
        }

        // Recorrer matriz

        System.out.println("Matriz:");
        for (int i = 0; i < CANT_FILAS; i++) {
            for (int j = 0; j < CANT_COLUMNAS; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
