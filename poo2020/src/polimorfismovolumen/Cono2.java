package polimorfismovolumen;

public class Cono2 extends Fgeometrica2{
    private double Cradio;
    private double Caltura;

    public double getCradio() {
        return Cradio;
    }

    public void setCradio(double cradio) {
        Cradio = cradio;
    }

    public double getCaltura() {
        return Caltura;
    }

    public void setCaltura(double caltura) {
        Caltura = caltura;
    }
    @Override
    public void calcularVolumen(){
        volumen = (3.1415 * (Math.pow(Cradio,2) * Caltura))*1/3;

    }
}
