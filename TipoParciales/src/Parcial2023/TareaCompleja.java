package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompleja extends TareaCompuesta{

    private int tiempoEstimado;
    public TareaCompleja(int cantEmpleado, String nombre, int tiempoEstimado) {
        super(cantEmpleado, nombre, tiempoEstimado);
    }

    @Override
    public int CantEmpleados() {
        int max = 0;
        for (Presupuesto p : presupuestos) {
            if (p.CantEmpleados() > max) {
                max = p.CantEmpleados();
            }
        }
        return max;
    }

    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Presupuesto p : presupuestos){
             for (String m : p.getMateriales()){
                 if (!resultado.contains(m)){
                     resultado.add(m);
                 }
             }
        }
        return resultado;
    }

    @Override
    public int getTiempoEstimado() {
        int total= 0;
        for (Presupuesto p : presupuestos){
            total+= pt;
        }
        return total;
    }
}
