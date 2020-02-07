package diseniopoo;

import javax.xml.validation.SchemaFactoryConfigurationError;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EjecutaCerveza {

    public static void main(String[] args) {
        /*
        // Creacion de objeto venta total
        Cerveza total = new Cerveza(1.75, 22, "pilsener", "litrona");
        System.out.println("Nombre: "+total.getNombre());
        System.out.println("tipo: "+total.getTipo());
        Double mostrar_total = total.obtener_totalventas();
        // se imprimen el total de la venta
        System.out.println("total de ventas: "+mostrar_total);

        Cerveza total2 = new Cerveza(1.25, 100, "pilsener", "light");
        System.out.println("Nombre: "+total2.getNombre());
        System.out.println("tipo: "+total2.getTipo());
        Double mostrar_total2 = total2.obtener_totalventas();
        // se imprimen el total de la venta
        System.out.println("total de ventas: "+mostrar_total2);

        Cerveza total3 = new Cerveza(1.50, 50, "pilsener", "normal");
        System.out.println("Nombre: "+total3.getNombre());
        System.out.println("tipo: "+total3.getTipo());
        Double mostrar_total3 = total3.obtener_totalventas();
        // se imprimen el total de la venta
        System.out.println("total de ventas: "+mostrar_total3);
        */
        //---- sacanner//////
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cerveza");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el tipo de cerveza");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo");
        double costo = teclado.nextDouble();
        System.out.println("Ingrese el numero de unidades vendidas");
        int unidades_vendidas = teclado.nextInt();
        Cerveza total = new Cerveza(costo, unidades_vendidas,tipo,nombre);
        Cerveza cerveza = new Cerveza(costo, unidades_vendidas, nombre, tipo);
        // imprecion de datos
        System.out.println(cerveza.mensajefinal());

    }
}
