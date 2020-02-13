package deber_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Se declara, crea e inicia el objeto de la clase Empleado
        Empleado empleado = new Empleado();
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULA SUELDO DOBLE DE UN EMPLEADO\n");
        System.out.println("Ingrese el nombre del Empleado");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas =  entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota por hora");
        double cuota = entrada.nextDouble();
        empleado.setNombre(nombre);
        empleado.setHoras(horas);
        empleado.setCuota(cuota);
        empleado.sueldototal();
        // imprecion de datos
        System.out.println("RESULTADOS\n");
        System.out.println("Nombre Empleado: " + empleado.getNombre());
        System.out.println("Sueldo = " + empleado.getSueldo());


    }

}


