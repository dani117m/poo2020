package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFgeometrica2 {
    public static void main(String[] args){
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 para iniciar ");
        int i = teclado.nextInt();
        teclado.nextLine();
        while ( i == 1) {

            System.out.println("Ingrese el nombre del la Figura");
            System.out.println("una figura:\n1. Cono\n2. Cilindro \n3. Cubo\n4. Esfera");
            nombre = teclado.nextLine();

            switch (nombre.toLowerCase()){
                case "cono":// Cono
                    Cono2 con = new Cono2();
                    System.out.println("Ingrese el radio");
                    con.setCradio(teclado.nextDouble());
                    System.out.println("Ingrese la altura");
                    con.setCaltura(teclado.nextDouble());
                    //
                    con.calcularVolumen();
                    //
                    System.out.println("El area del cono es: " + con.getVolumen());
                    break;
                case "cilindro":// Cilindro
                    Cilindro2 cil = new Cilindro2();
                    System.out.println("Ingrese el radio");
                    cil.setRadio(teclado.nextDouble());
                    System.out.println("Ingrese la altura");
                    cil.setAltura(teclado.nextDouble());
                    ///
                    cil.calcularVolumen();
                    //
                    System.out.println("El area del cilindro es: " + cil.getVolumen());
                    break;
                case "cubo": // Cubo
                    Cubo2 cub = new Cubo2();
                    System.out.println("Ingrese el Radio");
                    cub.setAristas(teclado.nextDouble());
                    //
                    cub.calcularVolumen();
                    //
                    System.out.println("El area de cubo: " + cub.getVolumen());
                    break;
                case "esfera": // Rectangulo
                    Esfera2 esf = new Esfera2();
                    System.out.println("Ingrese la Radio");
                    esf.setEradio(teclado.nextDouble());
                    //
                    esf.calcularVolumen();
                    //
                    System.out.println("El area del esfera es: " + esf.getVolumen());
                    break;
                default:
                    System.out.println("La opcion es incorrecta ");
            }
            System.out.println("Desea realizar algun otro, procceso ingrese el numero 1.Seguir 2.Salir");
            i = teclado.nextInt();
            teclado.nextLine();
        }

    }
}
