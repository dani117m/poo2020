package herenciadeudores;

import java.util.Scanner;

public class EjecutaCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numero, nombre;
        String cadena = "\t\t\t\tREPORTE DE CLIENTES DEUDORES\nNo. Cliente\t\t\t Nombre\t\tNo. Cuenta\t\tInterés por pagar\n" +
                "----------------------------------------------------------------\n";
        double capital;
        int bandera = 1;
        int opcion, plazo;
        int cont = 0;
        do {
            System.out.println("Ingrese la actividad a realizar:");
            System.out.println("1. Prestamo personal");
            System.out.println("2. Prestamo hipotecaria");
            System.out.println("3. Prestamo automovil");


            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                bandera = 2;
            }
            switch (opcion) {
                case 1:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    plazo = teclado.nextInt();

                    // creacion del objeto
                    Personal per = new Personal(nombre, numero, capital, plazo);
                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont, nombre, numero, per.getInteres());
                    break;
                case 2:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    plazo = teclado.nextInt();

                    // creacion del objeto
                    Hipotecario hip = new Hipotecario(nombre, numero, capital, plazo);
                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont, nombre, numero, hip.obtenerInteres());
                    break;
                case 3:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numero = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    plazo = teclado.nextInt();

                    // creacion del objeto
                    AutoPrestamo auto = new AutoPrestamo(nombre, numero, capital, plazo);
                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont, nombre, numero,auto.obtenerInteres());
                    break;
                case 4:
                    System.out.println("GRACIAS\nTENGA UN BUEN DIA ");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }while (bandera == 1);
        System.out.printf("%s\nTOTAL %d CLIENTES\n",cadena,cont);

    }
}
