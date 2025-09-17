package congresoCS.Evaluador;

import java.util.ArrayList;

public class General extends Evaluador {

    public General(String nombre) {
        super(nombre);
    }

    public General(String ana, ArrayList<String> strings) {
        super();
    }

    @Override
    public String tipoEvaluador() {
        return "General";
    }
}
