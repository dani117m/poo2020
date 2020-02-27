package herencia;

/**
 * Clase principal o superclase
 */
class Persona {
    // atributos comunes para todas las clases
    /**
     * Creacion de Atributos
     */
    protected String nombre;
    protected String identificacion;
    protected String estado_civil;
    protected String fecha_nacimiento;

    /**
     * obtener nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * establecer nombre
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtener identificacion
     * @return
     */

    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * establecer identificacion
     * @param identificacion
     */

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * obtener estado_civil
     * @return
     */

    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * establecer estado civl
     * @param estado_civil
     */

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * obtener fechanacimiento
     * @return
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * establecer fecha_nacimiento
     * @param fecha_nacimiento
     */

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
