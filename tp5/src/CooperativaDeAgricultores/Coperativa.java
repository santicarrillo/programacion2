package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Coperativa {

    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;

    private ArrayList<String> minsPrimario;

    public boolean acepta(Cereal cc, Lote ll) {
        return cc.aceptaLote(ll);
    }

    public ArrayList<Cereal> getCerealesPara(Lote ll){
        ArrayList<Cereal> salida = new ArrayList<Cereal>();
        for(int i =0; i< cereales.size(); i++) {
            Cereal cc = cereales.get(i);
            if (cc.aceptaLote(ll)) {
                salida.add(cc);
            }
        }
        return salida;
    }

    public ArrayList<Lote> getLotesPara(Cereal cc){
        ArrayList<Lote> salida = new ArrayList<Lote>();
        for(int i =0; i< lotes.size(); i++) {
            Lote ll = lotes.get(i);
            if (cc.aceptaLote(ll)) {
                salida.add(ll);
            }
        }
        return salida;
    }

    public boolean esEspecial(Lote ll) {
        for(int i = 0; i<minsPrimario.size(); i++) {
            String min = minsPrimario.get(i);
            if (ll.contieneMineral(min)) {
                return true;
            }
        }
        return false;
    }
}
