package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Lote {
    ArrayList<Mineral> minerals;
    public boolean contienemineral(String mm) {
        return minerals.contains(mm);
    }

    public void agregarMineral(String mineral) {
        if (!minerals.contains(mineral)) {
            minerals.add(mineral);
        }
    }

    public  boolean aceptacereal(Cereal cc){// pregunta al reves
        return cc.acptalote(this);
    }

}
