package herenciainversionistas;

public class Saldohapagar extends CuentaInversionista{
    private double capital;
    public Saldohapagar(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.setNombre(nombre);
    }

    public double calcularIntereses(){
        double intereses;
        intereses = capital * (getTaza() / 100) * plazo;
        return intereses;
    }
}
