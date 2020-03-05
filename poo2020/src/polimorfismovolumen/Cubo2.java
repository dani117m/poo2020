package polimorfismovolumen;

public class Cubo2 extends Fgeometrica2{
    private double aristas;

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }
    @Override
    public void calcularVolumen(){
        volumen = Math.pow(aristas, 3);

    }
}
