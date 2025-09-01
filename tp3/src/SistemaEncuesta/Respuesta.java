package SistemaEncuesta;

public class Respuesta {
    private String valor;
    private  Pregunta pregunta;

    public Respuesta(Pregunta pregunta, String valor) {
        this.pregunta = pregunta;
        this.valor = valor;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
