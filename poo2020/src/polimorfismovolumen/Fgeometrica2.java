package polimorfismovolumen;

public abstract class Fgeometrica2 {
    protected String nomFigura;
    protected double volumen;

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public abstract void calcularVolumen();
}
