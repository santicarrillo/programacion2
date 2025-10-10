package Musifly;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PistaParaTodos extends Pista {

    public PistaParaTodos(LocalDateTime ano, String artista, int duracion, String genero, String tituloAlbun) {
        super(ano, artista, duracion, genero, tituloAlbun);
    }

    @Override
    public ArrayList<Pista> buscarfiltro(Buscar filtro) {
        ArrayList<Pista> resultado = new ArrayList<>();
        resultado.add(this); // se incluye siempre, sin importar el filtro
        return resultado;
    }
}
