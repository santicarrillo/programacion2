package congresoCS;

import congresoCS.Evaluador.Evaluador;

public class Poster extends Trabajo{

    public Poster() {
        super();
    }

    public boolean puedeserEvaluado(Evaluador e) {
        return e.conoseAlmenosuno(palabrasClaves);
    }

}
