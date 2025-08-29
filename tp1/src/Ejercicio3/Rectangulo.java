package Ejercicio3;

public class Rectangulo {
        private PuntoGeometrico supIzq; // vértice superior izquierdo
        private PuntoGeometrico infDer; // vértice inferior derecho

        // Constructor por defecto
        public Rectangulo() {
            this.supIzq = new PuntoGeometrico(0, 1);
            this.infDer = new PuntoGeometrico(1, 0);
        }

        // Constructor con puntos
        public Rectangulo(PuntoGeometrico supIzq, PuntoGeometrico infDer) {
            this.supIzq = supIzq;
            this.infDer = infDer;
        }

        // Getters y Setters
        public PuntoGeometrico getSupIzq() { return supIzq; }
        public void setSupIzq(PuntoGeometrico supIzq) { this.supIzq = supIzq; }

        public PuntoGeometrico getInfDer() { return infDer; }
        public void setInfDer(PuntoGeometrico infDer) { this.infDer = infDer; }

        // Calcular base y altura
        public double getBase() {
            return Math.abs(infDer.getX() - supIzq.getX());
        }

        public double getAltura() {
            return Math.abs(supIzq.getY() - infDer.getY());
        }

        // Desplazar el rectángulo
        public void desplazar(double dx, double dy) {
            supIzq.desplazar(dx, dy);
            infDer.desplazar(dx, dy);
        }

        // Calcular área
        public double area() {
            return getBase() * getAltura();
        }

        // Comparar rectángulos por área
        public int comparar(Rectangulo otro) {
            if (this.area() > otro.area()) return 1;
            if (this.area() < otro.area()) return -1;
            return 0;
        }

        // ¿Es cuadrado?
        public boolean esCuadrado() {
            return getBase() == getAltura();
        }

        // Largo del lado superior
        public double ladoSuperior() {
            return getBase();
        }

        // ¿Acostado o parado?
        public String orientacion() {
            if (getBase() > getAltura()) return "Acostado";
            else if (getAltura() > getBase()) return "Parado";
            else return "Cuadrado";
        }



}
