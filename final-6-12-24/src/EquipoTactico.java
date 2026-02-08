import Condicon.Condicion;
import Modificacion.Modificacion;

import java.util.ArrayList;

public class EquipoTactico extends Heroe{
    protected ArrayList<Heroe> heroes;

    public EquipoTactico(String nombre) {
        super(nombre);
    }
    public void addElemento(Heroe h) {
        heroes.add(h);
    }
    @Override
    public int getTalle() {
        if (heroes.isEmpty()){
            return 0;
        }
        int menor= heroes.get(0).getTalle();
        for (Heroe h: heroes) {
            if (h.getTalle() < menor){
                menor = h.getTalle();
            }
        }
        return menor;
    }

    @Override
    public ArrayList<String> getListMetales() {
        ArrayList<String> metales=new ArrayList<>();
        for (Heroe h:heroes){
            for (String m : h.getListMetales()){
                if (!metales.contains(m)){
                    metales.add(m);
                }
            }
        }
        return metales;
    }

    @Override
    public boolean cumpleTraje(Condicion c) {
        for (Heroe h:heroes){
            if (h.cumpleTraje(c))
                return true;
        }
        return false;
    }

    @Override
    public EquipoTactico getCopia(Modificacion mm) {
        EquipoTactico copia = Cascaron();

        for (Heroe h : heroes) {
            Heroe hijoCopia = h.getCopia(mm);

            if (hijoCopia != null) {
                copia.addElemento(hijoCopia);
            }
        }
        return copia;
    }

    protected EquipoTactico Cascaron() {
        return new  EquipoTactico(getNombre());

    }
}
