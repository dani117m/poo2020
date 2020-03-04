package herenciaautomotriz;

public class Vendedor extends Empleado {
    private double ventas;
    private double quincena;

    public Vendedor(double ventas, String nombre, String departamento, String puesto ){
        this.ventas = ventas;
        this.setNombre(nombre);
        this.setDepartamento(departamento);
        this.setPuesto(puesto);

    }
    public double quincenaVendedor(){
        quincena = 400 + (ventas * 0.02);
        return quincena;
    }
}
