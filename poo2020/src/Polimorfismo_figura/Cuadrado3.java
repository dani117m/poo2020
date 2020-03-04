package Polimorfismo_figura;

public class Cuadrado3 extends Figura3 {
    private double ladoCuad;


    public double getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }
}
