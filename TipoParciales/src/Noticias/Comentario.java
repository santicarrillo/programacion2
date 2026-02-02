package Noticias;

public class Comentario {

    private String auto, texto;

    public Comentario(String auto, String texto) {
        this.auto = auto;
        this.texto = texto;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
