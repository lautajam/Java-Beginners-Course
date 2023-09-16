package A03_Condicionales.Ejercicio_Integrador;

import java.util.Scanner;

public class Sueldos_empleados {
    // CONSTANTES
    static final double SUELDO_REPOSITOR = 15890 + (double) (10 * 15890) /100;
    static final double SUELDO_CAJERO    = 25630.89;
    static final double SUELDO_GERENTE   = 35560.20 - (double) (11 * 35000) /100;
    static final int    REPOSITOR = 1;
    static final int    CAJERO    = 2;
    static final int    GERENTE   = 3;
    static final int    ERROR     = -1;

    public static void main(String[] args) {

        double sueldo_empleado_1 = 0;
        int categoria_empleado_1 ;

        System.out.println("1 - REPOSITOR, 2 - CAJERO, 3 - GERENTE"); 
        System.out.println("Ingrese la categoria del empleado_1: ");
        Scanner sc = new Scanner(System.in);
        categoria_empleado_1 = sc.nextInt();

        if (categoria_empleado_1 == REPOSITOR){
            sueldo_empleado_1 = SUELDO_REPOSITOR;
        } else if(categoria_empleado_1 == CAJERO){
            sueldo_empleado_1 = SUELDO_CAJERO;
        } else if (categoria_empleado_1 == GERENTE) {
            sueldo_empleado_1 = SUELDO_GERENTE;
        } else {
            sueldo_empleado_1 = ERROR;
        }

        if (sueldo_empleado_1 == ERROR){
            System.out.println("La categoria del empleado_1 es incorrecta");
        } else {
            System.out.println("El sueldo del empleado_1 es: " + sueldo_empleado_1);
        }
    }
}
