import java.util.ArrayList;

public abstract class menu {
protected ArrayList<String> ingredientes;

public menu(){
    this.ingredientes= new  ArrayList<>();
}
public void addIngerdiente(String i){
    this.ingredientes.add(i);
}
    protected abstract double getTiempoPrepa();
    protected abstract double getPrecio();
    protected abstract double getCaloria();
    protected abstract ArrayList<String> getIngredientes();
    protected abstract ArrayList<Comida> buscar(Buscador preferencia);

}
