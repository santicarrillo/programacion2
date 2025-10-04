public class CondicionNombreCientifico extends Buscador{
    private String palabraClave;

    public CondicionNombreCientifico(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(palabraClave);
    }
}
