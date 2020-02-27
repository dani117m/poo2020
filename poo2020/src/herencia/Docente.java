package herencia;

/**
 * clase herencia docente
 */
class Docente extends  Persona{
    // atributos propios de la clase Docente

    /**
     *
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nacimiento
     */
    public Docente(String area,String nombre, String identificacion, String estado_civil, String fecha_nacimiento){
        this.area = area;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;

    }

    //
    /**
     * Creacion del atributo area
     */
    protected String area;

    /**
     * Obtener area
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * establecer area
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Obtener ensenar
     */
    public void ensenar(){
        System.out.println("Método para enseñar ");
    }

    /**
     *  Obtener calificar
     */
    public void calificar(){
        System.out.println("Método para calificar");
    }
}
