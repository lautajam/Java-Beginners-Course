package A03_Condicionales.B01_Condicional_If_Else;

public class Condicional_If_Else_If_Else {

    static final int MIN_RANGO_DNI = 30000000;
    static final int MAX_RANGO_DNI = 45000000;
    public static void main(String[] args) {

        int dni_1 = 35366234;

        if (MIN_RANGO_DNI <= dni_1 && dni_1 <= MAX_RANGO_DNI) {
            System.out.println("El número " + dni_1 + " esta en dentro del rango " + MIN_RANGO_DNI + " - " + MAX_RANGO_DNI);
        } else if (MIN_RANGO_DNI > dni_1){
            System.out.println("El número " + dni_1 + " esta por debajo del rango " + MIN_RANGO_DNI + " - " + MAX_RANGO_DNI);
        } else {
            System.out.println("El número " + dni_1 + " esta por encima del rango " + MIN_RANGO_DNI + " - " + MAX_RANGO_DNI);
        }

    }
}
