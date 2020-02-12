package deber1;

import diseniopoo.Cerveza;

import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la nota del primer bimestre");
        double nota1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre");
        double nota2 = teclado.nextDouble();
        Estudiante total = new Estudiante(nota2, nota1, nombre);
        Estudiante estudiante = new Estudiante(nota2, nota1, nombre);
        // imprecion de datos
        System.out.println(estudiante.obtener_promedio(nombre, nota1, nota2));

    }
}
