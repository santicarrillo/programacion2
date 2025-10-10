package Musifly;

import java.util.ArrayList;

public class Playlist extends  Musica {
    private String descripsion;
    private   int tiempoLimite ;
    private ArrayList<Musica> musicas;

    public Playlist(String descripsion) {
        this.descripsion = descripsion;
        this.musicas = new ArrayList<>();
        this.tiempoLimite = 3600;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public String getDescripsion() {
        return descripsion;
    }

    public Playlist(String descripsion , int tiempoLimite) {
        this.descripsion = descripsion;
        this.tiempoLimite = tiempoLimite;
    }

    public void agregarMusica(Musica m){
        int duracionTotal = this.getDuracionTotal();
        if(duracionTotal+m.getDuracionTotal()<this.tiempoLimite){
            musicas.add (m);
        }
    }

    public void deleteMusica(Musica m){
        musicas.remove (m);
    }

    // metodos

    @Override
    public int getDuracionTotal() {
        int total = 0;
        for (Musica m : musicas) {
            total += m.getDuracionTotal();
        }
        return total;
    }
    @Override
    public ArrayList<Pista> buscarfiltro(Buscar filtro) {
        ArrayList<Pista> resultado = new ArrayList<>();
        for (Musica m : musicas) {
            resultado.addAll(m.buscarfiltro(filtro)); // recursivo
        }
        return resultado;
    }



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

   /* public boolean equals(Object obj) {
        try {
            Playlist p =  (Playlist) obj;

            return p.getTiempoLimite();

        }catch (ClassCastException e) {
            return false;
        }
    }*/
}
