public class Dado {
    private int cantidadCaras;
    private int ultimoValor;;
    public  Dado(){
        cantidadCaras = 6;
        tiradado();
    }
    public Dado(int cantidadCaras){
        this.cantidadCaras = cantidadCaras;
        tiradado();
    }
    //gets
    public int getCantidadCaras(){
        return cantidadCaras;
    }
    public int getUltimoValor(){
        return ultimoValor;
    }
    public void setCantidadCaras(int cantidadCaras){
        cantidadCaras = cantidadCaras;
    }
    public int tiradado() {

        ultimoValor= (int) (Math.random() * cantidadCaras)+1;//numeros entros entre 1 6 6
        return ultimoValor;
    }

}
