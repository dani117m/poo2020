package herenciaautomotriz;

public class Administracion extends Empleado {
    private double sueldo;
    private double quincena;


    public Administracion(double sueldoMensual, String nombre, String departamento, String puesto ){
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    public double Quincenaadm(){
        quincena = sueldo/2;
        return quincena;
    }
}
