package CooperativaDeAgricultores;

public class Pastura extends  Cereal{
    int supMinima;
    public Pastura(int nombre) {
        super(nombre);
        this.supMinima = sup;
    }

    public int getSupMinima() {
        return supMinima;
    }

    public void setSupMinima(int supMinima) {
        this.supMinima = supMinima;
    }

    public  boolean aceptaLote(Lote ll){
        if (super.aceptalote(ll) && ll.getSuperclase()>supMinima){}

    }
}
