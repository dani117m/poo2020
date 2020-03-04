package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion e inicializacion de variables
        int opcion;
        int contador = 0;
        int bandera = 1;
        String nombre, departamento, puesto;
        double sueldoMensual, precioTrabajo, ventas;
        String cadena = String.format("%20s\nRFC%20s%20S%20S%20S\n", "REPORTE DE NOMINA QUINCENAL","NOMBRE", "DEPTO",
                "PUESTO","SUELDO QUINCENA");

        //  Dependiendo de la eleccion del usuario se obtendra datos diferentes y seran almacenados en una cadena
        do {
            System.out.println("------------------------------");
            System.out.println("Que clase de empleado desea ingresar?\n1.Administrativo\n2.Mecanico\n3.Vendedor");
            System.out.println("------------------------------");
            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del empleado:");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el departamento del empleado: ");
                departamento = teclado.nextLine();
                System.out.println("Ingrese el puesto del empleado: ");
                puesto = teclado.nextLine();
                System.out.println("Ingrese el sueldo mensual del administrativo:");
                sueldoMensual = teclado.nextDouble();
                contador = contador + 1;

                // creacion del empleado Administrativo
                Administracion adm = new Administracion(sueldoMensual, nombre, departamento, puesto);
                cadena = String.format("%s%d%20s%20s%20s%20.2f\n", cadena, contador, nombre, departamento, puesto, adm.Quincenaadm());
            } else {
                if (opcion == 2) {
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el departamento del empleado: ");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el el valor del trabajo realizado:");
                    precioTrabajo = teclado.nextDouble();
                    contador = contador + 1;

                    // creacion del empleado Mecanico
                    Mecanica Mec = new Mecanica(precioTrabajo, nombre, departamento, puesto);
                    cadena = String.format("%s%d%20s%20s%20s%20.2f\n", cadena, contador, nombre, departamento, puesto, Mec.Quincenamecanico());
                } else {
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el departamento del empleado: ");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el total de ventas realizadas:");
                    ventas = teclado.nextDouble();
                    contador = contador + 1;

                    // creacion del empleado Vendedor
                    Vendedor ven = new Vendedor(ventas, nombre, departamento, puesto);
                    cadena = String.format("%s%d%20s%20s%20s%20.2f\n", cadena, contador, nombre, departamento, puesto, ven.quincenaVendedor());
                }
            }
            System.out.println("Desea ingresar mas empleados?\n1.Si\n2.No");
            bandera = teclado.nextInt();
            if(bandera ==  2){
                bandera = 2;
            }
        }while(bandera ==1);

        System.out.println(cadena);

    }
}
