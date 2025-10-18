package PrimerParcial.Calcular;

import PrimerParcial.Agente;

public class CalculaIngMalo extends CalculaAp {
    private int divisor;

    public CalculaIngMalo(int divisor) {
        this.divisor = divisor;
    }
    @Override
    public double Calcula(Agente a) {
        return a.getingenio()/this.divisor;
    }
}
