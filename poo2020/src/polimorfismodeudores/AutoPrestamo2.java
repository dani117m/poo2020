package polimorfismodeudores;

public class AutoPrestamo2  extends Cliente2{
    private double taza;

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    @Override
    public void calcularinteres(){
        totalinteres = capital * 15/100 * plazo;
    }
}
