package Musifly;

public class FiltroDuracion extends Buscar {
    private int duracionMinima;

    public FiltroDuracion(int duracion) {
        this.duracionMinima = duracion;
    }

    @Override
    public boolean cumple(Musica m) {
        return m.getDuracionTotal() > duracionMinima;
    }
}
