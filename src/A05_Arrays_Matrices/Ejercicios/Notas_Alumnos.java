package A05_Arrays_Matrices.Ejercicios;

/*
 *   En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos
 *   de secundaria. Cada fila corresponde a las notas y al promedio de cada
 *   alumno. Se necesite un programa que permita a un profesor cargar, en las
 *   3 posiciones (columnas) de cada fila, las notas del alumno y que en la
 *   última columna se calculen los promedios. Una vez realizados los cálculos,
 *   se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz
 * */

import java.util.Scanner;

public class Notas_Alumnos {

    static final int CANT_FILAS = 4;
    static final int CANT_COLUMNAS = 4;
    static final float INIT_FLOAT = 0.0f;

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        float[][] notas_alumnos = new float[CANT_FILAS][CANT_COLUMNAS];

        // Se ingresa nota por nota de c/alumno, se van guardando en orden y, en la ultima posición, se guarda el promedio
        for (int i = 0; i < CANT_FILAS; i++) {

            float suma_notas_alumno = INIT_FLOAT;

            for (int j = 0; j < CANT_COLUMNAS; j++) {

                if (j != (CANT_COLUMNAS - 1)) {
                    System.out.println("Ingrese la nota N° " + (j + 1) + " del estudiante N° " + (i + 1));
                    notas_alumnos[i][j] = KEYBOARD.nextFloat();
                    suma_notas_alumno += notas_alumnos[i][j];
                } else {
                    notas_alumnos[i][j] = suma_notas_alumno / (CANT_COLUMNAS - 1);
                }
            }
        }

        for (int i = 0; i < CANT_FILAS; i++) {

            for (int j = 0; j < CANT_COLUMNAS; j++) {

                if (j != (CANT_COLUMNAS - 1))
                    System.out.println("Nota N° " + (j + 1) + " del estudiante N° " + (i + 1) + ": " + notas_alumnos[i][j]);
                else
                    System.out.println("Promedio de notas del estudiante N° " + (i + 1) + ": " + notas_alumnos[i][j]);

            }
        }
    }
}

