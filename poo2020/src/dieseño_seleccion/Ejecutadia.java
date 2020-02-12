package dieseño_seleccion;

import java.util.Scanner;

public class Ejecutadia {
    public static void main(String[] args){
        // Ingresoe de los datos por medio un scanner por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de dia");
        int num = teclado.nextInt();

        // envio de datos
        Dia dia = new  Dia(num);
        // Imprecion de mensaje con todos los datos
        System.out.println(dia.obtenerdia());
    }
}
