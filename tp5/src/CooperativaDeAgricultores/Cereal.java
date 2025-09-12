package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Cereal {
    ArrayList<Mineral> minerales;
    private int nombre;

    public Cereal(int nombre) {
        this.minerales = new  ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarMineral(String mineral) {
        if (!minerales.contains(mineral)) {
            minerales.add(mineral);
        }
    }

    public boolean requiereMineral(String mm){
        return minerales.contains(mm);
    }

    public void borraMineral(String mm){
        minerales.remove(mm);
    }

    // SE PUEDE SEMBRAR EL LOTE

    public boolean acptalote(Lote ll){
        for (int i = 0; i < minerales.size(); i++) {
            String mineral = minerales.get(i);
            if(!ll.contienemineral(mineral)){
                return false;
            }
        }
        return true;
    }







}
