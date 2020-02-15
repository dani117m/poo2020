package taller_repeticion;

import java.util.Scanner;

public class Ejecutamultiplicacion {

    public static void main(String[] args) {
        Multiplicacion multi = new Multiplicacion();
        // importacion del scanner
        Scanner entrada = new Scanner(System.in);
        // ingreso de datos
        System.out.println("Ingrese el multiplicando ");
        int numero = entrada.nextInt();
        System.out.println("Ingrese el multiplicador ");
        int numero2 = entrada.nextInt();

        // impresion de datos

        System.out.println(numero+" * "+ numero2 +": "+ multi.obterner_multiplicacion(numero,numero2));

    }
}
