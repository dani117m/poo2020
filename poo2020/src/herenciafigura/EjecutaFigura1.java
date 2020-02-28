package herenciafigura;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import practica1.Triangulo;

import java.util.Scanner;

public class EjecutaFigura1 {
    public static void main(String[] args){
        String nombre;
        double base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 para iniciar ");
        int i = teclado.nextInt();
        teclado.nextLine();
        while ( i == 1) {
            System.out.println("Ingrese el nombre del la Figura");
            System.out.println("- Triangulo\n- Rectangulo\n- Cuadrado\n- Circulo");
            nombre = teclado.nextLine();
            Figura1 op = new Figura1();
            op.setNomFigura(nombre);

            switch (op.getNomFigura()) {
                case "triangulo":// triangulo
                    System.out.println("Ingrese la base");
                    base = teclado.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura = teclado.nextDouble();

                    Triangulo1 tri = new Triangulo1(base, altura);
                    tri.calcular_area(base, altura);
                    System.out.println("El area del triangulo es: " + tri.getAreaTria());
                    break;
                case "rectangulo":// rectangulo
                    System.out.println("Ingrese la base");
                    base = teclado.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura = teclado.nextDouble();

                    Rectangulo1 rec = new Rectangulo1(base, altura);
                    rec.calcularAreaRecta(base, altura);
                    System.out.println("El area del rectangulo es: " + rec.getAreaRecta());
                    break;
                case "cuadrado": // cuadrado
                    System.out.println("Ingrese el lado");
                    base = teclado.nextDouble();

                    Cuadrado1 cuad = new Cuadrado1(base);
                    cuad.calcularAreaCuad(base);
                    System.out.println("El area de cuadrado: " + cuad.getAreaCuad());
                    break;
                case "circulo": // circulo
                    System.out.println("Ingrese el radio");
                    base = teclado.nextDouble();

                    Circulo1 cir = new Circulo1(base);
                    cir.calcularAreaCirc(base);
                    System.out.println("El area del circulo es: " + cir.getAreaCirc());
                    break;
                default:
                    System.out.println("La opcion es incorrecta ");
            }
            System.out.println("Desea realizar algun otro proceso 1: si 2:no");
            i = teclado.nextInt();
            teclado.nextLine();
        }

    }
}
