package SistemaEncuesta;

public class Empleado {
        private String nombre;
        private String documento;
        private int legajo;
        private int encuestasRealizadas;

        public Empleado(String nombre, String documento, int legajo, int encuestasRealizadas) {
            this.nombre = nombre;
            this.documento = documento;
            this.legajo = legajo;
            this.encuestasRealizadas = encuestasRealizadas;
        }

        // get and set
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDocumento() {
            return documento;
        }
        public void setDocumento(String documento) {
            this.documento = documento;
        }
        public int getLegajo() {
            return legajo;
        }
        public void setLegajo(int legajo) {
            this.legajo = legajo;
        }

        public int getEncuestasRealizadas() {
            return encuestasRealizadas;
        }
        // metodos

    public void realizoencuesta(Encuesta e){
            encuestasRealizadas++;
            e.setEmpleado(this);

    }
    public int cantdeencuestasRealizadas() {
        return encuestasRealizadas;
    }

}
