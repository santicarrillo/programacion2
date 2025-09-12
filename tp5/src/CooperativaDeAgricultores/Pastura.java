package CooperativaDeAgricultores;

public class Pastura extends  Cereal{
    private  int supMinima;
    public Pastura(String nombre, int sup) {
        super(nombre);
        supMinima = sup;
    }


    public int getSupMinima() {
        return supMinima;
    }


    public void setSupMinima(int supMinima) {
        this.supMinima = supMinima;
    }


    public boolean aceptaLote(Lote ll) {
        if (super.aceptaLote(ll) && ll.getSuperficie()>=supMinima) {
            return true;
        } else {
            return false;
        }
    }
}
