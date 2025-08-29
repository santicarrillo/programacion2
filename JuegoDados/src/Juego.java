import org.w3c.dom.ls.LSOutput;

public class Juego {
/*    private Jugador jugador1;
    private Jugador jugador2;

    private Dado dado1;
    private Dado dado2;

    private int rondas=10;
    private int menorvalor =7;
    public Juego(){
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
        dado1 = new Dado(6);
        dado2 = new Dado(6);
    }
    public Juego(Jugador j1, Jugador j2) {
        jugador1 = j1;
        jugador2 = j2;
        dado1 = new Dado(6);
        dado2 = new Dado(6);
    }
    public Juego(int rondas,Jugador j1, Jugador j2, int cantLados) {
        jugador1 = j1;
        jugador2 = j2;
        dado1 = new Dado(cantLados);
        dado2 = new Dado(cantLados);
        menorvalor= cantLados+1;
    }
    public Juego(Jugador j1,int cantLados) {
        jugador1 = j1;
        jugador2 = new Jugador("La compu");
        dado1 = new Dado(6);
        dado2 = new Dado(cantLados);
        menorvalor= cantLados+1;
    }

    public Juego(Jugador j1, Jugador j2, Dado d1, Dado d2) {
        jugador1 = j1;
        jugador2 = j2;
        dado1 = d1;
        dado2 = d2;
        menorvalor=(d1.getCantidadCaras()+ d2.getCantidadCaras()/2)+1;

    }
    public void jugar() {
        //una constante en codigo solo se puede cambiar si complimos el codigo nuevo
        // quedo fijo en 10 si queremos es necesario otra clase o tocar el codigo
        for (int i=0;i<10;i++){
            int puntos1= jugador1.tiradados();
            int puntos2= jugador2.tiradados();
            if ((puntos1>7 ) && (puntos1>puntos2)){
                jugador1.incrementaPuntos();
            }else if ((puntos2>7) && (puntos2>puntos1)) {
                jugador2.incrementaPuntos();
            }
        }
        Jugador ganador = ganador();// verifica q no este null para que no se rompa
        System.out.println(ganador().getnombre());
    }

    public Jugador ganador() {
        if (jugador1.getPuntos() > jugador2.getPuntos()) {
                return jugador1;
        }else if(jugador2.getPuntos() > jugador1.getPuntos()) {
            return jugador2;
        }else{
            return null;
        }
    }
    // GET AND SET
    public int getRondas() {
        return rondas;
    }


    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getMenorvalor() {
        return menorvalor;
    }

    public void setMenorvalor(int menorvalor) {
        this.menorvalor = menorvalor;
    }

    public static void main(String[] args) {
        Jugador j1 = new Jugador("matias");
        Jugador j2 = new Jugador("camila");
        Dado dado1 = new Dado(8);


        Juego juego = new Juego(20,j1, j2,8);
     //   juego.setMenorvalor(11);//juegoDados en el video
        juego.jugar();//juegoDados
        System.out.println("el jugador: "+j1.getnombre()+" "+"saco"+" "+j1.getPuntos());
        System.out.println("el jugador: "+j2.getnombre()+" "+"saco"+" "+j2.getPuntos());
        System.out.println("ganador: "+ juego.ganador().getnombre());
    }
*/

}

