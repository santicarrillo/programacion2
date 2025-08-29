public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        puntos = 0;
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            nombre = "SIN NOMBRE";
        }
    }

// GET Y SETTER


    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

  public void incrementaPuntos() {
        puntos++;

  }


  //TIRA DADOS
    public int  tiradados( Cubilete cub ) {
        return cub.tirar();

    }

}
