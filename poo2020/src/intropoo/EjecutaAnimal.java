package intropoo;

public class EjecutaAnimal {

    public static void main(String[] args) {
        //Creacion del objeto caracteristicas de un animal
        Animal caracteristicas = new caracteristicas();
        caracteristicas.actualizar_hora(10);
        caracteristicas.actualizar_minuto(51);
        caracteristicas.actualizar_segundo(35);
        String mostrar_tiempo = tiempo.obtener_tiempo();
        //sout para obetener un print de forma inmediata
        System.out.println(mostrar_tiempo);


    }
}
