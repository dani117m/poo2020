package polimorfismoinversionista;

public class CuentaMaestra2 extends CuentaInversionista2 {
    private double capital;

    @Override
    public void intereses(){

        total = capital * (taza / 100) * plazo;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
