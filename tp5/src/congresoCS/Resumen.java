package congresoCS;

import congresoCS.Evaluador.Evaluador;

public class Resumen extends Trabajo{

    public Resumen() {
        super();
    }

    public boolean puedeserEvaluado(Evaluador e) {
        return e.conocetodo(palabrasClaves);
    }
}
