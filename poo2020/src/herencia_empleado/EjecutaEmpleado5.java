package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado5 {

    public static void main(String[] args){
        String nombre, cargo, dependecia;
        int horas;
        double valorhora;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usted es un empleado asalariado 1:si 2:no ");
        int i = teclado.nextInt();
        teclado.nextLine();
        if (i == 1){
        System.out.println("CREACION DE OBJETO ESTUDIANTE: ");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese su Cargo: ");
        cargo = teclado.nextLine();
        System.out.println("Ingrese su dependecia: ");
        dependecia = teclado.nextLine();
        EmpleadoAsalariado est = new EmpleadoAsalariado(nombre, cargo,dependecia);
            System.out.println("------------------------------");
            System.out.println("Datos de objeto estudiante ");
            System.out.println("Nombre: " + est.getNombre());
            System.out.println("cargo: " + est.getCargo());
            System.out.println("dependecia: " + est.getDependencia());
            System.out.println("Valor a pagar es: " + est.calcularSueldoMensual());

        }else{
            System.out.println("CREACION DE OBJETO ESTUDIANTE: ");
            System.out.println("Ingrese el nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese su Cargo: ");
            cargo = teclado.nextLine();
            System.out.println("Ingrese su dependecia: ");
            dependecia = teclado.nextLine();
            System.out.println("Ingrese horas trabajadas: ");
            horas = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese el valor por hora: ");
            valorhora = teclado.nextDouble();
            teclado.nextLine();
            ///
            EmpleadoporHora est2 = new EmpleadoporHora(nombre, cargo,dependecia,horas, valorhora);
            System.out.println("------------------------------");
            System.out.println("Datos de objeto estudiante ");
            System.out.println("Nombre: " + est2.getNombre());
            System.out.println("cargo: " + est2.getCargo());
            System.out.println("dependecia: " + est2.getDependencia());
            System.out.println("Valor a pagar es: " + est2.calcularSueldoporhora());

        }



    }

}
