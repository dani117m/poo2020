package Polimorfismo_figura;

public class Circulo3 extends  Figura3{
    private double radioCirc;

    public double getRadioCirc() {
        return radioCirc;
    }

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }
    @Override
    public void calcularArea(){
        area = 3.14159 * Math.pow(radioCirc, 2);
    }
}
