package Polimorfismo_figura;

public class Triangulo3 extends Figura3{
    private double baseTria;
    private double alturaTria;

    public double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }
    @Override
    public void calcularArea(){
        area = (baseTria * alturaTria)/2;
    }
}
