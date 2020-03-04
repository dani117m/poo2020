package herenciainversionistas;

public class CuentaMaestra extends CuentaInversionista {
    private double capital;

    public CuentaMaestra(String numeroCuenta, double capital, String nombre, double plazo) {
        this.plazo = plazo;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;

    }
    public double calcularIntereses(){
        double intereses;
        intereses = capital * (taza / 100) * plazo;
        return intereses;
    }
}
