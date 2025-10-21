package Parcial2023;

import Parcial2023.Busqueda.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class TareaCompuesta extends Presupuesto{
    protected ArrayList<Presupuesto> presupuestos;

    public TareaCompuesta(int cantEmpleado, String nombre, int tiempoEstimado) {
        super(cantEmpleado, nombre, tiempoEstimado);
        this.presupuestos= new ArrayList<>();
    }


    public void addPresupuesto(Presupuesto p) {
        presupuestos.add(p);
    }
    @Override
    public double getcalcula() {
        double total = 0;
        for (Presupuesto p : presupuestos) {
            total += p.getcalcula();
        }
        return total;
    }
    @Override
    public abstract int CantEmpleados();

    @Override
    public abstract ArrayList<String> getMateriales() ;


    @Override
    public int getTiempoEstimado() {
        return 0;
    }

    @Override
    public ArrayList<Presupuesto> Busca(Buscador b) {
        ArrayList<Presupuesto> resultado = new ArrayList<>();
        if (b.cumple(this)){// verifica si cumple solo aca
            resultado.add(this);
        }
        for (Presupuesto p : presupuestos){// verifica en todas sus ramas si no cumple
                resultado.addAll(p.Busca(b));// aca

        }
        return resultado;

    }
}
