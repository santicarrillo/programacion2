import java.awt.*;

public class MenuEspecial extends menucom {
    private String nombre;
    private Buscador buscador;

    public MenuEspecial(Buscador buscador, double descuento,String nombre) {
        super(descuento);
        this.buscador = buscador;
        this.nombre = nombre;
    }

    @Override
    public void addmenu(menu m) {
        if(m.buscar(buscador).isEmpty()) {
            super.addmenu(m);
        }
    }
}
