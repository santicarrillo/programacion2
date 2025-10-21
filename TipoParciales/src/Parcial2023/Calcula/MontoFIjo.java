package Parcial2023.Calcula;

import Parcial2023.Presupuesto;

public class MontoFIjo extends CalculaCosto{

    private int MontoFIjo;

    public MontoFIjo(int montoFIjo) {
        MontoFIjo = montoFIjo;
    }

    @Override
    public double calcula(Presupuesto p) {
        return MontoFIjo;
    }
}
