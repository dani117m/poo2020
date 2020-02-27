package herencia;

import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args){
        // creación de objeto de la clase estudiante

        //declaracion de varaibles
        String nombre, indetificacion, estado_civil, carrera, fecha;


        Scanner teclado = new Scanner(System.in);

        System.out.println("CREACION DE OBJETO ESTUDIANTE: ");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        indetificacion = teclado.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        fecha = teclado.nextLine();
        teclado.nextLine();

    /*
        est.setNombre(nombre);
        est.setIdentificacion(indetificacion);
        est.setCarrera(carrera);
        est.setEstado_civil(estado_civil);
        est.setFecha_nacimiento(fecha);


     */
        Estudiante est = new Estudiante(carrera, nombre, indetificacion,estado_civil, fecha);
        System.out.println("------------------------------");
        System.out.println("Datos de objeto estudiante ");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("identificacion: " + est.getIdentificacion());
        System.out.println("Carrera: " + est.getCarrera() );
        System.out.println("Estado civil: " + est.getEstado_civil());
        System.out.println("Fecha de naciemiento: " + est.getFecha_nacimiento());

        ////////////////////////////////////////////////////////
        System.out.println("\nCREACION DE OBJETO DOCENTE: ");
        System.out.println("Ingrese su Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        indetificacion = teclado.nextLine();
        System.out.println("Ingrese su Area: ");
        String area = teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        fecha = teclado.nextLine();

        Docente est2 = new Docente(area, nombre, indetificacion,estado_civil, fecha);
        System.out.println("------------------------------");
        System.out.println("Datos de objeto estudiante ");
        System.out.println("Nombre: " + est2.getNombre());
        System.out.println("identificacion: " + est2.getIdentificacion());
        System.out.println("Area: " + est2.getArea());
        System.out.println("Estado civil: " + est2.getEstado_civil());
        System.out.println("Fecha de naciemiento: " + est2.getFecha_nacimiento());

    }

}
