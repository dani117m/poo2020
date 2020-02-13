package deber_seleccion;

import java.util.Scanner;

public class EjecutaNmayor {
    public static void main(String[] args) {
        // Creacion de un objeto apartir de otro
        Nmayor Nmayor = new Nmayor();
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULO DE NUMERO MAYOR DENTO DE UN CONJUNTO DE NUMEROS ");
        System.out.println("Ingrese el valor del número 1: ");
        double num1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del número 2:");
        double num2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del número 3: ");
        double num3 = entrada.nextDouble();
        System.out.println("Ingrese el valor del número 4: ");
        double num4 = entrada.nextDouble();
        Nmayor.setNum1(num1);
        Nmayor.setNum2(num2);
        Nmayor.setNum3(num3);
        Nmayor.setNum3(num3);

        // mensake final
        Nmayor.calcular();
        System.out.println( "El numero mayor es: \n" + Nmayor.getResultado());
    }
}
