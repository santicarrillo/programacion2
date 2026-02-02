package Noticias;

import Noticias.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Categoria extends EleNoticia {
    private ArrayList<EleNoticia> elementos;
    private int posicion;
    public  Categoria(int  posicion) {
        this.posicion = posicion;
        this.elementos = new ArrayList<>();
    }

    public void addElemento(EleNoticia e) {
        elementos.add(e);
    }

    public int getPosicion(){
        return posicion;
    }

    @Override
    public String getTema() {
        if (this.posicion>elementos.size()){
            return elementos.get(0).getTema();
        }
        return elementos.get(posicion).getTema();
    }

    protected Categoria cascaron() {
        return new Categoria(getPosicion());
    }

    public boolean tieneCategoria() {
        return !elementos.isEmpty();
    }
    @Override
    public EleNoticia getCopia(Filtro filtro) {
            Categoria copia = cascaron();

            for (EleNoticia e : elementos) {
                EleNoticia aux= e.getCopia(filtro);

                if (aux!=null){
                    copia.addElemento(e);
                }
            }
            if (copia.tieneCategoria()){
                return copia;
            }
        return null;
    }

    public int contador(Filtro ff){
        int contador = 0;
        for (EleNoticia e : elementos) {
            contador += e.contador(ff);
        }
        return contador;
    }

    @Override
    public ArrayList<Noticia> busqueda(Filtro filtro, Comparator<Noticia> cc) {
        ArrayList<Noticia> noticias = new ArrayList<>();
        for (EleNoticia e : elementos) {
            ArrayList<Noticia> aux= e.busqueda(filtro,cc);
            noticias.addAll(aux);
            }
        Collections.sort(noticias, cc);
        return noticias;
        }
    }

