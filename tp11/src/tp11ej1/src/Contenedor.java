package tp11ej1.src;

import java.util.ArrayList;

public class Contenedor extends Elemento{
    private String descripcion;
    private String nombre;
    private String url;
    private ArrayList<Elemento>elementos;

    public Contenedor(String descripcion, String nombre, String url){
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.url = url;
        this.elementos=new ArrayList<>();
    }
    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }
    public void addElemento(Elemento elemento){
        this.elementos.add(elemento);
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int contarNoticias() {
        int suma=0;
        for(Elemento e : elementos){
            suma+=e.contarNoticias();
        }
        return suma;
    }
    private Elemento getCopia(ArrayList<Elemento> elementos){
        Contenedor copia=new Contenedor(getDescripcion(),getNombre(),getUrl());
        for(Elemento e : elementos){
            copia.addElemento(e);
        }
        return copia;

    }

    @Override
    public Elemento getCopiaRestringida(String pp) {
        ArrayList<Elemento> copiaElementos=new ArrayList<>();
        for(Elemento e : elementos){
                Elemento  copiaHijo=e.getCopiaRestringida(pp);
                if(copiaHijo!=null){
                    copiaElementos.add(copiaHijo);
                }
        }
        if(!copiaElementos.isEmpty()){
            Elemento copia=getCopia(copiaElementos);

            return copia;

        }
        return null;
    }
}
