package polimorfismoinversionista;

public class Pagar2 extends CuentaInversionista2 {
    private double capital;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public void intereses(){
        total = capital * (taza / 100) * plazo;
    }
}
