public class JuegoPOO {
    private Jugador jug1;
    private Jugador jug2;

    private Cubilete cubilete;

    private int rondas=10;
    private int menorvalor =7;

    public JuegoPOO(){
        jug1 = new Jugador("Jugador 1");
        jug2 = new Jugador("Jugador 2");
        cubilete = new Cubilete(6);
    }

    public JuegoPOO(Jugador j1, Jugador j2) {
        jug1 = j1;
        jug2 = j2;
        cubilete = new Cubilete(6);

    }

    public JuegoPOO(Jugador j1, Jugador j2,int cantLados) {
        jug1 = j1;
        jug2 = j2;
        cubilete = new Cubilete(cantLados);
        menorvalor = cantLados+1;

    }
    public JuegoPOO(int rondas,Jugador j1, Jugador j2, int cantLados) {
        jug1 = j1;
        jug2 = j2;
        cubilete = new Cubilete(cantLados);

        menorvalor= cantLados+1;
    }
    public JuegoPOO(Jugador j1,int cantLados) {
        jug1 = j1;
        jug2 = new Jugador("La compu");
        cubilete = new Cubilete(cantLados);
        menorvalor= cantLados+1;
    }

    public JuegoPOO(int cantLados) {
        jug1 = new Jugador("Jugador 1");
        jug2 = new Jugador("Jugador 1");
        cubilete = new Cubilete(cantLados);
        menorvalor= cantLados+1;
    }
    public JuegoPOO(Jugador j1, Jugador j2, Cubilete cub) {
        jug1 = j1;
        jug2 = j2;
       cubilete = cub;
        menorvalor = 7;

    }
    public void jugar() {
        //una constante en codigo solo se puede cambiar si complimos el codigo nuevo
        // quedo fijo en 10 si queremos es necesario otra clase o tocar el codigo
        for (int i=0;i<10;i++){
            int puntos1= jug1.tiradados(cubilete);
            int puntos2= jug2.tiradados(cubilete);
            if ((puntos1>7 ) && (puntos1>puntos2)){
                jug1.incrementaPuntos();
            }else if ((puntos2>7) && (puntos2>puntos1)) {
                jug2.incrementaPuntos();
            }
        }
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
    public Jugador ganador() {
        if (jug1.getPuntos() > jug2.getPuntos()) {
            return jug1;
        } else if (jug2.getPuntos() > jug1.getPuntos()) {
            return jug2;
        } else {
            return null; // acá está el empate
        }
    }

        public static void main(String[] args) {
            Jugador j1 = new Jugador("matias");
            Jugador j2 = new Jugador("camila");
                Cubilete cub = new Cubilete(2,5);


            JuegoPOO juego = new JuegoPOO(j1,j2,cub);
            //   juego.setMenorvalor(11);//juegoDados en el video
            juego.jugar();//juegoDados
            System.out.println("el jugador: "+j1.getnombre()+" "+"saco"+" "+j1.getPuntos());
            System.out.println("el jugador: "+j2.getnombre()+" "+"saco"+" "+j2.getPuntos());
            if (juego.ganador() != null) {
                System.out.println("Ganador: " + juego.ganador().getnombre());
            } else {
                System.out.println("Hubo empate");
            }
        }
    }


