package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
    private double valor_mensual;

    public EmpleadoAsalariado(String nombre, String cargo, String dependencia){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }
    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

    public double calcularSueldoMensual(){
        valor_mensual = 1000;
        return valor_mensual;
    }
}
