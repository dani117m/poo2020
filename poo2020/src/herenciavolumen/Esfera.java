package herenciavolumen;

public class Esfera extends Fgeometrica{
    private double Eradio;
    private double EvolumenEsf;

    public double getEradio() {
        return Eradio;
    }

    public void setEradio(double eradio) {
        Eradio = eradio;
    }

    public double getEvolumenEsf() {
        return EvolumenEsf;
    }

    public void setEvolumenEsf(double evolumenEsf) {
        EvolumenEsf = evolumenEsf;
    }
    public double volumenEsfe(double Eradio) {
        EvolumenEsf = 4 / 3 * (3.1415 * Math.pow(Eradio, 3));
        return EvolumenEsf;
    }
}
