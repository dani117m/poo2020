package herenciainversionistas;

public class CuentaInversionista {
    protected String nombre;
    protected double plazo;
    protected double taza = 3;
    protected String numeroCuenta;

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlaza(double plazo) {
        this.plazo = plazo;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        numeroCuenta = numeroCuenta;
    }
}
