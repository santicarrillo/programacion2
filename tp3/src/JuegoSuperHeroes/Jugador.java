package JuegoSuperHeroes;

import java.util.ArrayList;

public class Jugador {
private String nombre;
private ArrayList<Personaje> personaje;

    public Jugador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = new ArrayList<>();
        this.personaje.add(personaje);
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
        if (i>=0 && i<this.personaje.size()){
            return this.personaje.get(i);
        }else {
            System.out.println("posicion Invalida");
            return null;
        }
    }

    public Jugador enfrentar(Jugador j1, Jugador j2, String caracteristica, String desempate) {
        // Elegimos el primer personaje de cada jugador para simplificar
        Personaje p1 = j1.elijePersonaje(0);
        Personaje p2 = j2.elijePersonaje(0);

        double valor1 = obtenerValorCaracteristica(p1, caracteristica);
        double valor2 = obtenerValorCaracteristica(p2, caracteristica);

        if (valor1 > valor2) {
            return j1;
        } else if (valor2 > valor1) {
            return j2;
        } else { // empate, usamos la característica de desempate
            double valorDes1 = obtenerValorCaracteristica(p1, desempate);
            double valorDes2 = obtenerValorCaracteristica(p2, desempate);

            if (valorDes1 > valorDes2) return j1;
            else if (valorDes2 > valorDes1) return j2;
            else return null; // empate total
        }
    }
    private double obtenerValorCaracteristica(Personaje p, String caracteristica) {
        if (caracteristica.equalsIgnoreCase("fuerza")) {
            return p.getFuerza();
        } else if (caracteristica.equalsIgnoreCase("altura")) {
            return p.getAltura();
        } else if (caracteristica.equalsIgnoreCase("peso")) {
            return p.getPeso();
        } else if (caracteristica.equalsIgnoreCase("edad")) {
            return p.getEdad();
        } else {
            return 0; // si la característica no existe
        }
    }

}


