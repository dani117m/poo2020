package polimorfismodeudores;

public abstract class Cliente2 {
    protected String nombre;
    protected String numero;
    protected double capital;
    protected int plazo;
    protected double totalinteres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getTotalinteres() {
        return totalinteres;
    }

    public void setTotalinteres(double totalinteres) {
        this.totalinteres = totalinteres;
    }

    public abstract void calcularinteres();
}
