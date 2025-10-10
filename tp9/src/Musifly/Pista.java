package Musifly;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pista extends Musica {

    private int  duracion ;
    private String artista, tituloAlbun,genero;
    private LocalDateTime ano;

    public Pista(LocalDateTime ano, String artista, int duracion, String genero, String tituloAlbun) {
        this.ano = ano;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.tituloAlbun = tituloAlbun;
    }

    // get and seter
    public LocalDateTime getAno() {
        return ano;
    }
    public void setAno(LocalDateTime ano) {
        this.ano = ano;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int  duracion) {
        this.duracion = duracion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTituloAlbun() {
        return tituloAlbun;
    }
    public void setTituloAlbun(String tituloAlbun) {
        this.tituloAlbun = tituloAlbun;
    }

    // metodos

    public boolean equals(Object obj) {
        try {
            Pista p =  (Pista) obj;

           return p.getArtista().equals(this.getArtista());

        }catch (ClassCastException e) {
            return false;
        }
    }


    @Override
    public int  getDuracionTotal(){
        return duracion;
    }

    @Override
    public ArrayList<Pista> buscarfiltro(Buscar filtro) {
        ArrayList<Pista> resultado = new ArrayList<>();
        if (filtro.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}
