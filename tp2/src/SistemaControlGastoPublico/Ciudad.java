package SistemaControlGastoPublico;

public class Ciudad {
    private int habitantes;
    private String nombre;
    private double gastoPublico;
    private int imp1;

    public Ciudad(int habitantes, String nombre) {
        this.habitantes = habitantes;
        this.nombre = nombre;
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

    public boolean EsciudadGrande(){
        return habitantes>100000;
    }
    public

}
