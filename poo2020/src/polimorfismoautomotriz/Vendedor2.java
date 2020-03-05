package polimorfismoautomotriz;

public class Vendedor2 extends  Empleado2 {
    private double ventas;

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    @Override
    public void calcularquincena(){
        quincena = 400 + (ventas * 0.02);
    }
}
