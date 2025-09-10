package convertidorMedidas;

public class ConversionesPOO {
    public static void main(String[] args) {


        System.out.println("10 cm = " + Conversion.centimetrosAPulgadas(10) + " pulgadas");
        System.out.println("5 pulgadas = " + Conversion.pulgadasACentimetros(5) + " cm");

        System.out.println("20 libras = " + Conversion.librasAKilos(20) + " kg");
        System.out.println("10 kg = " + Conversion.kilosALibras(10) + " libras");

        System.out.println("3 galones = " + Conversion.galonesALitros(3) + " litros");
        System.out.println("10 litros = " + Conversion.litrosAGalones(10) + " galones");
    }
}
