package deber1;

public class Estudiante {
    private double bimestre1;
    private double bimestre2;
    private String nombre;

    public Estudiante (double bimestre1, double bimestre2, String nombre){
        this.bimestre1 = bimestre1;
        this.bimestre2 = bimestre2;
        this.nombre = nombre;
    }

    public String obtener_promedio (String nombre, double biemestre1, double bimestre2){
        String cadena = "";
        double Total = bimestre1 + bimestre2 ;
        if (Total >= 27.5){
            cadena = nombre + " Aprovado con un puntaje de " + Total;
        }else{
            cadena = nombre + " Reprovado con un puntaje de " + Total;

        }
        return cadena;
    }


    public double getBimestre1() {
        return bimestre1;
    }

    public void setBimestre1(double bimestre1) {
        this.bimestre1 = bimestre1;
    }

    public double getBimestre2() {
        return bimestre2;
    }

    public void setBimestre2(double bimestre2) {
        this.bimestre2 = bimestre2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
