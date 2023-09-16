package A03_Condicionales.B02_Condicional_Switch;



public class Condicional_Switch {

    public static void main(String[] args) {
        int numero_dia = 12;
        String nombre_dia = " ";

        switch (numero_dia){
            case 1:
                nombre_dia = "Lunes";
                break;
            case 2:
                nombre_dia = "Martes";

                break;
            case 3:
                nombre_dia = "Miércoles";
                break;
            case 4:
                nombre_dia = "Jueves";
                break;
            case 5:
                nombre_dia = "Viernes";
                break;
            case 6:
                nombre_dia = "Sábado";
                break;
            case 7:
                nombre_dia = "Domingo";
                break;
            default:
                nombre_dia = "Es un número inválido";
                break;
        }

        System.out.println("El día de la semana es: " + nombre_dia);
    }

}
