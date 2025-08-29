package Ejercicio3;

public class Pincipal {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(2, 5);
        PuntoGeometrico p2 = new PuntoGeometrico(6, 12);

        Rectangulo r1 = new Rectangulo(p1, p2);

        System.out.println(r1);
        System.out.println("Área: " + r1.area());
        System.out.println("¿Es cuadrado? " + r1.esCuadrado());
        System.out.println("Orientación: " + r1.orientacion());
        System.out.println("Lado superior: " + r1.ladoSuperior());
        r1.desplazar(2, 3);

        System.out.println("Rectángulo desplazado: " + r1);
    }
}
