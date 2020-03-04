package herenciadeudores;

public class Personal extends Cliente {
    private double interes;
    public Personal(String nombre,String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numero = numero;
        this.capital = capital;
        this.plazo = plazo;
    }
    public double getInteres() {
        interes = capital * 9/100 * plazo;
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
