package herencia;

/**
 * clase de herencia administrativa
 */

class Administrativo extends Persona {
    /**
     * Creacion de atributo dependencia
     */
    private String dependencia;

    /**
     * Obtener deperndencia
     * @return
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * establecer dependencia
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * obtener gestionar_procesos
     */
    public void gestionar_procesos(){
        System.out.println("Método para gestionar procesos");
    }
}
