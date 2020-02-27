package herencia_empleado;

public class EmpleadoporHora extends Empleado {
    protected int hora;
    protected double valor_hora;

    /**
     *
     * @param hora
     * @param valor_hora
     */
    public EmpleadoporHora(String nombre, String cargo, String dependecia, int hora, double valor_hora){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependecia;
        this.hora = hora;
        this.valor_hora = valor_hora;
    }

    ///
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    public double calcularSueldoporhora(){
        double total = hora * valor_hora;
        return total;
    }

}
