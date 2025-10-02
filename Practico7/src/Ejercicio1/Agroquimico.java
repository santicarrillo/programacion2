package Ejercicio1;

import java.util.ArrayList;

public class Agroquimico extends ElementoAgro {

    private ArrayList<Agrocultivo> noUtilizarEn;

    public Agroquimico(String nombre) {
        super(nombre);
        this.noUtilizarEn = new ArrayList<>();
    }

    public ArrayList<Agrocultivo> getNoUtilizarEn() {
        return new ArrayList<>(noUtilizarEn);
    }

    public void addCultivo(Agrocultivo aa) {
        if (!this.noUtilizarEn.contains(aa)) { // Redefinir equals en Agrocultivo
            this.noUtilizarEn.add(aa);
        }
    }
}
