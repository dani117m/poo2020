package herenciafigura;

public class Circulo1  extends Figura1{
    private double radioCirc;
    private double areaCirc;

    /**
     * contrucion del objeto
     * @param radioCirc
     */
    public Circulo1(double radioCirc){
        this.radioCirc = radioCirc;

    }

    /**
     * obtener el radio del circulo
     * @return
     */
    public double getRadioCirc() {
        return radioCirc;
    }

    /**
     * establecer el radio del circulo
     * @param radioCirc
     */
    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    /**
     * obtenre el area del circulo
     * @return
     */
    public double getAreaCirc() {
        return areaCirc;
    }

    /**
     * establecer el area del circulo
     * @param areaCirc
     */
    public void setAreaCirc(double areaCirc) {
        this.areaCirc = areaCirc;
    }

    /**
     *  calcular el area del circulo
     * @param radioCirc
     */
    public void calcularAreaCirc( double radioCirc){
        areaCirc = 3.14159 * Math.pow(radioCirc, 2);
    }
}
