package polimorfismoautomotriz;

public class Administracion2 extends Empleado2 {
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void calcularquincena(){
        quincena = sueldo/2;
    }
}
