package tp11ej2.condicionadore;

import tp11ej2.Figura;

public class PorAlbum extends Condicion{

    private String albumName;

    public PorAlbum(String albumName) {
        this.albumName = albumName;
    }
    @Override
    public boolean cumple(Figura f){
        return f.getAlbum().equals(albumName);
    }
}
