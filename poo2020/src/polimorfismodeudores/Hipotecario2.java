package polimorfismodeudores;

public class Hipotecario2 extends Cliente2{
    private double taza;
    private double i;
    private double j;

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }
    @Override
    public void calcularinteres (){

        i = 1 + 0.36/12;
        j = plazo * 12;
        totalinteres = capital * Math.pow(i, j);

    }
}
