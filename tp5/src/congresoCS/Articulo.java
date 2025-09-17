package congresoCS;

import congresoCS.Evaluador.Evaluador;

public class Articulo extends Trabajo{

    public Articulo() {
        super();
    }

    public boolean puedeserEvaluado(Evaluador e) {
        return e.conocetodo(palabrasClaves);
    }
}
