package Seguro.busquedaYfiltro;

import Seguro.Seguro;

public class FiltrarMonto extends Buscador {

    private int limiteMonto;

    public FiltrarMonto(int limiteMonto) {
        this.limiteMonto = limiteMonto;
    }

    @Override
        public boolean cumple(Seguro s){
            return s.getMontoFijo()>limiteMonto;
    }


}
