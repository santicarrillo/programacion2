package agroquimico;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<String> cultivosDesaconsejados;
    private ArrayList<String> patogenosQueTrata;

    public ProductoQuimico(String nombre) {
        this.cultivosDesaconsejados = new ArrayList<>();
        this.nombre = nombre;
        this.patogenosQueTrata =  new ArrayList<>();
    }
    public void addPatogeno(String pat){
        patogenosQueTrata.add(pat);
    }
    public void addCultivoDesconsejado(String cc){
        cultivosDesaconsejados.add(cc);
    }
    public void deleteCultivo(String cc){
        cultivosDesaconsejados.remove(cc);
    }
    public void patogenoquetrata(String cc){
        patogenosQueTrata.remove(cc);
    }

    // getterysetter


    public ArrayList<String> getCultivosDesaconsejados() {
        return cultivosDesaconsejados;
    }

    public void setCultivosDesaconsejados(ArrayList<String> cultivosDesaconsejados) {
        this.cultivosDesaconsejados = cultivosDesaconsejados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedeTratarEnfermedad(Enfermedad e){
        if (patogenosQueTrata.contains(e)){
            return patogenosQueTrata.containsAll(e.getEstadosPatologicos());
        }
    }

}
