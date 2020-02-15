package taller_repeticion;

import java.util.Scanner;

public class Ejecutaresta {

    public static void main(String[] args) {
        Resta resta = new Resta();
        // importacion del scanner
        Scanner entrada = new Scanner(System.in);
        // ingreso de datos
        System.out.println("Ingrese el divisor");
        int divisor = entrada.nextInt();
        System.out.println("Ingrese el dividendo");
        int dividendo = entrada.nextInt();

        // impresion de datos

        System.out.println(divisor+" % "+ dividendo +": "+ resta.obterner_divicion(divisor,dividendo));

    }
}
