package herenciavolumen;

public class Cilindro extends Fgeometrica{
    private double radio;
    private double altura;
    private double volumenCil;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumenCil() {
        return volumenCil;
    }

    public void setVolumenCil(double volumenCil) {
        this.volumenCil = volumenCil;
    }

    public double volumenCilindro(double radio, double volumenCil){
        volumenCil = (3.1415 * Math.pow(radio,2) * volumenCil);
        return volumenCil;
    }
}
