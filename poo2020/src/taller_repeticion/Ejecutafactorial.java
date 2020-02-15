package taller_repeticion;

import java.util.Scanner;

public class Ejecutafactorial {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        // importacion del scanner
        Scanner entrada = new Scanner(System.in);
        // ingreso de datos
        System.out.println("Ingrese el numero");
        int numero = entrada.nextInt();

        // Impresion de datos
        System.out.println("El numero "+ numero +" su factorial\n" + fac.obtener_factorial(numero));

    }
}
