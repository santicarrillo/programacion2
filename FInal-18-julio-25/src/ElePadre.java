import Condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElePadre {
    protected String titulo;
    public ElePadre(String titulo) {
        this.titulo = titulo;
    }


    protected abstract ArrayList<Wallpaper>listados(Condicion cc);
    protected abstract ArrayList<String>listadoPalabraClave();
    protected abstract int Cantwallpapere();
    protected abstract int Cantdescargastotal();

}
