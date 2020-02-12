package dieseño_seleccion;

public class Dia {
    private int num;

    /**
     *
     * @param num
     */
    public Dia (int num){
        this.num = num;
    }
    /**
     * Metodo para obtener el dia segun el numero ingresado
     * @return nombre
     */

    public String obtenerdia(){
        String nombre = "";
        switch (num){
            case 1:
                nombre ="Domingo";
                break;
            case 2:
                nombre ="Lunes";
                break;
            case 3:
                nombre ="Martes";
                break;
            case 4:
                nombre ="Miercoles";
                break;
            case 5:
                nombre ="Jueves";
                break;
            case 6:
                nombre ="Viernes";
                break;
            case 7:
                nombre ="Sabado";
                break;
            default:
                nombre = "Opcion incorrecta";
        }
        return nombre;

    }
    /**
     * Metodo para obtener el valor num
     * @return num
     */
    public int getNum() {
        return num;
    }
    /**
     * Metodo para obtener el valor num
     * @param  num
     */

    public void setNum(int num) {
        this.num = num;
    }
}
