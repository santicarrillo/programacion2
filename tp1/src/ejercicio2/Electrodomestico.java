    package ejercicio2;

    public class Electrodomestico {

        private String nombre;
        private double precioBase;
        private String color;
        private double consumoEnergetico;
        private double peso;

        // Valores por defecto
        private static final String COLOR_DEFECTO = "Gris plata";
        private static final double CONSUMO_DEFECTO = 10.0; // kW
        private static final double PRECIO_DEFECTO = 100.0; // pesos
        private static final double PESO_DEFECTO = 2.0;     // kg

        // Constructor vacío (todos por defecto)
        public Electrodomestico() {
            this.nombre = "Sin nombre";
            this.precioBase = PRECIO_DEFECTO;
            this.color = COLOR_DEFECTO;
            this.consumoEnergetico = CONSUMO_DEFECTO;
            this.peso = PESO_DEFECTO;
        }

        // Constructor con nombre
        public Electrodomestico(String nombre) {
            this(); // Llama al constructor vacío
            this.nombre = nombre;
        }

        // Constructor con nombre y precio
        public Electrodomestico(String nombre, double precioBase) {
            this(nombre);
            this.precioBase = precioBase;
        }

        // Constructor con todos los atributos
        public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
            this.nombre = nombre;
            this.precioBase = precioBase;
            this.color = color;
            this.consumoEnergetico = consumoEnergetico;
            this.peso = peso;
        }
        // get y seters
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double getPrecioBase() {
            return precioBase;
        }
        public void setPrecioBase(double precioBase) {
            this.precioBase = precioBase;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getConsumoEnergetico() {
            return consumoEnergetico;
        }
        public void setConsumoEnergetico(double consumoEnergetico) {
            this.consumoEnergetico = consumoEnergetico;
        }
        public double getPeso() {
            return peso;
        }
        public void setPeso(double peso) {
            this.peso = peso;
        }
        //funciones
        public boolean BajoConsumo(){
            return consumoEnergetico<=45;
        }
        public double calculapeso(){
            return precioBase/peso;
        }
        public boolean altagama(){
            return calculapeso()>3;
        }
    }
