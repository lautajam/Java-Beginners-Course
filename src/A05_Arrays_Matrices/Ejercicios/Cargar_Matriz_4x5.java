package A05_Arrays_Matrices.Ejercicios;

/*
*   Crear un programa que te permita cargar con numeros 5 una matriz de 4x5
* */

public class Cargar_Matriz_4x5 {

    static final int CANT_FILAS = 4;
    static final int CANT_COLUMNAS = 5;
    static final int NUMERO_CARGA = 5;

    public static void main(String[] args) {

        int[][] matriz = new int[CANT_FILAS][CANT_COLUMNAS];

        // Cargar la matriz con puros 5
        for (int i = 0; i < CANT_FILAS; i++) {
            for (int j = 0; j < CANT_COLUMNAS; j++) {
                matriz[i][j] = NUMERO_CARGA;
            }
        }

        //Recorrer la matriz para mostrarla
        for (int i = 0; i < CANT_FILAS; i++) {
            for (int j = 0; j < CANT_COLUMNAS; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
