package herenciavolumen;

public class Cubo extends  Fgeometrica{
    private double aristas;
    private double volumencubo;

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }

    public double calcularVolumenCubo( double aristas){
        volumencubo = Math.pow(aristas, 3);
        return volumencubo;
    }

    public double getVolumencubo() {
        return volumencubo;
    }

    public void setVolumencubo(double volumencubo) {
        this.volumencubo = volumencubo;
    }
}
