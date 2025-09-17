package congresoCS;

import congresoCS.Evaluador.Evaluador;

import java.util.ArrayList;

public abstract class Trabajo {

protected ArrayList<String> palabrasClaves;

public Trabajo( ) {
    this.palabrasClaves = new ArrayList<>();
}

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }

    public abstract boolean puedeserEvaluado(Evaluador  e);
}
