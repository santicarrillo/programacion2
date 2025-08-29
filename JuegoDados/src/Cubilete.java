public class Cubilete {
   private int  cantDados;

    private Dado[] dados;

    public Cubilete(int cantDados, int carasDados) {
        this.cantDados = cantDados;
        dados = new Dado[cantDados];
        for (int i = 0; i < cantDados; i++) {
            dados[i] = new Dado(carasDados);
        }
    }
    public Cubilete() {
       this(2,6);
    }
public Cubilete(int cantidadLados){
        this(cantidadLados,6);
}
    public int tirar(){
        int suma = 0;
        for (int i = 0; i < cantDados; i++) {
            suma= suma+ dados[i].tiradado();
        }
        return suma;
    }

    public int ultimaTirada(){
        int suma = 0;
        for (int i = 0; i < cantDados; i++) {
            suma=suma + dados[i].getUltimoValor();
        }
        return suma;
    }
}
