package intropoo;

public class Docente {

    private String nombre;
    private String correo;
    private String edad;
    private String n_cedula;
    private String area_tr;
    private String sexo;
    private String titulo;


    //-----------------------------------------\\

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obetener_nombre (){ return nombre; }

    /**
     * Metodo para obtener el valor de la variable correo
     * @return correo
     */
    public String obetener_correo (){ return correo; }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return edad
     */
    public String obetener_edad (){ return edad; }

    /**
     * Metodo para obtener el valor de la variable n_cedula
     * @return n_cedula
     */
    public String obetener_n_cedula (){ return n_cedula; }

    /**
     * Metodo para obtener el valor de la variable area_tr
     * @return area_tr
     */
    public String obetener_area_tr (){ return area_tr; }

    /**
     * Metodo para obtener el valor de la variable sexo
     * @return sexo
     */
    public String obetener_sexo (){ return sexo; }

    /**
     * Metodo para obtener el valor de la variable tipo de titulo
     * @return titulo
     */
    public String obetener_titulo (){ return titulo; }

    /**
     * Metodo para obtener el valor de la variable nombre
     * @param nombre
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_nombre (String nombre) {
        this.nombre = nombre;

    }

    /**
     * Metodo para obtener el valor de la variable tipo
     * @param correo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_tipo (String correo) {
        this.correo = correo;

    }

    /**
     * Metodo para obtener el valor de la variable peso
     * @param edad
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_edad (String edad) {
        this.edad = edad;
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
     * Metodo para obtener el valor de la variable area_tr
     * @param area_tr
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_region (String area_tr) {
        this.area_tr = area_tr;
    }

    /**
     * Metodo para obtener el valor de la variable sexo
     * @param sexo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_sexo (String sexo) {
        this.sexo = sexo;
    }


    /**
     * Metodo para obtener el valor de la variable titulo
     * @param titulo
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_titulo (String titulo) {
        this.titulo = titulo;
    }





}
