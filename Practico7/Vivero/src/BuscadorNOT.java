public class BuscadorNOT extends Buscador{
    private Buscador b1;


    public BuscadorNOT(Buscador not){
        this.b1 = not;
    }
    @Override
    public boolean cumple(Planta planta) {
        return !b1.cumple(planta);
    }

}
