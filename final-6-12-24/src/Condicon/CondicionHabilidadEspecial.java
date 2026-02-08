package Condicon;

public class CondicionHabilidadEspecial extends Condicion {

    private String HabilidadEspecial;
    public CondicionHabilidadEspecial(String HabilidadEspecial) {
        this.HabilidadEspecial = HabilidadEspecial;
    }
    @Override
    public boolean cumple(Miembro m) {
        return m.getHablidadEspecial().equals(this.HabilidadEspecial);
    }
}
