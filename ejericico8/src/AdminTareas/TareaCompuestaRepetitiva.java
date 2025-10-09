package AdminTareas;

import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta{
    private int repeticiones;

    public TareaCompuestaRepetitiva(String nombre, String implementacion, String especialidad, int repeticiones) {
        super(nombre, implementacion, especialidad);
        this.repeticiones = repeticiones;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public double getCosto() {
        return super.getCosto() * repeticiones;
    }

    @Override
    public int tiempoEstimado() {
        return super.tiempoEstimado() * repeticiones;
    }

    @Override
    public ArrayList<String> getaccion() {
        ArrayList<String> aux= super.getaccion();
        ArrayList<String> acciones = new ArrayList<>();
        for (int i = 0; i < repeticiones; i++) {
            acciones.addAll(aux);
        }
        return acciones;
    }
}
