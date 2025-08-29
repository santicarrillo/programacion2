package Serie;

public class Serie {
    private String titulo,descripcion,genero,creador;

    private Temporada[] temporadas;
    private int maxcant;
    private int cantidadTemporadas;
    public Serie(String titulo, String creador, int maxcant){
        this.titulo = titulo;
        this.creador = creador;
        temporadas = new Temporada[maxcant];
        cantidadTemporadas=0;
    }
    public int cantidadTemporadas(){
        int suma=0;
        for (int i = 0; i < cantidadTemporadas; i++) {
            Temporada taux= temporadas[i];
            suma=suma+taux.cantidadepisodios();
        }
        return suma;
    }
    public int cantidadEpisodiosVistos(){
        int suma=0;
        for (int i = 0; i < cantidadTemporadas; i++) {
            Temporada taux= temporadas[i];
            suma+=taux.cantidadEpisodioVistos();
        }
        return suma;
    }
    public boolean seVioCompleta() {
        return this.cantidadEpisodiosVistos() == this.cantidadTemporadas();
    }

    public void agregarTemporada(Temporada tt){
        if (cantidadTemporadas < maxcant){
            temporadas[cantidadTemporadas] = tt;
            cantidadTemporadas++; // solo una vez
        }
    }
    public Temporada getTemporada(int i){
        if (i<0 || i<=cantidadTemporadas){
            return temporadas[i];
        }else
            return null;
    }
    public void agregarEpisodio(Episodio ee, int tep){
        Temporada tt = this.getTemporada(tep);
        if (tt!=null){
            tt.agregarEpisodio(ee);
        }

    }
    public double getPromedioCalificaciones(){
        double suma=0;
        for (int i = 0; i < cantidadTemporadas; i++) {
            Temporada taux= temporadas[i];
            suma=suma+taux.getpuntajepromedio()*taux.cantidadEpisodioVistos();
        }
        return suma/this.cantidadEpisodiosVistos();
    }
}
