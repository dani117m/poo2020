package herenciadeudores;

public class AutoPrestamo extends Cliente {
    private double interes;
    private double taza;

    public AutoPrestamo(String nombre,String numeroCu, double capital, int plazo){
        this.nombre = nombre;
        this.numero = numero;
        this.capital = capital;
        this.plazo = plazo;
    }

    public double obtenerInteres(){
        interes = capital * 15/100 * plazo;
        return interes;
    }
}
