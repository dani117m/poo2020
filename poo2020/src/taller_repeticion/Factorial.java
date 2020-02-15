package taller_repeticion;

public class Factorial {
    private int numero;


    public double obtener_factorial (int numero){
        int factorial = 1;
        // con el ciclo for  se utiliza para ir multiplicando el numero
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Metod que nos permite obtener el valor de la variable numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metod que nos permite obtener el valor de la variable numero
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
