public class BuscadorIngrediente extends Buscador{


    private String ingrediente;

    public BuscadorIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public boolean cumple(Comida c) {
        return c.getIngredientes().contains(getIngrediente());
    }
    public String getIngrediente() {
        return ingrediente;
    }
}
