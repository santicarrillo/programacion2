package Pitufos;

import java.util.ArrayList;

public class Pegocentrico extends Pitufo {
    private int multiplicador;

    public Pegocentrico(ArrayList<String> habilidades, String nombre, double velocidad, int creatividad, int experiencia, int multiplicador) {
        super(habilidades, nombre, velocidad, creatividad, experiencia);
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public int getExperiencia() {
        return super.getExperiencia()* getMultiplicador();
    }
    @Override
    public double getVelocidad(){
        return super.getVelocidad()*getMultiplicador();
    }

    @Override
    public int getCreatividad() {
        return super.getCreatividad()* getMultiplicador();
    }
}
