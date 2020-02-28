package herenciafigura;
//import java.util.

public class Cuadrado1 extends Figura1{
    private double ladoCuad;
    private double areaCuad;

    /**
     * contrucion del objeto
     * @param ladoCuad
     */
    public Cuadrado1(double ladoCuad){
        this.ladoCuad = ladoCuad;
    }

    /**
     * obtener el lado del cuadrado
     * @return
     */
    public double getLadoCuad() {
        return ladoCuad;
    }

    /**
     * establecer el lado del cuadrado
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    /**
     * obtener area del cuadrado
     * @return
     */
    public double getAreaCuad() {
        return areaCuad;
    }

    /**
     * establecer el area del cuadrado
     * @param areaCuad
     */
    public void setAreaCuad(double areaCuad) {
        this.areaCuad = areaCuad;
    }

    /**
     * Calcular el area del cuadrado
     * @param ladoCuad
     */
    public void calcularAreaCuad(double ladoCuad){
        areaCuad = Math.pow(ladoCuad, 2);
    }
}
