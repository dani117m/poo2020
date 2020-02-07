package intropoo;

public class Estudiante {

    // definicion de atributos globales

    private String nombre;
    private String correo;
    private String direccion;
    private String sexo;
    private String carrera;
    private String n_cedula;
    private int ciclo;
    private int edad;



    //-----------------------------------\\
    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obtener_nombre (){
        return nombre;
    }
    /**
     * Metodo para obtener el valor de la variable correo
     * @return correo
     */
    public String obtener_correo (){
        return correo;
    }
    /**
     * Metodo para obtener el valor de la variable direccion
     * @return direccion
     */
    public String jugar_direccion (){
        return direccion;
    }
    /**
     * Metodo para obtener el valor de la variable sexo
     * @return sexo
     */
    public String obtener_sexo (){
        return sexo;
    }
    /**
     * Metodo para obtener el valor de la variable carrera
     * @return carrera
     */
    public String obtener_carrera (){
        return carrera;
    }
    /**
     * Metodo para obtener el valor de la variable n_cedula
     * @return n_cedula
     */
    public String obtener_n_cedula (){
        return n_cedula;
    }
    /**
     * Metodo para obtener el valor de la variable ciclo
     * @return ciclo
     */
    public int obtener_ciclo () {return ciclo;}
    /**
     * Metodo para obtener el valor de la variable edad
     * @return edad
     */
    public int obtener_edad () {return edad;}

    /**
     * Metodo para obtener el valor de la variable nombre
     * @param nombre
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_nombre (String nombre) {
        this.nombre = nombre;

    }

    /**
     * Metodo para obtener el valor de la variable correo
     * @param correo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_correo (String  correo) {
        this.correo = correo;

    }

    /**
     * Metodo para obtener el valor de la variable direccion
     * @param direccion
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_direccion (String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para obtener el valor de la variable capacidad
     * @param sexo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_sexo (String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo para obtener el valor de la variable carrera
     * @param carrera
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_carrera (String carrera) {
        this.carrera = carrera;
    }

    /**
     * Metodo para obtener el valor de la variable n_cedula
     * @param n_cedula
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_n_cedula (String n_cedula) {
        this.n_cedula = n_cedula;
    }


    /**
     * Metodo para obtener el valor de la variable ciclo
     * @param ciclo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_ciclo (int ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @param edad
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_edad (int edad) {
        this.edad = edad;
    }


}


