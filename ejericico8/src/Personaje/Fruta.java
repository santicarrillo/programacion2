package Personaje;

public class Fruta {
    private String fruta;
    private int multiplicador;


    public Fruta(String fruta, int multiplicador) {
        this.fruta = fruta;
        this.multiplicador = multiplicador;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int calculaFuerza(PesonajeSimple ps){
        return ps.getpeso()*multiplicador;
    }
    //crear hija

}
