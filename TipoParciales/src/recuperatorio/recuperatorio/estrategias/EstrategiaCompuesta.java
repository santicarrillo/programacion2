package recuperatorio.recuperatorio.estrategias;

import recuperatorio.modelo.Compra;

import java.util.Comparator;

public class EstrategiaCompuesta implements Comparator<Compra> {
    private Comparator<Compra> estrategiaPrincipal, estrategiaSecundaria;

    public EstrategiaCompuesta(Comparator<Compra> estrategiaPrincipal, Comparator<Compra> estrategiaSecundaria) {
        this.estrategiaPrincipal = estrategiaPrincipal;
        this.estrategiaSecundaria = estrategiaSecundaria;
    }

    @Override
    public int compare(Compra o1, Compra o2) {
        int res = this.estrategiaPrincipal.compare(o1, o2);
        if (res == 0) {
            return this.estrategiaSecundaria.compare(o1, o2);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Estrategia Compuesta ("+estrategiaPrincipal+" -> "+estrategiaSecundaria+")";
    }
}
