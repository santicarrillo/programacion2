import java.util.ArrayList;

public class menucom extends menu{
    protected ArrayList<menu> menus;
    private double descuento;
    public  menucom(double descuento) {
        this.menus = new ArrayList<>();
        this.descuento = descuento;
    }
    public void  addmenu(menu m){
        menus.add(m);
    }
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    protected double getCaloria() {
        double suma=0;
        for(menu m:menus) {
            suma+=m.getCaloria();
        }
        return suma;
    }

    @Override
    protected double getTiempoPrepa() {
        double mayor=0;
        for(menu m:menus) {
            if (m.getTiempoPrepa()>mayor) {
                mayor = m.getTiempoPrepa();
            }
        }
        return mayor;
    }

    @Override
    protected double getPrecio() {
        double suma=0;
        for(menu m:menus) {
            suma+=m.getPrecio();
        }
        return suma-getDescuento();
    }

        @Override
        public ArrayList<String> getIngredientes() {
            ArrayList<String> resultado = new ArrayList<>();

            for (menu m : menus) {
                ArrayList<String> ingrMenu = m.getIngredientes();

                for (String ingr : ingrMenu) {
                    if (!resultado.contains(ingr)) {
                        resultado.add(ingr);
                    }
                }
            }

            return resultado;
        }

    @Override
    protected ArrayList<Comida> buscar(Buscador p) {
        ArrayList<Comida> resultado= new ArrayList<>();
        for (menu m : menus) {
            resultado.addAll(m.buscar(p));
        }
        return resultado;
    }

}
