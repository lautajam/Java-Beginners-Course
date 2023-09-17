package A04_EStructuras_Repetitivas.Ejercicios;

/*
*   Se necesita un programa que, ingresada una cantidad de pisos, 'dibuje' un arbolito de navidad con asteriscos (*)
*   Y, además, ingrese un ancho del tronco (|) y lo dibuje
*   Ejemplo:
*   Input: 4 y 3
*   Output:
*         *
*        ***
*       *****
*      *******
*        |||
* */

public class Arbolito_Navidad {
    public static void main(String[] args) {

        // PISOS ARBOL
        int cantidad_pisos = 27;

        //pisos
        for (int i = 1; i <= cantidad_pisos; i++) {

            // espacios entre margen y asteriscos
            for (int k = 0; k < cantidad_pisos - i; k++) {
                System.out.print(" ");
            }

            // asteriscos
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // TRONCO
        int ancho_tronco = 8;

        // espacios entre margen y rayas
        for (int i = 0; i < cantidad_pisos - 2; i++) {
            System.out.print(" ");
        }

        // rayas
        for (int j = 0; j < ancho_tronco; j++) {
            System.out.print("|");
        }
        System.out.println();
    }
}

