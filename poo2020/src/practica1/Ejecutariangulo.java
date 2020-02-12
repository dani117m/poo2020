package practica1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;
public class Ejecutariangulo {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double nota2 = teclado.nextDouble();

        Triangulo triangulo = new  Triangulo(nota1, nota2);

        System.out.println(triangulo.Obtener_Area(nota1, nota2));
    }

}
