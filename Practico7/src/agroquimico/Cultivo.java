package agroquimico;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes= new ArrayList<>();
    }
    public void addEnfermedades(Enfermedad e){
        enfermedadesFrecuentes.add(e);
    }

    // getterandsetter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedeUsar(ProductoQuimico producto, Enfermedad enfermedad) {
        // No se puede usar si el cultivo está en la lista de desaconsejados
        if (producto.getCultivosDesaconsejados().contains(this.nombre)) {
            return false;
        }
        // Se puede usar solo si el producto puede tratar la enfermedad
        return producto.puedeTratarEnfermedad(enfermedad);

    }
