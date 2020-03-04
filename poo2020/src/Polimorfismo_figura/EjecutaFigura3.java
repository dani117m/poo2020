package Polimorfismo_figura;

import java.util.Scanner;

public class EjecutaFigura3 {
    public static void main(String[] args){
        String nombre;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 para iniciar ");
        int i = teclado.nextInt();
        teclado.nextLine();
        while ( i == 1) {
            System.out.println("Ingrese el nombre del la Figura");
            System.out.println("una figura:\n1. Cuadrado\n2. Circulo \n3. Triangulo\n4. Rectangulo");
            nombre = teclado.nextLine();

            switch (nombre){
                case "Cuadrado":// cuadrado
                    Cuadrado3 cua = new Cuadrado3();
                    System.out.println("Ingrese el numero de lados");
                    cua.setLadoCuad(teclado.nextDouble());
                    cua.calcularArea();
                    System.out.println("El area del Cuadrado es: " + cua.getArea());
                    break;
                case "Circulo":// Circulo
                    Circulo3 cir = new Circulo3();
                    System.out.println("Ingrese la radio");
                    cir.setRadioCirc(teclado.nextDouble());
                    cir.calcularArea();
                    System.out.println("El area del Circulo es: " + cir.getArea());
                    break;
                case "Triangulo": // Triangulo
                    Triangulo3 tri = new Triangulo3();
                    System.out.println("Ingrese el Radio");
                    tri.setBaseTria(teclado.nextDouble());
                    System.out.println("Ingrese el altura");
                    tri.setAlturaTria(teclado.nextDouble());
                    tri.calcularArea();
                    System.out.println("El area de Triangulo: " + tri.getArea());
                    break;
                case "Rectangulo": // Rectangulo
                    Rectangulo3 rec = new Rectangulo3();
                    System.out.println("Ingrese la base");
                    rec.setBaseRecta(teclado.nextDouble());
                    System.out.println("Ingrese la latura");
                    rec.calcularArea();
                    System.out.println("El area del Rectangulo es: " + rec.getArea());
                    break;
                default:
                    System.out.println("La opcion es incorrecta ");
            }
            System.out.println("Desea realizar algun otro procceso ingrese el numero 1.Seguir 2.Salir");
            i = teclado.nextInt();
            teclado.nextLine();
        }

    }
}
