public class BuscardorAND extends Buscador{
    private Buscador b1,b2;

    public BuscardorAND(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }
    @Override
    public boolean cumple(Planta planta) {
        return b1.cumple(planta)&& b2.cumple(planta);
    }

}
