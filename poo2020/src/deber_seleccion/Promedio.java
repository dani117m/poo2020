package deber_seleccion;

public class Promedio {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double promedio;
    private String mensaje;


    /**
     * Metodo para calcular el promedio de estudiante y mediante el mismo determinar si aprobo o no
     * @param nombre
     * @param nota1
     * @param nota2
     * @return result
     */
    public String obtener_Promedio (String nombre, double nota1, double nota2, double nota3, double nota4 ){
        String result = "";
        double suma = nota1 + nota2 + nota3 + nota4 ;
        if (suma > 60){
            result = "El alumno "+ nombre +" esta Aprobado con una nota de: " + suma;
        }else{
            result = "El alumno "+ nombre +" esta Reprobado con una nota de: " + suma;;
        }
        return result;
    }


    /**
     * Metodo que obtiene el valor de la variable nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar el valor de la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor de la variable Calf1
     * @return calf1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf1
     * @param nota1
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * Metodo para obtener el valor de la variable Calf2
     * @return calf2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf2
     * @param nota2
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * Metodo para obtener el valor de la variable Calf3
     * @return calf3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf3
     * @param nota3
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * Metodo para obtener el valor de la variable Calf4
     * @return calf4
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * Metodo para ctualizar el valor de la variable calf4
     * @param nota4
     */
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
