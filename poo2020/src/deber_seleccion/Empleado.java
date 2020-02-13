package deber_seleccion;

public class Empleado {

        private String nombre;
        private int horas;
        private double cuota;
        private double sueldo;

        /**
         * Metodo para Calcular el Sueldo
         */
        public void sueldototal()
        {
            if (horas <= 40)
                setSueldo(horas * cuota);
            else
            if(horas <= 50)
                sueldo = (40 * cuota)+ ((horas - 40)*(cuota*2)) ;
            else
                sueldo = (40 * cuota) + (10 * cuota *2)+((horas - 50) *(cuota *3)) ;
        }

        /**
         * Metod que nos permite obteenr el valor de la variable NOmbre
         * @return nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Metodo que nos permite Actualizar el valor de la variable nombre
         * @param nombre
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Metodo para obtener el valor de la variable de horas
         * @return
         */
        public int getHoras() {
            return horas;
        }

        /**
         * Metodo para actualizar el valor de la variable horaas
         * @param horas
         */
        public void setHoras(int horas) {
            this.horas = horas;
        }

        /**
         * Metodo para obtener el valor de la variable cuota
         * @return cuota
         */
        public double getCuota() {
            return cuota;
        }

        /**
         * Metodo que nos permite actualizar el valor de la variable cuota
         * @param cuota
         */
        public void setCuota(double cuota) {
            this.cuota = cuota;
        }

        /**
         * Metodo para obtener el valor de la variBLE SUELDO
         * @return sueldo
         */
        public double getSueldo() {
            return sueldo;
        }

        /**
         * metod que nos permite actualizar el valor de la variable sueldo
         * @param sueldo
         */
        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }

}
