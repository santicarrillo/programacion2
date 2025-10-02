package Ejercicio1;

public class Agrocultivo extends ElementoAgro {

    public Agrocultivo(String nombre) {
        super(nombre);
    }

    public boolean esUtil(Agroquimico pq) {
        // Si este cultivo no está en los cultivos que no acepta el pq y el pq trata todas las enfermedades de este cultivo
        // return true else false
        return !pq.getNoUtilizarEn().contains(this) && pq.getEnfermedades().containsAll(this.getEnfermedades());
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Agrocultivo otro = (Agrocultivo) obj;
            return this.getNombre().equals(otro.getNombre())
                    // equals ArrayList devuelve false si están en distinto orden
                    // por más de que tenga los mismos elementos
                    && (this.getEnfermedades().size() == (otro.getEnfermedades().size())
                    && this.getEnfermedades().containsAll(otro.getEnfermedades()));
        } catch (Exception e) {
            return false;
        }
    }

}
