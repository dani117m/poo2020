package herenciainversionistas;

public class CuentaAhorros extends CuentaInversionista {
    private double capital;

    public CuentaAhorros(String numeroCuenta, double capital, String nombre, double plazo ) {
        this.capital = capital;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.plazo = plazo;
        this.taza = getTaza();
    }

    public double calcularIntereses(){
        double intereses;
        intereses = capital * (taza / 100) * plazo;
        return intereses;
    }
}
