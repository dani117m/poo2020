package herenciadeudores;

public class Hipotecario extends Cliente {
    private double interes;
    private double taza;
    private double i;
    private double j;

    public Hipotecario(String nombre,String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numero = numero;
        this.capital = capital;
        this.plazo = plazo;
    }
    public double obtenerInteres(){

        i = 1 + 0.36/12;
        j = plazo * 12;
        interes = capital * Math.pow(i, j);
        return interes;
    }
}
