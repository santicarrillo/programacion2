package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Lote {

    ArrayList<String> minerales;
    int superficie;

    public boolean contieneMineral(String mm) {
        return minerales.contains(mm);
    }

    public void agregarMineral(String mm) {
        if (!minerales.contains(mm))
            minerales.add(mm);
    }

    public void removeMineral(String mm) {
        minerales.remove(mm);
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean aceptaCereal(Cereal cc) {
        return cc.aceptaLote(this);
    }

}
