package Coleccionista;

import Coleccionista.condicion.Condicion;
import java.util.ArrayList;
import java.util.Comparator;

public  class Objeto extends Elecolec {
    private String marca,nombre;

    public Objeto(String marca, String nombre) {
        this.marca = marca;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getvalor() {
        return 1;
    }

    @Override
    public int CantObj() {
        return 1;
    }

    @Override
    public ArrayList<Objeto> busqueda(Condicion c, Comparator<Objeto> cc) {
        ArrayList<Objeto> result = new ArrayList<>();
        if (c.cumple(this)){
            result.add(this);
        }
        return result;
    }

    @Override
    public Objeto getCopia() {
        Objeto copia = cascaron();
        return copia;
    }
    public Objeto  cascaron(){
        return new Objeto(getMarca(),getNombre());
    }
    @Override
    public Objeto getCopiarestringida(Condicion cc) {
        if (cc.cumple(this)){
            Objeto copia = cascaron();
            return copia;
        }
        return null;
    }



}
