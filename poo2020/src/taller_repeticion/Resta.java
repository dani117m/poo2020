package taller_repeticion;

public class Resta {
    private double numero1;
    private double numero2;

    public double obterner_divicion(double numero1, double numero2){
        // el numero1 uno representa al multiplicando y numero2 al multiplicador

        int i = 0;

        while (numero1 >= numero2){
            numero1 = numero1 - numero2;
            i++;
        }
        return numero1;
    }


    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
