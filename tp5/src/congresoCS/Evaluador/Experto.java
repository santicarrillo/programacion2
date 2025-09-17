package congresoCS.Evaluador;

public class Experto extends Evaluador {
    public Experto(String nombre) {
        super(nombre);
    }

    @Override
    public String tipoEvaluador(){
        return "Experto";
    }
}
