package Modificacion;

public class OverziceEspecial implements Modificacion {

    @Override
    public void aplicar(Traje t){
        t.setTalle(t.getTalle() + 1);
    }
}
