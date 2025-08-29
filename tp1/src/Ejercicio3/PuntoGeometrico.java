package Ejercicio3;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
// calcula distancia
    public void desplazar( double dx, double dy ) {
        this.x +=dx;
        this.y +=dy;
    }
    // calculcula distancia
    public double calculaDistancia(PuntoGeometrico otro) {
        return Math.sqrt(Math.pow(this.x-otro.x,2) + Math.pow(this.y-otro.y,2));
    }




}
