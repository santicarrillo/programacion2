import Condicon.Condicion;
import Modificacion.Modificacion;

import java.util.ArrayList;

public class Traje extends Heroe{

    private int talle, altura ;
    private ArrayList<Miembro> miembros;
    private ArrayList<String>metales;
    private String PlanetaOrigen;

    public Traje(String nombre, int altura, String planetaOrigen, int talle) {
        super(nombre);
        this.altura = altura;
        this.miembros = new ArrayList<>();
        this.metales= new ArrayList<>();
        PlanetaOrigen = planetaOrigen;
        this.talle = talle;
    }
    public void addMiembros(Miembro miembro) {
        miembros.add(miembro);
    }
    public void addListMetales(String m) {
        if(!metales.contains(m)){
            metales.add(m);
        }
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void setMetales(ArrayList<String> metales) {
        this.metales = metales;
    }

    public String getPlanetaOrigen() {
        return PlanetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        PlanetaOrigen = planetaOrigen;
    }


    @Override
    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    @Override
    public ArrayList<String> getListMetales() {
        return new ArrayList<>(metales);
    }

    @Override
    public boolean cumpleTraje(Condicion c) {
        for(Miembro m: miembros){
            if (c.cumple(m)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Traje getCopia(Modificacion mm) {
      Traje copia = Cascaron();

      if (mm!=null){
            mm.aplicar(copia);
      }
        return copia;
    }
    public Traje Cascaron() {
        Traje copia = new Traje(getNombre(),getAltura(),getPlanetaOrigen(),getTalle());
        copia.metales.addAll(metales);
        copia.miembros.addAll(miembros);

        return copia;
    }
}
