package Noticias;

import java.time.LocalDate;
import java.util.ArrayList;


public class NoticiaVentana extends Noticia {

    private LocalDate fechaLimite;

    public NoticiaVentana(String auto, String tema, String texto, String titulo, LocalDate fechaLimite) {
        super(auto, tema, texto, titulo);
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public void addComentario(Comentario cc) {
        if (!LocalDate.now().isAfter(getFechaLimite())) {
            super.addComentario(cc);
        }
    }

    @Override
    protected Noticia cascaron() {
        return new NoticiaVentana(getAuto(),getTema(),getTexto(),getTitulo(),getFechaLimite());
    }
}
