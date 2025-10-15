package Seguro.FormaCalculo;

import Seguro.Seguro;

public class FormaMontoFijo extends FormaCalculo {
   @Override
    public double calcularCosto(Seguro s) {
        return s.getMontoFijo();
    }
}
