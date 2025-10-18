package PrimerParcial.Calcular;

import PrimerParcial.Agente;

public class CalculaVeloMalo extends CalculaAp{
    private int Unidades;

    public CalculaVeloMalo(int unidades) {
        Unidades = unidades;
    }

    @Override
    public double Calcula(Agente a) {
        return a.getvelocidad()-this.Unidades;
    }
}
