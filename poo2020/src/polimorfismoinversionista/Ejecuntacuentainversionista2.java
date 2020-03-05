package polimorfismoinversionista;

import java.util.Scanner;

public class Ejecuntacuentainversionista2 {
    public static void main(String[] args) {

        // Declaracion e inicializacion de variables
        Scanner teclado = new Scanner(System.in);

        String cadena = "\t\t\t\tREPORTE INVERSIONITAS\nNo.Cliente\t\t\tNombre\t\tNo.Cuenta\t\tInterés Ganado\n";
        double capitalInt, plazo;
        int bandera = 1;
        int opcion;
        int cont = 0;
        // Ciclo para el ingreso y lectura de datos
        do {

            System.out.println("Digite una opción:");
            System.out.println("1. CUENTA DE AHORRO");
            System.out.println("2. CUENTA MAESTRA");
            System.out.println("3. PAGARE");
            System.out.println("4. SALIR");

            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                bandera = 2;
            }
            //  Dependiendo de la eleccion del usuario se obtendra datos diferentes y seran almacenados en una cadena
            switch (opcion) {
                case 1:

                    cont += 1;
                    CuentaAhorros2 ahorro = new CuentaAhorros2();
                    System.out.println("Ingrese su N° de cuenta:");
                    ahorro.setNumeroCuenta(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    ahorro.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital invertido");
                    ahorro.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    ahorro.setPlazo(teclado.nextDouble());
                    //
                    ahorro.intereses();
                    //
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont,ahorro.nombre,
                            ahorro.getNumeroCuenta(), ahorro.getTotal());
                    break;
                case 2:
                    cont += 1;
                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaMaestra2 master = new CuentaMaestra2();

                    System.out.println("Ingrese su N° de cuenta:");
                    master.setNumeroCuenta(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    master.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital invertido");
                    master.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    master.setPlazo(teclado.nextDouble());
                    // calculado de interes
                    master.intereses();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, master.getNombre(),
                            master.getNumeroCuenta(), master.getTotal());
                    break;
                case 3:
                    cont += 1;
                    // CREACION DEL OBJETO
                    Pagar2 saldo = new Pagar2();
                    //
                    System.out.println("Ingrese su N° de cuenta:");
                    saldo.setNumeroCuenta(teclado.nextLine());
                    System.out.println("Ingrese su nombre:");
                    saldo.setNombre(teclado.nextLine());
                    System.out.println("Ingrese el capital invertido");
                    saldo.setCapital(teclado.nextDouble());
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    saldo.setPlazo(teclado.nextDouble());

                    ///
                    saldo.intereses();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, saldo.getNombre(),
                            saldo.getNumeroCuenta(), saldo.getTotal());
                    break;
                case 4:
                    System.out.println("Gracias\nTenga un buen dia");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }while (bandera == 1);
        //  Salida de datos
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%s\nTOTAL %d INVERSIONES\n",cadena,cont);
        System.out.println("-------------------------------------------------------------------");
    }
}
