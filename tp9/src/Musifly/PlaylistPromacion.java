package Musifly;

import java.util.ArrayList;

public class PlaylistPromacion extends Playlist {
    private Pista pistaPromocion;
    public PlaylistPromacion(String descripsion, int tiempoLimite) {
        super(descripsion, tiempoLimite);
    }

    @Override
    public ArrayList<Pista> buscarfiltro(Buscar filtro) {
        ArrayList<Pista> f = super.buscarfiltro(filtro);
        ArrayList<Pista> resultado = f ;
        resultado.add(pistaPromocion); // agrega la promocionada siempre
        return resultado;
    }

}
