package EstablesimientoDeportivo;

import java.util.ArrayList;

public class Usuario {
    private String name;
    private boolean EsSocio;
    private ArrayList<Turno> reservas;
    private int MaxR = 4;

    public Usuario(String name, boolean esSocio, int MaxR) {
        this.name = name;
        this.EsSocio = esSocio;
        this.reservas = new ArrayList(MaxR);
    }


    public boolean isEsSocio() {
        return EsSocio;
    }

    public void setEsSocio(boolean esSocio) {
        EsSocio = esSocio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void agregarReserva(Turno turno) {
        reservas.add(turno);
        actualizarEsSocio(); // recalcular si es socio
    }

    public void actualizarEsSocio() {
        if (EsSocio) return; // si ya es socio, no hace falta revisar

        int reservasUltimos2Meses = 0;
        for (Turno t : reservas) {
            if (t.estaEnUltimos2Meses()) {
                reservasUltimos2Meses++;
            }
        }

        if (reservasUltimos2Meses >= 4) {
            EsSocio = true; // se convierte en socio
        }

    }
}
