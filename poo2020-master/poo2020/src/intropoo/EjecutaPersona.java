package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {
        // creacion de objeto persona

        Persona persona = new Persona ( "Masculino", "Catolica",18, "Daniel");
        System.out.println(persona.getNombre());
        System.out.println("edad: "+persona.getEdad());
        System.out.println("religion: "+persona.getGenero());
        System.out.println("genero: "+persona.getReligion());

        // creacion de objeto con constructor 2
        Persona persona2 = new Persona ("femenino", "catolica",20 );
        System.out.println(persona2.getEdad());
        System.out.println("edad: "+persona2.getGenero());
        System.out.println("religion: "+persona2.getReligion());

        // creacion de objeto con constructor 3
        Persona persona3 = new Persona ("masculino", "protestante",19 );
        System.out.println(persona3.getEdad());
        System.out.println("edad: "+persona3.getGenero());
        System.out.println("religion: "+persona3.getReligion());
        System.out.println("Nombre de persona 2: "+ persona2.getNombre());



    }
}
