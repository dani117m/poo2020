package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaAlmacenArreglos {

    public static void main(String[] args){
        // declarar variables
        String[] nombre = new String[5];
        String[] universidad = new String[5];
        String[] cel = new String[5];
        String[] edad = new String[5];

        //importacion de la clase almacenarreglos
        AlmacenArreglos almacen = new AlmacenArreglos();
        // importacion de scanner
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        while(i < nombre.length){
            System.out.println("Ingrese su nombre");
            nombre[i] = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad[i] = entrada.nextLine();
            // limpieza del buffer
            entrada.nextLine();
            System.out.println("Ingrese su universidad");
            universidad[i] = entrada.nextLine();
            System.out.println("Ingrese su numero celular");
            cel[i] = entrada.nextLine();


            i++;
        }
        // llamada de metodos
        almacen.setNombre(nombre);
        almacen.setEdad(edad);
        almacen.setUniversidad(universidad);
        almacen.setCelular(cel);
        // imprimir valores
        almacen.almacen_Arreglos();




    }


}
