package A05_Arrays_Matrices.Ejercicios;

/*
*   Se requiere un programa que permita ingresar 15 numeros y que luego informe por pantalla CUANTAS veces se ingreso el N (N = 3)
* */

import java.util.Scanner;

public class Contando_el_num_N {

    // CONSTANTES
    static final int LARGO_VECTOR   = 15;
    static final int INIT_INT       = 0;
    static final int NUM_REPETIDO_N = 3;

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        int[] numeros = new int[LARGO_VECTOR];
        int contador_repeticiones = INIT_INT;

        // Carga el array con numeros y cuenta cuantos 3 se ingresan
        for (int i = 0; i < LARGO_VECTOR; i++) {
            System.out.println("Por favor, ingrese un numero: ");
            numeros[i] = KEYBOARD.nextInt();
            if(numeros[i] == NUM_REPETIDO_N) contador_repeticiones += 1;
        }

        System.out.println("La cantidad de veces que se repitio el numero " + NUM_REPETIDO_N + " es de: "
                            + contador_repeticiones + " veces.");
    }
}
