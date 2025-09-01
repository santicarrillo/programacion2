package SistemaEncuesta;

public class Pregunta {
    private String Enunciado,tipo;

    public Pregunta(String enunciado, String tipo) {
        Enunciado = enunciado;
        this.tipo = tipo;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
