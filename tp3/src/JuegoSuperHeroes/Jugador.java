package JuegoSuperHeroes;

import java.util.ArrayList;

public class Jugador {
private String nombre;
private ArrayList<Personaje> personaje;

    public Jugador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Personaje> getPersonaje() {
        return personaje;
    }
    public Personaje elijePersonaje(int  i) {
        if (i>0 && i<this.personaje.size()){
            return this.personaje.get(i);
        }else {
            System.out.println("posicion Invalida");
            return null;
        }
    }

    public Jugador enfrentar(Jugador J1,Jugador J2,String caracteristica,String desempate) {
        if ()

    }


}


