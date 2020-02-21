package arreglosdeberpoo;

public class Cedula {
    private int[] coeficiente = {2,1,2,1,2,1,2,1,2};
    private int[] cedula = new int[10];
    private int mul;
    private int cont;

    public int[] getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int[] coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int[] getCedula() {
        return cedula;
    }

    public void setCedula(int[] cedula) {
        this.cedula = cedula;
    }

    public int getMul() {
        return mul;
    }

    public void setMul(int mul) {
        this.mul = mul;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int comparar_cedula(){
        int i= 0;
        int a = cedula.length-2;
        while (i < a){
            int c = cedula[i] * coeficiente[i];
            if(c > 10){
                c = c -9;
            }
            //System.out.println(cedula[i]);
            mul = mul + c;
            cont = mul -mul%10+10;
            cont = cont - mul;

            c++;
        }
        //System.out.println(mul);
        return cont;
    }

    public String mensaje(){
        String valido = "";
        if (cont == cedula[9] || cont == 10) {
            valido = "correcto";
        }else{
            valido = "incorrecto";
        }
        return valido;
    }
}

