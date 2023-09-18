package A05_Arrays_Matrices.Ejercicios;
/*
Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno
por la mañana, otro al mediodía y otro por la noche. Para administrar estos datos, utiliza
una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de
asientos disponibles. Por Ejemplo:
    i.  Se necesita un programa que permita la carga de la matriz con la cantidad de
        asientos para cada vuelo.
    ii. Al mismo tiempo, el programa debe permitir a un usuario ingresar el número del
        destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la
        mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita
    ii. A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad
        suficiente de asientos para la cantidad de pasajes que se requiere. En caso de que
        así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada
        con éxito” y se debe descontar del total de asientos los solicitados por el usuario. En
        caso de no haber más asientos disponibles, se debe informar otro cartel que diga
        “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.
Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se
hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra “finish”. */

import java.util.Scanner;

public class Empresa_Vuelos {

    static final int CANT_DESTINOS       = 6;
    static final int CANT_VUELOS_POR_DIA = 3;
    static final String PALABRA_CORTE    = "finish";

    public static void main(String[] args) {

        Scanner KEYBOARD = new Scanner(System.in);

        int [][] itinerario_vuelos = new int[CANT_DESTINOS][CANT_VUELOS_POR_DIA];

        // Cargar matriz con asientos
        for (int i = 0; i < CANT_DESTINOS; i++) {
            for (int j = 0; j < CANT_VUELOS_POR_DIA; j++) {
                System.out.println("Ingrese la cantidad de asientos disponibles para " +
                                    " el destino " + (i+1) + " y el vuelo " + (j+1) + ": ");
                itinerario_vuelos[i][j] = KEYBOARD.nextInt();
            }
        }

        String flag = " ";

        while (!flag.equalsIgnoreCase(PALABRA_CORTE)){

            // Solicitud de pasajes
            System.out.println("Ingrese el destino al que quiere dirigirse (0 - 5): ");
            int destino = KEYBOARD.nextInt();
            System.out.println("Ingrese el vuelo al que quiere dirigirse (0 - 2): ");
            int vuelo = KEYBOARD.nextInt();
            System.out.println("Ingrese la cantidad de pasajes que necesita: ");
            int pasajes = KEYBOARD.nextInt();

            // Comprobación de datos del vuelo
            if(itinerario_vuelos[destino][vuelo] >= pasajes){
                System.out.println("Su reserva fue realizado con éxito");
                itinerario_vuelos[destino][vuelo] -= pasajes;
            }
            else
                System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");

            // Corte de programa o continuación
            System.out.println("Ingrese 'finish' para terminar el programa o cualquier otra tecla para continuar");
            flag = KEYBOARD.next();

        }




    }
}
