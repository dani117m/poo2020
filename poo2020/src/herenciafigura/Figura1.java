package herenciafigura;

import practica1.Triangulo;

public class Figura1 {
    private String nomFigura;

    /**
     * metodo obtener nombre figura
     * @return
     */
    public String getNomFigura() {
        return nomFigura;
    }

    /**
     * Establecer nombre de figura
     * @param nomFigura
     */

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura.toLowerCase();
    }

}
