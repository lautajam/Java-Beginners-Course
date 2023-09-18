package A05_Arrays_Matrices.B01_Arrays;

import java.util.Scanner;

public class C02_Arrays_Recorrido_Carga {

    // CONSTANTES
    static final int LARGO_VECTOR = 10;
    static final int INIT_INT     = 0;

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        int[] numeros = new int[LARGO_VECTOR];
        int tope_numeros = INIT_INT;

        // Carga vector

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero, por favor: ");
            numeros[i] = KEYBOARD.nextInt();
            tope_numeros += 1;
        }

        // Recorrido vector

        for (int i = 0; i < tope_numeros; i++) {
            System.out.println("El vector en la posicion " + i + " tiene el numero: " + numeros[i]);
        }

    }
}
