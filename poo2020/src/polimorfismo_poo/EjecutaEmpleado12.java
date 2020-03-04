package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static  void main(String[] args){
        /// cracion de objeto
        EmpleadoPorHoras2 emphoras = new EmpleadoPorHoras2();
        Scanner teclado = new Scanner(System.in);
        /// obtener quincenal
        System.out.println("Calculo sueldo quincenal empleadop or horas ");
        System.out.println("Ingrese horas trabajadas: ");
        emphoras.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese la cuota por hora ");
        emphoras.setCuota_por_hora(teclado.nextDouble());
        emphoras.calcularsueldo();
        System.out.println("El sueldo quincenal es: "+ emphoras.getSueldo());

        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de empleado asalariado");
        System.out.println("Ingrese sueldo mensual ");
        empAs.setSueldo_mensual(teclado.nextDouble());
        empAs.calcularsueldo();

        System.out.println("Sueldo quincenal es: "+ empAs.getSueldo());


    }
}
