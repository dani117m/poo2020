package intropoo;

public class Tiempo {
    // definición de atributos globales
    private int hora;
    private int minuto;
    private int segundo;


    //
    /**
     * Metodo para obtener el valor de la variable hora
     * @return hora
     */
    public int obetener_hora (){
        return hora;
    }

    /**
     * Metodo para obtener el valor de la variable hora
     * @return minuto
     */
    public int obtener_minutos(){
        return minuto;
    }

    /**
     * Metodo para obtener el valor de la variable hora
     * @return segundo
     */
    public int obtener_segundo (){
        return segundo;
    }
    /**
     * Metodo para obtener el tiempo con hora minutos y segundos
     * @return tiempo
     */
    public String obtener_tiempo (){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }
    /**
     * Metodo para obtener el valor de la variable hora
     * @param hora
     */
    // void hace referencia que esta variable no retornara datos
    public void actualizar_hora (int hora){
        this.hora = hora;
        // con el this hacemos referencia a variables globales
    }

    /**
     * Metodo para obtener el valor de la variable minuto
     * @param minuto
     */
    public void actualizar_minuto (int minuto){
        this.minuto = minuto;
        // con el this hacemos referencia a variables globales
    }
    /**
     * Metodo para obtener el valor de la variable segundo
     * @param segundo
     */
    public void actualizar_segundo (int segundo){
        this.segundo = segundo;
        // con el this hacemos referencia a variables globales
    }



}
