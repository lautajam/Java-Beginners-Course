package A04_EStructuras_Repetitivas.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ingreso_Palabras {

    static final String INIT_CHAR = " ";
    static final String PALABRA_CORTE = "SALIR";


    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);

        String palabra_ingresada = INIT_CHAR;

        while (!palabra_ingresada.equals(PALABRA_CORTE) && !palabra_ingresada.equals(PALABRA_CORTE.toLowerCase())){
            System.out.println("Ingrese una palabra por favor: ");
            palabra_ingresada = KEYBOARD.next();
        }
    }
}
