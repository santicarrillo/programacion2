package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Coperativa {
    ArrayList<Cereal> cereals;
    ArrayList<Lote> lotes;

    private ArrayList<String>mineralprimerio;
    public boolean acepta(Cereal c, Lote l){
        return c.acptalote(l);
    }
    public ArrayList<Cereal> getCerealesPara(Lote ll) {
        ArrayList<Cereal> salida=new ArrayList<Cereal>();
        for (int i = 0; i < cereals.size(); i++) {
            Cereal cc = cereals.get(i);
            if(cc.acptalote(ll)){
                salida.add(cc);
            }
        }
        return salida;
    }

    public ArrayList<Lote> getCerealesPara(Cereal cc) {
        ArrayList<Lote> salida=new ArrayList<Lote>();
        for (int i = 0; i < lotes.size(); i++) {
            Cereal cc = lotes.get(i);
            if(cc.acptalote(cc)){
                salida.add(cc);
            }
        }
        return salida;
    }


    public boolean esEspecial(Lote ll){
        for (int i = 0; i < mineralprimerio.size(); i++) {
            String min=mineralprimerio.get(i);
            if(ll.contienemineral(min)){
                return true;
            }
        }
        return false;
    }
}
