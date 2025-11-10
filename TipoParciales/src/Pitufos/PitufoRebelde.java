package Pitufos;

import java.util.ArrayList;

public class PitufoRebelde extends Pitufo {
    private double menos;
    private int resto;

    public PitufoRebelde(ArrayList<String> habilidades, String nombre, double velocidad, int creatividad, int experiencia, double menos, int resto) {
        super(habilidades, nombre, velocidad, creatividad, experiencia);
        this.menos = menos;
        this.resto = resto;
    }

    public double getMenos() {
        return menos;
    }

    public void setMenos(double menos) {
        this.menos = menos;
    }

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> resultado = new ArrayList<>();
        if (!super.getHabilidades().isEmpty()) {
            // Solo agrega la primera habilidad
            resultado.add(super.getHabilidades().get(0));
        }
        return resultado;
    }

    @Override
    public int getCreatividad() {
        return this.getCreatividad()/getResto();
    }

    @Override
    public double getVelocidad() {
        return this.getVelocidad() - getMenos();
    }
}


