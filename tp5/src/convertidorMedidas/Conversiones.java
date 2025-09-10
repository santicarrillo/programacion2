package convertidorMedidas;

public class Conversiones {
    public static final double CM_POR_PULGADA = 2.54;
    public static final double KILO_POR_LIBRA = 0.453592;
    public static final double LITROS_POR_GALON = 3.78541;

    // Constructor privado para evitar instanciación
    private Conversiones() {}

    // Métodos estáticos
    public static double centimetrosAPulgadas(double cm) {
        return cm / CM_POR_PULGADA;
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * CM_POR_PULGADA;
    }

    public static double librasAKilos(double libras) {
        return libras * KILO_POR_LIBRA;
    }

    public static double kilosALibras(double kilos) {
        return kilos / KILO_POR_LIBRA;
    }

    public static double galonesALitros(double galones) {
        return galones * LITROS_POR_GALON;
    }

    public static double litrosAGalones(double litros) {
        return litros / LITROS_POR_GALON;
    }
}
