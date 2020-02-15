package deber_seleccion;

import java.util.Scanner;

public class EjecutaPromedia {
    public static void main(String[] args) {
        // Se declara, crea e inicia el objeto de la clase Estudiante
        Promedio promedio = new Promedio();
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULAR PROMEDIO ESTUDIANTE\n");
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        // Ingreso de datos
        System.out.println("Ingrese nota 1");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese nota 4");
        double nota4 = entrada.nextDouble();
        promedio.setNota1(nota1);
        promedio.setNota2(nota2);
        promedio.setNota3(nota3);
        promedio.setNota4(nota4);

        // Impresion de datos
        System.out.println("RESULTADOS ");
        System.out.println(promedio.obtener_Promedio(nombre, nota1, nota2, nota3, nota4));

    }
}
