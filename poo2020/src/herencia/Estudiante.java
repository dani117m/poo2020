package herencia;

/**
 * Clase que hereda de la clase persona,
 * contendra todos los atributos y metodos definidos en persona
 */
class Estudiante extends Persona {
    // atributos propios de esta clase

    /**
     * Constructor para la clase estudiante
     * @param carrera
     * @param nombre
     * @param indentificacion
     * @param esta_civil
     * @param fecha_nacimiento
     */
    public Estudiante(String carrera, String nombre, String indentificacion,String esta_civil, String fecha_nacimiento){
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = indentificacion;
        this.estado_civil = esta_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Método para matricular ");
    }

    public void aprender(){
        System.out.println("Método para aprender ");
    }

}
