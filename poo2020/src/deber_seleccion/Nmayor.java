package deber_seleccion;

public class Nmayor {
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double Resultado;

    /**
     * Metodo para calcular el numero mayor
     */
    public void calcular() {
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            Resultado = num1;
        } else { if ((num2 > num3) && (num2 > num4)) {
            Resultado = num2; } else {if (num3 > num4) {
                    Resultado = num3;
                } else {
                    Resultado = num4;
                }
            }
        }
    }
    /**
     * Metodo que nos permite obtener el valor de la variable num1
     * @return num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Metodo que nos permite actualizar el valor de la variable num1
     * @param num1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Metodo que nos permite obtener el valor de la variable num2
     * @return num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Metodo que nos permite actualizar el valor de la variable num2
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * Metodo que nos permite obtener el valor de la variable num3
     * @return
     */
    public double getNum3() {
        return num3;
    }

    /**
     * Metodo que nos permite actualizar el valor de la variable num3
     * @param num3
     */
    public void setNum3(double num3) {
        this.num3 = num3;
    }

    /**
     * Metodo que nos permite obtener el valor de la variable num4
     * @return num4
     */
    public double getNum4() {
        return num4;
    }

    /**
     * Metodo que nos permite actualizar el valor de la variable num4
     * @param num4
     */
    public void setNum4(double num4) {
        this.num4 = num4;
    }

    /**
     * Metodo que nos permite obtener el valor de la variable numMayor
     * @return numMayor
     */
    public double getResultado() {
        return Resultado;
    }

    /**
     * Metodo que nos permite actualizar el valor de la variable numMayor
     * @param resultado
     */
    public void setResultado(double resultado) {
        this.Resultado = resultado;
    }
}
