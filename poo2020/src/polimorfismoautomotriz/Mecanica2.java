package polimorfismoautomotriz;

public class Mecanica2 extends Empleado2{
    private double salario;
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void calcularquincena(){
        quincena = 0.04 * salario;
    }
}
