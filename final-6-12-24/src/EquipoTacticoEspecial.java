import java.util.ArrayList;

public class EquipoTacticoEspecial extends  EquipoTactico {

    public EquipoTacticoEspecial(String nombre) {
        super(nombre);
    }
    @Override
    public int getTalle() {
        return heroes.get(0).getTalle();
    }

    @Override
    protected EquipoTactico Cascaron() {
        return super.Cascaron();
    }
}
