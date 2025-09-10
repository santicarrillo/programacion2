package convertidorMedidas;

public class ConversionesPOO {
    public static void main(String[] args) {
        System.out.println("10 cm = " + Conversiones.centimetrosAPulgadas(10) + " pulgadas");
        System.out.println("5 pulgadas = " + Conversiones.pulgadasACentimetros(5) + " cm");

        System.out.println("20 libras = " + Conversiones.librasAKilos(20) + " kg");
        System.out.println("10 kg = " + Conversiones.kilosALibras(10) + " libras");

        System.out.println("3 galones = " + Conversiones.galonesALitros(3) + " litros");
        System.out.println("10 litros = " + Conversiones.litrosAGalones(10) + " galones");
    }
}
