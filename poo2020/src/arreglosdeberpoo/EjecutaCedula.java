package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args){
        // definicion de variables
        int[] cedula = new int[10];
        // importacion de clases
        Cedula evaluar = new Cedula();
        // importacion de scaner

        Scanner entrada = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese su numero de cedula");
        String ced = entrada.nextLine();
        // proceso
        char[] a = ced.toCharArray();
        int i = 0;
        int c = cedula.length-1;

        while (i < c){
            cedula[i] = Character.getNumericValue(a[i]);
            c++;
        }
        evaluar.setCedula(cedula);
        evaluar.comparar_cedula();
        evaluar.mensaje();

    }


}
