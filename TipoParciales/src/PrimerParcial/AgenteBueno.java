package PrimerParcial;

import PrimerParcial.Calcular.CalculaAp;

public class AgenteBueno extends Agente {
    CalculaAp calcula;

    public AgenteBueno(int experiencia, String habilidades, double ingenio, String nombre, int velocidad, CalculaAp calculaAp) {
        super(experiencia, habilidades, ingenio, nombre, velocidad);
        this.calcula = calculaAp;
    }

    @Override
    public double calcular() {
        return calcula.Calcula(this);
    }




}
