import java.util.ArrayList;

public class CondicionNombreVulgar extends Buscador{
    private String palabraClave;

    public CondicionNombreVulgar(String palabraClave) {
        this.palabraClave = palabraClave.toLowerCase();
    }

    @Override
    public boolean cumple(Planta p) {
        boolean resultado=false;
        ArrayList<String> nomVulgares =p.getnombreVulgar();
        for (String np : nomVulgares) {
            if (np.equals(palabraClave)) {
                return resultado=true;
            }
        }
        return resultado;
    }
}
