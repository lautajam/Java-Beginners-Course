package A02_TIpos_datos.Ejercicios;

public class Intercambio_Valores {
    public static void main(String[] args) {
        int valor_1 = 5, valor_2 = 7, valor_paso = 0;

        System.out.println("Valor 1: " + valor_1 + "\nValor 2: " + valor_2);

        valor_paso = valor_1;
        valor_1 = valor_2;
        valor_2 = valor_paso;

        System.out.println("Valor 1: " + valor_1 + "\nValor 2: " + valor_2);
    }
}