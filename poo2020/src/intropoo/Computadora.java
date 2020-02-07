package intropoo;

public class Computadora {
    // definicion de atributos globales

    private String color;
    private String marca;
    private String generacion;
    private String nombre_procesador;
    private double precio;
    private double velocidad_procesador;
    private double tamaño;
    private double peso;

    /**
     * Metodo para obtener el valor de la variable color
     * @return color
     */
    public String obtener_color (){ return color; }
    /**
     * Metodo para obtener el valor de la variable marca
     * @return marca
     */
    public String obtener_marca (){ return marca; }

    /**
     * Metodo para obtener el valor de la variable generacion
     * @return generacion
     */
    public String obtener_generacion (){ return generacion; }
    /**
     * Metodo para obtener el valor de la variable nombre_procesador
     * @return nombre_procesador
     */
    public String obtener_nombreprocesador (){ return nombre_procesador; }

    /**
     * Metodo para obtener el valor de la variable precio
     * @return precio
     */
    public double obetener_precio (){
        return precio;
    }

    /**
     * Metodo para obtener el valor de la variable velocidad_procesador
     * @return velocidad_procesador
     */
    public double obetener_velocidad_procesador (){
        return velocidad_procesador;
    }

    /**
     * Metodo para obtener el valor de la variable tamaño
     * @return tamaño
     */
    public double obetener_tamaño (){
        return tamaño;
    }

    /**
     * Metodo para obtener el valor de la variable peso
     * @return peso
     */
    public double obetener_peso (){
        return peso;
    }


    /**
     * Metodo para obtener el valor de la variable color
     * @param color
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_color (String color) {
        this.color = color;

    }

    /**
     * Metodo para obtener el valor de la variable precio
     * @param precio
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_precio (double precio) {
        this.precio = precio;

    }

    /**
     * Metodo para obtener el valor de la variable peso
     * @param peso
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_peso (double peso) {
        this.peso = peso;
    }

    /**
     * Metodo para obtener el valor de la variable generacion
     * @param generacion
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_generacion (String generacion) {
        this.generacion = generacion;
    }

    /**
     * Metodo para obtener el valor de la variable marca
     * @param marca
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_marca (String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el valor de la variable nombre_procesador
     * @param nombre_procesador
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_nombre_procesador (String nombre_procesador) {
        this.nombre_procesador = nombre_procesador;
    }


    /**
     * Metodo para obtener el valor de la variable tamaño
     * @param tamaño
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_bateria (double tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Metodo para obtener el valor de la variable velocidad_procesador
     * @param velocidad_procesador
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_velocidad_procesador (double velocidad_procesador) {
        this.velocidad_procesador = velocidad_procesador;
    }



}
