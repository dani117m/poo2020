package herenciavolumen;

public class Cono extends  Fgeometrica{
    private double Cradio;
    private double Caltura;
    private double CvolumenCub;

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

    public double getCvolumenCub() {
        return CvolumenCub;
    }

    public void setCvolumenCub(double cvolumenCub) {
        CvolumenCub = cvolumenCub;
    }
    public double volumenCono(double Cradio, double Caltura){
        CvolumenCub = (3.1415 * (Math.pow(Cradio,2) * Caltura))*1/3;
        return CvolumenCub;
    }
}
