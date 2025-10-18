package PrimerParcial.Calcular;

import PrimerParcial.Agente;

public class CalculaBueno extends CalculaAp {

    private int multiplicador;

    public CalculaBueno(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public double Calcula(Agente a) {
        return a.getvelocidad()*a.getingenio()* a.getExperiencia()this.multiplicador;
    }
}
