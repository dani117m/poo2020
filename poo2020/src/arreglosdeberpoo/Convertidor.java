package arreglosdeberpoo;

public class Convertidor {
    private double decimal;
    private int[] numero = new int[6];

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;

    }

    public double convertirdecimal(){
        for(int i = 0;i < numero.length; i++ ){
            decimal += numero[i] * Math.pow(2, numero.length - (i+1));
        }
        return decimal;
    }

}
