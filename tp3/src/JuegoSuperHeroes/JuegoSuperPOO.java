package JuegoSuperHeroes;

public class JuegoSuperPOO {
     public static void main(String[] args) {

            // Creo personajes
            Personaje p1 = new Personaje(1.75, 30, 480.0, "Clark Kent", "Superman", 90.0, true);
            Personaje p2 = new Personaje(1.75, 35, 480.0, "Bruce Wayne", "Batman", 85.0, true);

            // Creo jugadores
            Jugador j1 = new Jugador("Jugador 1", p1);
            j1.getPersonaje().add(p1);

            Jugador j2 = new Jugador("Jugador 2", p2);
            j2.getPersonaje().add(p2);

            // Enfrentamiento
            Jugador ganador = j1.enfrentar(j1, j2, "fuerza", "visionNocturna");

            if (ganador != null) {
                System.out.println("El ganador es: "+ganador.getNombre());

            }else {
                System.out.println("empate");
            }
     }
}