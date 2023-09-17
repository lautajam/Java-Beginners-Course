package A04_EStructuras_Repetitivas.Ejercicios;

/*
* Realizar un programa que dado un límite numérico por teclado (por ejemplo 100) muestre en pantalla todos los
* números hasta ese límite (empezando por 1).
* */

import java.util.Scanner;

public class Limite_Numerico {

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        System.out.println("Este programa cuenta numeros, del 0 hasta el que elija usted.");
        System.out.println("Escriba un numero del -infinito a +infinito: ");
        int limite = KEYBOARD.nextInt();

        for (int i = 0; i <= limite; i++) {
            System.out.println("Va el " + i);
        }

    }

}
