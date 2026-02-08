import Condiciones.Condicion;

import java.util.ArrayList;

public class CarpetaWallpeaper extends ElePadre{
    protected ArrayList<ElePadre>wallpapers;
    protected int descargaPropia;
    public CarpetaWallpeaper(String titulo) {
        super(titulo);
        this.descargaPropia=0;
    }
    public int incrementaDesc(){
        return descargaPropia++;
    }
    public int getDescargaPropia(){
        return descargaPropia;
    }
    public void addWallpaper(ElePadre w) {
        this.wallpapers.add(w);
    }
    @Override
    protected int Cantdescargastotal() {
        int suma=0;
        for (ElePadre padre : wallpapers) {
            suma+=padre.Cantdescargastotal();
        }
        return suma+getDescargaPropia();
    }

    @Override
    protected ArrayList<Wallpaper> listados(Condicion cc) {
      ArrayList<Wallpaper> lista = new ArrayList<>();
      for (ElePadre w : wallpapers) {
         lista.addAll(w.listados(cc));
      }
      return lista;
    }

    @Override
    protected ArrayList<String> listadoPalabraClave() {
        ArrayList<String> lista = new ArrayList<>();
        for (ElePadre w : wallpapers) {
            for (String p :w.listadoPalabraClave()) {
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    protected int Cantwallpapere() {
        int catidad=0;
        for (ElePadre w : wallpapers) {
            catidad+=w.Cantwallpapere();
        }
        return catidad;
    }
}
