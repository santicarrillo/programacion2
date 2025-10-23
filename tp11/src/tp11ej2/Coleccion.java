package tp11ej2;

import tp11ej2.condicionadore.Condicion;

import java.util.ArrayList;

public class Coleccion extends Elemento {
    private ArrayList<Elemento> elementos;
    private final static int max=100;
    private int descuento;
    public Coleccion(int descuento) {
        this.descuento = descuento;
        this.elementos = new ArrayList<>();
    }

    public int  getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void addElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public double getprecio() {
        double total=0;
        for (Elemento elemento : elementos) {
            total+=elemento.getprecio();
        }
    return total*(double) (getDescuento()/max);
    }
    public Coleccion duplicado() {
         return  new Coleccion(getDescuento());
    }

   /*@Override
    public Elemento copia(Condicion condicion) {
      ArrayList<Elemento> copiaelemento = new ArrayList<>();
    for (Elemento elemento : elementos) {
            Elemento copiahijo=elemento.copia(condicion);
            if (copiahijo != null) {
                copiaelemento.add(copiahijo);
            }
        }
        if (!copiaelemento.isEmpty()){
            Coleccion copia = duplicado();
            for (Elemento elemento : copiaelemento) {
                copia.addElemento(elemento);
                return copia;
            }
        }
        return null;
    }*/
public boolean tienefiguritas() {
    return !elementos.isEmpty();
}
    @Override
    public Elemento copia(Condicion condicion) {
        Coleccion copia = new Coleccion(getDescuento());
        for (Elemento elemento : elementos) {
           Elemento aux= elemento.copia(condicion);

           if (aux != null){
               copia.addElemento(aux);
           }
        }
        if (copia.tienefiguritas()){
            return copia;
        }
        return null;
    }
}
