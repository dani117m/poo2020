package dieseño_seleccion;

public class Empleado {
    private String nombre;
    private double hora;
    private double cuota;

    /**
     * \
     * @param nombre
     * @param hora
     * @param cuota
     */

    public Empleado (String nombre, double hora, double cuota){
        this.nombre = nombre;
        this.hora = hora;
        this.cuota = cuota;
    }
    /**
     * Metodo para obtener el sueldo total a demas de imprimir un mensaje completo con todos los datos
     * @return mensaje
     */
    public String calcularsueldo(String nombre, double hora, double cuota){
        String mensaje = "";
        if (hora <= 40) {
            double sueldo = hora * cuota;
            mensaje = "El señor "+ nombre +"\nHa trabajo "+hora+" horas \nCon un cuota de "+cuota+
                    "\n Sus ganancia total es de "+sueldo+" $";
        }else if(hora >=41){
            double sueldo = (40 * cuota) + (hora - 40) * (cuota * 2);
            mensaje = "El señor "+ nombre +"\nHa trabajo "+hora+" horas \nCon un cuota de "+cuota+
                    "\nSus ganancia total es de "+sueldo+" $";

        }
        return mensaje;
    }
    /**
     * Metodo para obtener el valor de la variable hombre
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el valor de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener el valor de la variable hora
     * @return hora
     */
    public double getHora() {
        return hora;
    }
    /**
     * Metodo para obtener el valor de la variable hora
     * @param hora
     */

    public void setHora(double hora) {
        this.hora = hora;
    }
    /**
     * Metodo para obtener el valor de la variable cuota
     * @return cuota
     */

    public double getCuota() {
        return cuota;
    }

    /**
     * Metodo para obtener el valor de la variable cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }


}
