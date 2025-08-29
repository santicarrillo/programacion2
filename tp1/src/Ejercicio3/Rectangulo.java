package Ejercicio3;

public class Rectangulo {
        private PuntoGeometrico pg1; // vértice superior izquierdo
        private PuntoGeometrico pg2; // vértice inferior derecho

        // Constructor por defecto
        public Rectangulo() {
            this.pg1 = new PuntoGeometrico(0, 1);
            this.pg2 = new PuntoGeometrico(1, 0);
        }

        // Constructor con puntos
        public Rectangulo(PuntoGeometrico pg1, PuntoGeometrico pg2) {
            this.pg1 = pg1;
            this.pg2 = pg2;
        }

        // Getters y Setters
        public PuntoGeometrico getPg1() { return pg1; }
        public void setPg1(PuntoGeometrico pg1) { this.pg1 = pg1; }

        public PuntoGeometrico getPg2() { return pg2; }
        public void setPg2(PuntoGeometrico pg2) { this.pg2 = pg2; }

        // Calcular base y altura
        public double getBase() {
            return Math.abs(pg2.getX() - pg1.getX());
        }

        public double getAltura() {
            return Math.abs(pg1.getY() - pg2.getY());
        }

        // Desplazar el rectángulo
        public void desplazar(double dx, double dy) {
            pg1.desplazar(dx, dy);
            pg2.desplazar(dx, dy);
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
