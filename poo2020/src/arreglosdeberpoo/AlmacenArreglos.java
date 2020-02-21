package arreglosdeberpoo;

public class AlmacenArreglos {
    private  String[] nombre = new String[5];
    private String[] edad = new String[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String mensajefinal = "";


    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getEdad() {
        return edad;
    }

    public void setEdad(String[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    public String getMensajefinal() {
        return mensajefinal;
    }

    public void setMensajefinal(String mensajefinal) {
        this.mensajefinal = mensajefinal;
    }

    public String almacen_Arreglos(){
        int i = 0;
        while (i < nombre.length){
            mensajefinal = String.format("%s\nNombre: " + nombre[i]+"\nEdad: "+edad[i]
                    + "\nUniversidad: "+ universidad[i]+"\nCelular: "+ celular[i]+"\n",mensajefinal);
            i++;
        }
        return mensajefinal;

    }

}
