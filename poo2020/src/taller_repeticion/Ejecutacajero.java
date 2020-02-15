package taller_repeticion;

import java.util.Scanner;

public class Ejecutacajero {
    public static void main(String[] args) {
        // variables inicializadas
        double saldo;
        int opcion;
        int inicio;
        // importacion de scanner
        Scanner entrada = new Scanner(System.in);
        // ingresoe de datos
        System.out.println("Bienvenido al banco ");
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        // este valor es requerido para teners una idea de cuanto saldo tiene el usuario
        System.out.println("Es necesario que ingrese su saldo inicial");
        saldo = entrada.nextDouble();
        // limpieza de buffer
        entrada.nextLine();
        System.out.println("Ingrese 1 para iniciar");
        inicio= entrada.nextInt();
        Cajero cajero = new Cajero();

        while (inicio == 1){
            System.out.println("Bienveido Señor "+nombre+"\nIngrese el numero de opcion\n");
            System.out.println("1:Retiro\n2:Deposito\n3:Saldo");
            opcion = entrada.nextInt();
            cajero.setSaldo(saldo);
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que desea retirar");
                    double retiro = entrada.nextDouble();
                    cajero.opcion_retiro(retiro);
                    System.out.println("Usted a retirado " +retiro+" saldo actual "+ cajero.getSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese al valor ha depositar");
                    double deposito = entrada.nextDouble();
                    cajero.opcion_deposito(deposito);
                    // limpieza de buffer
                    entrada.nextLine();

                    System.out.println("Cantidad depositada "+ deposito +" saldo actual "+ cajero.getSaldo());

                case 3:
                    System.out.println("Saldo actual " + cajero.getSaldo());
                    break;
                default:
                    System.out.println("opcion incorrecta ");

            }
            System.out.println("Desea realizar algun otro proceso 1: si 2:no");
            inicio = entrada.nextInt();

        }
    }
}
