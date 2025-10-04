public class SolyRiego extends Buscador {
    private int referenciaSol;
    private int referenciaRiego;
    private String operadorSol;
    private String operadorRiego;

    public SolyRiego(int referenciaSol, String operadorSol, int referenciaRiego, String operadorRiego) {
        this.referenciaSol = referenciaSol;
        this.operadorSol = operadorSol;
        this.referenciaRiego = referenciaRiego;
        this.operadorRiego = operadorRiego;
    }

    @Override
    public boolean cumple(Planta planta) {
        int sol = planta.getSol();
        int riego = planta.getriego();

        return comparar(sol, referenciaSol, operadorSol) &&
                comparar(riego, referenciaRiego, operadorRiego);
    }

    private boolean comparar(int valor, int referencia, String operador) {
        return switch (operador) {
            case ">"  -> valor > referencia;
            case "<"  -> valor < referencia;
            case ">=" -> valor >= referencia;
            case "<=" -> valor <= referencia;
            case "==" -> valor == referencia;
            default   -> false;
        };
    }
}