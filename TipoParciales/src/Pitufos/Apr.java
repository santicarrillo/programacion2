package Pitufos;

import java.util.ArrayList;

public class Apr extends GrupoP{


    public Apr(ArrayList<ElePitufo> pitufos, ArrayList<String> habilidades) {
        super(pitufos, habilidades);
    }

    @Override
    public double getVelocidad() {
        double max = 0;
        for (ElePitufo pitufo : pitufos) {
            if (pitufo.getVelocidad()> max) {
                max = pitufo.getVelocidad();
            }
        }
        return max;
    }

    @Override
    public int getCreatividad() {
        return pitufos.get(0).getCreatividad();
    }


}
