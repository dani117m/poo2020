package polimorfismovolumen;

public class Cilindro2 extends Fgeometrica2 {
    private double radio;
    private double altura;

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
    @Override
    public void calcularVolumen(){
        volumen = (3.1415 * Math.pow(radio,2) * altura);

    }
}
