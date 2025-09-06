package JuegoSuperHeroes;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Personaje> personajes; // opcional: banco de personajes disponibles
    private final int MAX_JUGADORES = 2;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.personajes = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        if (jugadores.size() < MAX_JUGADORES) {
            jugadores.add(j);
        } else {
            System.out.println("Ya hay el máximo de jugadores permitidos.");
        }
    }

    public void agregarPersonaje(Personaje p) {
        if (!personajes.contains(p)) {
            personajes.add(p);
        } else {
            System.out.println("El personaje ya está en el juego.");
        }
    }

    public void eliminarPersonaje(Personaje p) {
        personajes.remove(p);
    }

    public Jugador jugar(String caracteristica, String desempate) {
        if (jugadores.size() < 2) {
            System.out.println("No hay suficientes jugadores para jugar.");
            return null;
        }

        Jugador j1 = jugadores.get(0);
        Jugador j2 = jugadores.get(1);

        return j1.enfrentar(j1,j2, caracteristica, desempate);
    }
}
