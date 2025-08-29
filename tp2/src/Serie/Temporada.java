package Serie;

public class Temporada {
   private Episodio [] episodios;
    private int cantidadEpisodios;
    private int MAX;
    public Temporada(int MAX){
        episodios = new Episodio[MAX];
        // cada lugar d los 150 hay un null
        // no se creo un arreglo
        cantidadEpisodios = 0;
    }
    public int cantidadepisodios() {
        return cantidadEpisodios;
    }
    public void agregarEpisodio(Episodio ee) {
        if (cantidadEpisodios < MAX) {
            episodios[cantidadEpisodios] = ee;
            cantidadEpisodios++;
        }

    }
    public Episodio getEpisodios(int pos){
        if(pos>=0 && pos<MAX){
            return episodios[pos];
        }else {
            return null;
        }
    }
    public int cantidadEpisodioVistos() {
        int suma=0;
        for (int i = 0; i < cantidadEpisodios; i++) {
            Episodio aux= episodios[i] ;
            if(aux.sevio()){
                suma++;
            }
        }
        return suma;
    }
    public double getpuntajepromedio(){
        int  suma=0;
        for (int i = 0; i < cantidadEpisodios; i++) {
            Episodio aux= episodios[i] ;
            if(aux.sevio()){
                suma=suma+aux.getCalificacion();
            }
        }
        return (double) suma /this.cantidadEpisodioVistos();
    }

}
