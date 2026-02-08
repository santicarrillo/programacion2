
import Condiciones.Condicion;

import java.util.ArrayList;

public class Wallpaper extends ElePadre {
    private Usuario usuario;
    private final int cantwalpapere=1;;
    private int Cantdescarga,fechapublicacion;
    private ArrayList<String> plabraclaves;

    public Wallpaper(String titulo,int cantdescarga, int fechapublicacion, ArrayList<String> plabraclaves, Usuario usuario) {
       super(titulo);
        Cantdescarga = cantdescarga;
        this.fechapublicacion = fechapublicacion;
        this.plabraclaves = plabraclaves;
        this.usuario = usuario;
    }

    public int getCantwalpapere() {
        return cantwalpapere;
    }

    public int getCantdescarga() {
        return Cantdescarga;
    }

    public void setCantdescarga(int cantdescarga) {
        Cantdescarga = cantdescarga;
    }

    public int getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(int fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

   public ArrayList<String> getPlabraclaves() {
        return new ArrayList<>(plabraclaves);
   }
public void addPalabraClave(String palabraClave) {
        plabraclaves.add(palabraClave);
}
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    protected ArrayList<Wallpaper> listados(Condicion cc) {
        ArrayList<Wallpaper> resultado = new ArrayList<>();
        if (cc.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    protected ArrayList<String> listadoPalabraClave() {
        return getPlabraclaves();
    }

    @Override
    protected int Cantwallpapere() {
        return cantwalpapere;
    }

    @Override
    protected int Cantdescargastotal() {
        return getCantdescarga();
    }


}
