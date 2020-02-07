package intropoo;

public class EjecutaTiempo {
    //psv para una auto completado rapido del main
    public static void main(String[] args) {
        // creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(35);
        String mostrar_tiempo = tiempo.obtener_tiempo();
        //sout para obetener un print de forma inmediata
        System.out.println(mostrar_tiempo);

    }
}
