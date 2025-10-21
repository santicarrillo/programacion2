package Parcial2023;

import Parcial2023.Busqueda.Buscador;
import Parcial2023.Calcula.CalculaCosto;

import java.time.LocalDate;
import java.util.ArrayList;

public class PresupuestoBasico extends Presupuesto{
    CalculaCosto formaCalculo;

    public PresupuestoBasico( int cantEmpleado, String nombre, int tiempoEstimado,CalculaCosto calcula) {
        super( cantEmpleado, nombre, tiempoEstimado);
        this.formaCalculo =calcula;
    }

    @Override
    public int CantEmpleados() {
        return this.CantEmpleado;
    }

    @Override
    public int getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    @Override
    public double getcalcula() {
        return  formaCalculo.calcula(this);
    }

    @Override
    public ArrayList<String> getMateriales( ) {
        ArrayList<String> resultado = new ArrayList<>();
       for (String m: this.materiales){
           resultado.add(m);
       }
        return resultado;
    }

    @Override
    public ArrayList<Presupuesto> Busca(Buscador b) {
        ArrayList<Presupuesto> resultado = new ArrayList<>();
            if (b.cumple(this)){
                resultado.add(this);
            }
            return resultado;
        }
}
