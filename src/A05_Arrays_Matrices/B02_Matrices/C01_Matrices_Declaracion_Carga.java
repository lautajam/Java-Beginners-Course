package A05_Arrays_Matrices.B02_Matrices;

public class C01_Matrices_Declaracion_Carga {

    static final int CANT_FILAS   = 3;
    static final int CANT_COLUMNAS= 3;

    public static void main(String[] args) {

        // Declaracion
        int[][] matriz = new int[CANT_FILAS][CANT_COLUMNAS];

        // Carga
        matriz[0][0] = 12;
        matriz[0][1] = 23;
        matriz[0][2] = 64;
        matriz[1][0] = 45;
        matriz[1][1] = 34;
        matriz[1][2] = 1;
        matriz[2][0] = 543;
        matriz[2][1] = 124;
        matriz[2][2] = 1111;

        System.out.println("Matriz: ");
        System.out.println(matriz[0][0] + "  " + matriz[0][1] + "  " + matriz[0][2]);
        System.out.println(matriz[1][0] + "  " + matriz[1][1] + "  " + matriz[1][2]);
        System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
    }
}
