package herenciaautomotriz;

public class Mecanica extends Empleado{
    private double salario;
    private double quincena;

    public Mecanica(double precioTrabajo, String nombre, String departamento, String puesto ){
        this.salario = salario;
        this.setNombre(nombre);
        this.setDepartamento(departamento);
        this.setPuesto(puesto);
    }
    public double Quincenamecanico(){
        quincena = 0.04 * salario;
        return quincena;
    }
}
