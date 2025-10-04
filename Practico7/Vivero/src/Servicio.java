import java.util.ArrayList;

public class Servicio {
     public static void main(String[] args) {
                    // Crear vivero
                    Vivero vivero = new Vivero();

                    // Crear plantas
                    ArrayList<String> nombres1 = new ArrayList<>();
                    nombres1.add("lengua de suegra");
                    Planta p1 = new Planta("Monocotyledoneae", "Asparagaceae", "Sansevieria trifasciata",
                            nombres1, "Sansevieria", 6, 2, true, "Crassula");

                    ArrayList<String> nombres2 = new ArrayList<>();
                    nombres2.add("potus");
                    Planta p2 = new Planta("Monocotyledoneae", "Araceae", "Epipremnum aureum",
                            nombres2, "Epipremnum", 3, 5, true, "Epipremnum");

                    ArrayList<String> nombres3 = new ArrayList<>();
                    nombres3.add("cactus");
                    Planta p3 = new Planta("Dicotyledoneae", "Cactaceae", "Echinopsis pachanoi",
                            nombres3, "Echinopsis", 7, 1, false, "Crassula");

                    // Agregar plantas al vivero
                    vivero.agregarPlanta(p1);
                    vivero.agregarPlanta(p2);
                    vivero.agregarPlanta(p3);

                    // Filtro por nombre vulgar
                    Buscador filtroNombre = new CondicionNombreVulgar("potus");

                    // Filtro por clasificación superior
                    Buscador filtroClasificacion = new CondicionClasificiacion("Crassula");

                    // Filtro compuesto: nombre vulgar OR clasificación
                    Buscador filtroNombreOClasificacion = new BuscadorOR(filtroNombre, filtroClasificacion);

                    // Filtro por condiciones d) y e) usando SolyRiego con operadores
                    Buscador filtroD = new SolyRiego(5, ">", 3, "<"); // sol > 5 && riego < 3
                    Buscador filtroE = new SolyRiego(4, "<", 4, ">"); // sol < 4 && riego > 4
                    Buscador filtroDE = new BuscadorOR(filtroD, filtroE);

                    // Filtro compuesto: (nombre vulgar OR clasificación) AND (condición d o e)
                    Buscador filtroFinal = new BuscardorAND(filtroNombreOClasificacion, filtroDE);

                    // Buscar y mostrar resultados
                    ArrayList<Planta> resultado = vivero.buscar(filtroFinal);
                    System.out.println("🌱 Plantas que cumplen el filtro final:");
                    for (Planta p : resultado) {
                        System.out.println("- " + p.getNombreCientifico());
                    }
    }



}
