package intropoo;

public class EjecutaAnimal {

    public static void main(String[] args) {
        //Creacion del objeto caracteristicas de un animal
        Animal crt = new Animal();
        crt.actualizar_nombre("Whisky");
        crt.actualizar_tipo("canino");
        crt.actualizar_peso(12);
        String mostrar_crt = crt.obtener_crt();
        //sout para obetener un print de forma inmediata
        System.out.println(mostrar_crt);


    }
}
