package arreglosPOO;

import java.util.Scanner;

public class EjecutaArreglo {
    public static void main(String[] args){
        // declarar variables
        int[] vA = new int[10];
        int[] vB = new int[10];

        // importacion de scanner
        Arreglo arreglo = new Arreglo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores del vector A");
        for (int contador = 0; contador < vA.length; contador++ ){
            vA[contador] = entrada.nextInt();
        }

        System.out.println("Ingrese los valores del vector B");
        for (int contador = 0; contador < vB.length; contador++ ){
            vB[contador] = entrada.nextInt();
        }
        // establecer valor el objeto
        arreglo.setVectorA(vA);
        arreglo.setVectorB(vB);
        // calcular sumatoria
        arreglo.calcular_sumatoria_producto();
        // presentacion
        arreglo.getVectorA();
        arreglo.getVectorB();
        arreglo.getSumatoria_producto();
        // Presentacion de variables

        System.out.println("El resultado de la suma de las dos variables es igual a: \n"
                +arreglo.getSumatoria_producto());




    }
}
