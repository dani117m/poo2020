package polimorfismodeudores;

public class Personal2  extends Cliente2{
    //
    @Override
    public void calcularinteres(){
        totalinteres = capital * 9/100 * plazo;
    }
}
