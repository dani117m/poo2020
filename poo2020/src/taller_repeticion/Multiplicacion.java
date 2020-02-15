package taller_repeticion;

public class Multiplicacion {
    private int numero1;
    private int numero2;

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public int obterner_multiplicacion(int numero1, int numero2){
        // el numero1 uno representa al multiplicando y numero2 al multiplicador

        int total = 0;
        int i = 1;
        while (i<=numero2){
            total = total + numero1;
            i++;
        }
        return total;
    }


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
