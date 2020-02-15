package taller_repeticion;

public class Cajero {
    private String nombre;
    private double saldo;
    private double deposito;
    private int consulta;


    public void opcion_retiro(double retiro){
        if (retiro <= getSaldo()){
            setSaldo(getSaldo() - retiro);
        }
    }
    public void opcion_deposito( double depo){
        if (depo > 0){
            setSaldo(getSaldo() + depo);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public int getConsulta() {
        return consulta;
    }

    public void setConsulta(int consulta) {
        this.consulta = consulta;
    }
}
