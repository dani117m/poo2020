package dieseño_seleccion;

import practica1.Triangulo;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args){
        // Ingresoe de los datos por medio un scanner por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        double horas = teclado.nextDouble();
        System.out.println("Ingrese su cuota por hora");
        double cuota = teclado.nextDouble();
        // envio de datos
        Empleado empleado = new  Empleado(nombre, horas, cuota);
        // Imprecion de mensaje con todos los datos
        System.out.println(empleado.calcularsueldo(nombre, horas, cuota));
    }
}
