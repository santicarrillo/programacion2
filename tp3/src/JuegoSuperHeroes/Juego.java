package JuegoSuperHeroes;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Personaje> personajes;
    private int Max=2;

    public Juego(ArrayList<Personaje> personajes) {
        this.personajes = new  ArrayList(Max);
    }
    public void agregaPersonaje(Personaje p) {
        if (!this.personajes.contains(p)) {// pregunto si existe el personaje
            this.personajes.add(p);
        } else {
            System.out.println("El personaje ya está en el juego.");
        }
    }

    public void eliminaPersonaje(Personaje p) {
        this.personajes.remove(p);
    }

    public Personaje elijepersonaje(Personaje p) {
        return this.personajes.get(this.personajes.indexOf(p));
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

    // Método auxiliar para obtener el valor de la característica de un personaje
    private double obtenerValorCaracteristica(Personaje p, String caracteristica) {
        switch (caracteristica.toLowerCase()) {
            case "fuerza": return p.getFuerza();
            case "altura": return p.getAltura();
            case "peso": return p.getPeso();
            case "edad": return p.getEdad();
            default:
                System.out.println("Característica desconocida: " + caracteristica);
                return 0;
        }
    }

}
