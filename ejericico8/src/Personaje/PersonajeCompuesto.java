package Personaje;

import java.util.ArrayList;

public class PersonajeCompuesto extends ElemntoPersonaje{

    private ArrayList<ElemntoPersonaje>elementos;


    public PersonajeCompuesto(String nombre, ArrayList<ElemntoPersonaje> elementos) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void agregarelemento(ElemntoPersonaje ep){
        if (ep!=null){
            elementos.add(ep);
        }

    }

    @Override
        public int getFuerza(){
        int suma=0;
        for (ElemntoPersonaje e : elementos){
            suma+= e.getFuerza();
        }
        return suma;
    }
    @Override
        public int getpeso(){
        if (!this.elementos.isEmpty()){
            return this.elementos.get(0).getpeso();
        }
        return 0;
    }
    @Override
        public int getedad() {
            int maxEdad = 0;
            for (ElemntoPersonaje e : elementos) {
             if (e.getedad() > maxEdad) {
                maxEdad = e.getedad();
            }
        }
        return maxEdad;
    }

    @Override
        public int cantidadPersonaje(){
        int suma=0;
        for (ElemntoPersonaje ep:elementos){
            suma+= ep.cantidadPersonaje();
        }
        return suma;
    }


}
