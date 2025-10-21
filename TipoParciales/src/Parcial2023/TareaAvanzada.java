package Parcial2023;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaAvanzada extends TareaCompuesta{

    public TareaAvanzada(int cantEmpleado, String nombre, int tiempoEstimado) {
        super(cantEmpleado, nombre, tiempoEstimado);
    }

    @Override
    public int CantEmpleados() {
        int total=0;
        for (Presupuesto p: presupuestos){
            total +=p.CantEmpleados();
        }
        return total;
    }

    @Override
    public ArrayList<String> getMateriales() {
        ArrayList<String> resultado = new ArrayList<>();
        for (Presupuesto p : presupuestos){
            for (String m : p.getMateriales()){
                    resultado.add(m);

            }
        }
        return resultado;
    }


    @Override
    public int getTiempoEstimado() {
        int total=0;
        for (Presupuesto p : presupuestos){
            if (p.getTiempoEstimado()>total){
                total= p.tiempoEstimado;
            }
        }
        return total;
    }
}
