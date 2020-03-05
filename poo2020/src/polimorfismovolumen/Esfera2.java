package polimorfismovolumen;

public class Esfera2 extends Fgeometrica2{
    private double Eradio;

    public double getEradio() {
        return Eradio;
    }

    public void setEradio(double eradio) {
        Eradio = eradio;
    }
    @Override
    public void calcularVolumen() {
        volumen = 4 / 3 * (3.1415 * Math.pow(Eradio, 3));

    }
}
