package Pitufos;

import java.util.ArrayList;

public class Hpc extends GrupoP{

    public Hpc(ArrayList<ElePitufo> pitufos, ArrayList<String> habilidades) {
        super(pitufos, habilidades);
    }

    @Override
    public double getVelocidad() {
        return pitufos.get(pitufos.size()-1).getVelocidad();
    }

    @Override
    public int getCreatividad() {
        int  MasAlto=0;

        for (ElePitufo p: pitufos){
            if (p.getCreatividad()>MasAlto){
                MasAlto=p.getCreatividad();
            }
        }
        return MasAlto;
    }
}
