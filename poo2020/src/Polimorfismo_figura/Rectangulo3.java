package Polimorfismo_figura;

public class Rectangulo3 extends Figura3{
    private double baseRecta;
    private double alturaRecta;

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }
    @Override
    public void calcularArea(){
        area = baseRecta* alturaRecta;;
    }
}
