package Seguro.FormaCalculo;

import Seguro.SeguroSimple;

public class FormaMontoFijo extends FormaCalculo {
   @Override
    public double calcularCosto(SeguroSimple s) {
        return s.getMontoFijo();
    }
}
