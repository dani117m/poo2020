package practica1;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public String Obtener_Area(double base, double altura){
        String Resulta = "";
        double area = (base * altura)/2;
        Resulta = "El area resultante es "+ area;
        return Resulta;

    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
