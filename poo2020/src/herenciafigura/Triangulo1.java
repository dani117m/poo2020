package herenciafigura;

public class Triangulo1 extends Figura1 {
    private double baseTria;
    private double alturaTria;
    private double areaTria;

    /**
     * Contrucion del objeto
     * @param baseTria
     * @param alturaTria
     */
    public Triangulo1(double baseTria, double alturaTria){
        this.baseTria = baseTria;
        this.areaTria = alturaTria;

    }

    /**
     * Obtener base del triangulo
     * @return baseTri
     */

    public double getBaseTria() {
        return baseTria;
    }

    /**
     * Establecer base del triangulo
     * @param baseTria
     */
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Obtener la altura del triangulo
     * @return alturaTria
     */
    public double getAlturaTria() {
        return alturaTria;
    }

    /**
     * establecer la altura del triangulo
     * @param alturaTria
     */

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    /**
     * obtener la area del triangulo
     * @return areaTria
     */
    public double getAreaTria() {
        return areaTria;
    }

    /**
     * Establecer la area del triangulo
     * @param areaTria
     */
    public void setAreaTria(double areaTria) {
        this.areaTria = areaTria;
    }

    /**
     * metodo para calcular el area del triangulo
     * @param baseTria
     * @param alturaTria
     * @return
     */
    public double calcular_area(double baseTria, double alturaTria){
        areaTria = (baseTria * alturaTria)/2;
        return areaTria;
    }
}
