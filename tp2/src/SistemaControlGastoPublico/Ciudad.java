package SistemaControlGastoPublico;

import java.util.ArrayList;

public class Ciudad {
    private int habitantes;
    private String nombre;
    private double gastoPublico;
    ArrayList<Impuesto>impuestos ;



    public Ciudad(int habitantes, String nombre) {
        this.habitantes = habitantes;
        this.nombre = nombre;
        this.impuestos= new ArrayList<>();
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }

    public double getGastoPublico() {
        return gastoPublico;
    }

    public void setGastoPublico(double gastoPublico) {
        this.gastoPublico = gastoPublico;
    }

    public boolean esCiudadGrande(){
        return habitantes>100000;
    }
    public double calculaGasto(){
        double total=0;
        if (esCiudadGrande()){
            for (Impuesto imp:impuestos){
                total+=imp.getMonto();
            }
        }
        return total;
    }
    public boolean estaEnDeficit(){
        return this.gastoPublico>calculaGasto();
    }

}
