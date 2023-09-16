package A03_Condicionales.B03_Operador_Ternario;

import java.util.Scanner;

public class Operador_Ternario {

    // CONSTATES
    static final int MAYORIA_EDAD   = 18;
    static final int INIT_DOUBLE    = 0;
    static final String INIT_STRING = " ";

    public static void main(String[] args) {

        double edad = INIT_DOUBLE;
        String condicion_final = INIT_STRING;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        edad = keyboard.nextDouble();

        condicion_final = (edad >= MAYORIA_EDAD) ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(condicion_final);
    }
}
