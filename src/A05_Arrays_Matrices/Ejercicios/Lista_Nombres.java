package A05_Arrays_Matrices.Ejercicios;

/*
*   Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel,
*   Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por
*   pantalla
* */

public class Lista_Nombres {

    // CONSTANTES
    static final int LARGO_VECTOR = 8;

    public static void main(String[] args) {

        String[] nombres = new String[LARGO_VECTOR];

        nombres[0] = "Alejandra";
        nombres[1] = "Leonardo";
        nombres[2] = "Rosa";
        nombres[3] = "Guillermo";
        nombres[4] = "Gabriel";
        nombres[5] = "Daniel";
        nombres[6] = "Luisa";
        nombres[7] = "Ludmila";

        for (int i = 0; i < LARGO_VECTOR; i++) {
            System.out.println("Nombre N° " + (i + 1) + ": " + nombres[i]);
        }
    }
}
