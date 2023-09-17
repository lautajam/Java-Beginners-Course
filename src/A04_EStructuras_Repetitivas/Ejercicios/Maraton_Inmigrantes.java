package A04_EStructuras_Repetitivas.Ejercicios;

/*
* En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el marco de la Fiesta Nacional del
* Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad
* exacta de inscriptos que puede llegar a haber.

Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes datos para la
* inscripción de cada participante: dni, nombre y edad.

En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (mayores de 50 años)
Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué
* categoría debe ser inscripto.

Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre
* con la palabra “fin”.
* */


import java.util.Scanner;

public class Maraton_Inmigrantes {

    // CONSTANTES
    static final int MIN_MENORES_A        = 6;
    static final int MAX_MENORES_A       = 10;
    static final int MIN_MENORES_B       = 11;
    static final int MAX_MENORES_B       = 17;
    static final int MIN_JUVENILES       = 18;
    static final int MAX_JUVENILES       = 30;
    static final int MIN_ADULTOS         = 31;
    static final int MAX_ADULTOS         = 50;
    static final int MIN_ADULTOS_MAYORES = 51;
    static final int    NUM_CORTE     = 0;
    static final int    INIT_INT      = 1;
    static final String INIT_STRING   = " ";
    static final String PALABRA_CORTE = "salir";

    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);

        int dni = INIT_INT, edad;
        String nombre = INIT_STRING;

        while (dni != NUM_CORTE || (!nombre.equals(PALABRA_CORTE) || !nombre.equals(PALABRA_CORTE.toLowerCase()))){
            System.out.println("Ingrese su numero de documento por favor: ");
            dni = KEYBOARD.nextInt();
            System.out.println("Ingrese su nombre por favor: ");
            nombre = KEYBOARD.next();

            if (dni == NUM_CORTE && (nombre.equals(PALABRA_CORTE) || nombre.equals(PALABRA_CORTE.toLowerCase()))) continue;

            System.out.println("Ingrese su nombre por favor: ");
            edad = KEYBOARD.nextInt();

            if (edad <= MIN_MENORES_A) {
                System.out.println("No puede participar");
                continue;
            }

            if (edad >= MIN_MENORES_A && edad <= MAX_MENORES_A){
                System.out.println("Su categoria es 'Menores A'");
            } else if (edad >= MIN_MENORES_B && edad <= MAX_MENORES_B) {
                System.out.println("Su categoria es 'Menores B'");
            } else if (edad >= MIN_JUVENILES && edad <= MAX_JUVENILES) {
                System.out.println("Su categoria es 'Juveniles'");
            } else if (edad >= MIN_ADULTOS && edad <= MAX_ADULTOS) {
                System.out.println("Su categoria es 'Adultos'");
            } else if (edad >= MIN_ADULTOS_MAYORES) {
                System.out.println("Su categoria es 'Adultos'");
            }
        }

    }
}
