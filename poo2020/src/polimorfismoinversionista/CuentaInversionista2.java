package polimorfismoinversionista;

public abstract class CuentaInversionista2 {

    protected String nombre;
    protected double plazo;
    protected double taza = 3;
    protected String numeroCuenta;
    protected double total;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
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

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    // metodo abstracto
    public abstract void intereses();

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
