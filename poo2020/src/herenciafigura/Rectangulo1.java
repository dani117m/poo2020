package herenciafigura;

public class Rectangulo1  extends  Figura1{
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    /**
     * contrucion de objetos
     * @param baseRecta
     * @param alturaRecta
     */
    public Rectangulo1(double baseRecta, double alturaRecta){
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }

    /**
     * Obtener base de la recta
     * @return
     */
    public double getBaseRecta() {
        return baseRecta;
    }

    /**
     * establecer base de la recta
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * obtener altura del recta
     * @return
     */
    public double getAlturaRecta() {
        return alturaRecta;
    }

    /**
     * establecer altura de la recta
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * obtener altura de la recta
     * @return
     */
    public double getAreaRecta() {
        return areaRecta;
    }

    /**
     * establecer base de la recta
     * @param areaRecta
     */
    public void setAreaRecta(double areaRecta) {
        this.areaRecta = areaRecta;
    }

    /**
     * Metodo para calcular el area de un rectangulo
     * @param baseRecta
     * @param alturaRecta
     */
    public void calcularAreaRecta(double baseRecta, double alturaRecta){
        areaRecta = baseRecta* alturaRecta;
    }
}
