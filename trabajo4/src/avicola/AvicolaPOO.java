package avicola;

import avicola.congelado.*;

import java.time.LocalDateTime;

public class AvicolaPOO {
    public static void main(String[] args) {
        ProductoFresco huevo = new ProductoFresco(
                LocalDateTime.of(2025, 12, 10, 0, 0),
                "granja los pollitos",
                LocalDateTime.of(2025, 9, 5, 0, 0),
                101
        );

        // Ejemplo producto refrigerado
        ProductoRefrigerado pollo = new ProductoRefrigerado(
                LocalDateTime.of(2025, 9, 20, 0, 0),
                202,
               403043 ,
                LocalDateTime.of(2025, 9, 8, 0, 0),
                "Granja La Esperanza",-4.0

        );

        // Ejemplo producto congelado por aire
        CongeladoAire hamburguesa = new CongeladoAire(
                LocalDateTime.of(2026, 1, 15, 0, 0), 303,12,
                LocalDateTime.of(2025, 9, 1, 0, 0),
                "Planta Industrial Sur",
                78, 21, 0, 1,200
        );

        // Mostrar etiquetas
        System.out.println("Etiqueta Fresco:");
        System.out.println(huevo.toString());

        System.out.println("\nEtiqueta Refrigerado:");
        System.out.println(pollo.toString());

        System.out.println("\nEtiqueta Congelado por Aire:");
        System.out.println(hamburguesa.toString());
    }
}
