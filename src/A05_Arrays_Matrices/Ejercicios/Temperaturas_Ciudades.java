package A05_Arrays_Matrices.Ejercicios;

/*
*  En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas
*   de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres de
*   las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las
*   temperaturas máximas alcanzadas en la última semana. Se necesita un programa que
*   permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá
*   poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la
*   temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
*
* */

import java.util.Scanner;

public class Temperaturas_Ciudades {

    static final int CANT_CIUDADES = 5;

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        String[] nombres_ciudades = new String[CANT_CIUDADES];
        float[] temperatura_minima  = new float[CANT_CIUDADES];
        float[] temperatura_maxima  = new float[CANT_CIUDADES];

        // Carga de datos (ciudades, temperaturas mínimas y temperaturas máximas)
        for (int i = 0; i < CANT_CIUDADES; i++) {

            System.out.println("Ingrese el nombre de la ciudad N° " + (i + 1));
            nombres_ciudades[i] = KEYBOARD.nextLine();

            System.out.println("Ingrese la temperatura mínima de la ciudad N° " + (i + 1));
            temperatura_minima[i] = KEYBOARD.nextInt();
            KEYBOARD.nextLine();

            System.out.println("Ingrese la temperatura máxima de la ciudad N° " + (i + 1));
            temperatura_maxima[i] = KEYBOARD.nextInt();
            KEYBOARD.nextLine();
        }

        // Se busca la temperatura mínima y máxima global
        float temperatura_minima_global = temperatura_minima[0];
        float temperatura_maxima_global = temperatura_maxima[0];

        for (int i = 0; i < CANT_CIUDADES; i++) {

            // Temperatura mínima
            if (temperatura_minima[i] < temperatura_minima_global) temperatura_minima_global = temperatura_minima[i];

            // Temperatura maxima
            if (temperatura_maxima[i] > temperatura_maxima_global) temperatura_maxima_global = temperatura_maxima[i];
        }

        System.out.println("La temperatura mínima global es: " + temperatura_minima_global);
        System.out.println("La temperatura máxima global es: " + temperatura_maxima_global);
    }

}
