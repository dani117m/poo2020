package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaCliente2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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
            System.out.println("4. Salir");


            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                bandera = 2;
            }
            switch (opcion) {
                case 1:
                    // contador
                    cont += 1;
                    /// creaciomn del objeto
                    Personal2 per = new Personal2();
                    //
                    System.out.println("Ingrese su N° de cuenta:");
                    per.setNumero(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    per.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital prestado");
                    per.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    per.setPlazo(teclado.nextInt());
                    // preoceso
                    per.calcularinteres();

                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont,  per.getNombre(),
                            per.getNumero(), per.getTotalinteres());
                    break;
                case 2:
                    cont += 1;
                    // creacion del objeto
                    Hipotecario2 hip = new Hipotecario2();
                    //
                    System.out.println("Ingrese su N° de cuenta:");
                    hip.setNumero(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    hip.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital prestado");
                    hip.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    hip.setPlazo(teclado.nextInt());

                    //
                    hip.calcularinteres();
                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont, hip.getNombre(),
                            hip.getNumero(), hip.getTotalinteres());
                    break;
                case 3:
                    // contador
                    cont += 1;
                    // creacion del objeto
                    AutoPrestamo2 auto = new AutoPrestamo2();
                    //solicitud de valores
                    System.out.println("Ingrese su N° de cuenta:");
                    auto.setNumero(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    auto.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital prestado");
                    auto.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese la inversión a lo largo de los años:");
                    auto.setPlazo(teclado.nextInt());
                    // Proceso
                    auto.calcularinteres();
                    // cadena donde se presentrarn los datos
                    cadena = String.format("%s %5d %20s %12s \t%15.2f\n", cadena, cont, auto.getNombre(),
                            auto.getNumero(), auto.getTotalinteres());
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
