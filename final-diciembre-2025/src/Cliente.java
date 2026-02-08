import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<menu> comidas;
    private int  caloriasmaximas;
    private Buscador preferencia;

    public Cliente( int caloriasmaximas, String nombre, Buscador preferencia) {
        super();
        this.comidas = new ArrayList<>();
        this.caloriasmaximas = caloriasmaximas;
        this.nombre = nombre;
        this.preferencia = preferencia;

    }

    public void addcomidas(menu comida) {
        comidas.add(comida);
    }

    public boolean LegustoComida(menu comida) {
        // Le gusta si NO la solicitó antes Y cumple con sus preferencias
        return !comidas.contains(comida) && comida.getCaloria() <= caloriasmaximas
                && !comida.buscar(preferencia).isEmpty();
    }


}
