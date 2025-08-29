package SistemaControlGastoPublico;

import java.util.ArrayList;

public class GastoPOO {
    public static void main(String[] args) {
        // --- Crear ciudades ---
        Ciudad c1 = new Ciudad(120000, "Ciudad A");
        c1.setGastoPublico(50000);
        c1.getImpuestos().add(new Impuesto("IVA", 15000));
        c1.getImpuestos().add(new Impuesto("Ganancias", 10000));

        Ciudad c2 = new Ciudad(90000, "Ciudad B");
        c2.setGastoPublico(40000);
        c2.getImpuestos().add(new Impuesto("IVA", 15000));
        c2.getImpuestos().add(new Impuesto("Ganancias", 10000));

        Ciudad c3 = new Ciudad(80000, "Ciudad C");
        c3.setGastoPublico(25000);
        c3.getImpuestos().add(new Impuesto("IVA", 10000));
        c3.getImpuestos().add(new Impuesto("Ganancias", 5000));

        Ciudad c4 = new Ciudad(150000, "Ciudad D");
        c4.setGastoPublico(70000);
        c4.getImpuestos().add(new Impuesto("IVA", 30000));
        c4.getImpuestos().add(new Impuesto("Ganancias", 20000));

        // --- Crear provincias ---
        Provincia p1 = new Provincia("Provincia 1");
        p1.agregarCiudad(c1);
        p1.agregarCiudad(c2);

        Provincia p2 = new Provincia("Provincia 2");
        p2.agregarCiudad(c3);
        p2.agregarCiudad(c4);

        // --- Crear país ---
        Pais pais = new Pais("Pais 1");
        pais.agregarProvincia(p1);
        pais.agregarProvincia(p2);

        // --- Obtener provincias con más de la mitad de ciudades en déficit ---
        ArrayList<Provincia> provinciasDeficit = pais.provinciasConMayorDeficit();

        System.out.println("Provincias con más de la mitad de sus ciudades en déficit:");
        for (int i = 0; i < provinciasDeficit.size(); i++) {
            System.out.println("- " + provinciasDeficit.get(i).getNombre());
        }
    }
}
