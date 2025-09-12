package CooperativaDeAgricultores;

import java.util.ArrayList;

public class Cereal {
    private ArrayList<String> mineralesRequeridos;
    private String nombre;
    public Cereal(String nombre) {
        super();
        this.nombre = nombre;
        mineralesRequeridos = new ArrayList<String>();
    }

    public void agregarMineral(String mm) {
        if (!mineralesRequeridos.contains(mm))
            mineralesRequeridos.add(mm);
    }

    public boolean requiereMineral(String mm) {
        return mineralesRequeridos.contains(mm);
    }

    public void borrarMineral(String mm) {
        mineralesRequeridos.remove(mm);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // SE PUEDE SEMBRAR EN EL LOTE LL
    public boolean aceptaLote(Lote ll) {
        for (int i = 0; i< mineralesRequeridos.size(); i++) {
            String mm = mineralesRequeridos.get(i);
            if (!ll.contieneMineral(mm)) {
                return false;
            }
        }
        return true;
    }

}
