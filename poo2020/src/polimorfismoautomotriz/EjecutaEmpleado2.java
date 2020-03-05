package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado2 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion e inicializacion de variables
        int opcion;
        int contador = 0;
        int bandera = 1;
        String cadena = String.format("%20s\nRFC%20s%20S%20S%20S\n", "REPORTE DE NOMINA QUINCENAL","NOMBRE", "DEPTO",
                "PUESTO","QUINCENA");

        //  Dependiendo de la eleccion del usuario se obtendra datos diferentes y seran almacenados en una cadena
        do {
            System.out.println("------------------------------");
            System.out.println("Que clase de empleado desea ingresar?\n1.Administrativo\n2.Mecanico\n3.Vendedor");
            System.out.println("------------------------------");
            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                Administracion2 adm = new Administracion2();
                System.out.println("Ingrese el nombre del empleado:");
                adm.setNombre(teclado.nextLine());
                System.out.println("Ingrese el departamento del empleado: ");
                adm.setDepartamento(teclado.nextLine());
                System.out.println("Ingrese el puesto del empleado: ");
                adm.setPuesto(teclado.nextLine());
                System.out.println("Ingrese el sueldo mensual del administrativo:");
                adm.setSueldo(teclado.nextDouble());
                // contador
                contador = contador + 1;
                // proceso
                adm.calcularquincena();
                // creacion del empleado Administrativo
                cadena = String.format("%s%d%20s%20s%20s%20.2f\n", cadena, contador, adm.getNombre(),
                        adm.getDepartamento(), adm.getPuesto(), adm.getQuincena());
            } else {
                if (opcion == 2) {
                    // creacion del empleado Mecanico
                    Mecanica2 mec = new Mecanica2();
                    System.out.println("Ingrese el nombre del empleado:");
                    mec.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el departamento del empleado: ");
                    mec.setDepartamento(teclado.nextLine());
                    System.out.println("Ingrese el puesto del empleado: ");
                    mec.setPuesto(teclado.nextLine());
                    System.out.println("Ingrese el el valor del trabajo realizado:");
                    mec.setSalario(teclado.nextDouble());
                    //contador
                    contador = contador + 1;
                    //metodo
                    mec.calcularquincena();

                    cadena = String.format("%s%d%20s%20s%20s%20.2f\n",cadena, contador, mec.getNombre(),
                            mec.getDepartamento(), mec.getPuesto(), mec.getQuincena());
                } else {
                    // creacion del empleado Vendedor
                    Vendedor2 ven = new Vendedor2();
                    //
                    System.out.println("Ingrese el nombre del empleado:");
                    ven.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el departamento del empleado: ");
                    ven.setDepartamento(teclado.nextLine());
                    System.out.println("Ingrese el puesto del empleado: ");
                    ven.setPuesto(teclado.nextLine());
                    System.out.println("Ingrese el total de ventas realizadas:");
                    ven.setVentas(teclado.nextDouble());
                    ///
                    contador = contador + 1;
                    // proceso
                    ven.calcularquincena();

                    cadena = String.format("%s%d%20s%20s%20s%20.2f\n",cadena, contador, ven.getNombre(),
                            ven.getDepartamento(), ven.getPuesto(), ven.getQuincena());
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
