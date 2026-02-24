import java.util.ArrayList;

public class libro extends Biblioteca {
    private int cantPag;
    private Socio socioPrestamo;
    private ArrayList<String> caracteristicas;

    public libro(int cantPag, Socio socioPrestamo) {
        this.caracteristicas =new ArrayList<>();
        this.cantPag = cantPag;
        this.socioPrestamo = socioPrestamo;
    }
    public void AddCaracteristica(String caracteristica) {
        if (!caracteristicas.contains(caracteristica)) {
            caracteristicas.add(caracteristica);
        }

    }
    public boolean EstaPrestado() {
        return socioPrestamo != null;
    }

    public int getCantPag() {
        return cantPag;
    }

    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }

    public Socio getSocioPrestamo() {
        return socioPrestamo;
    }

    @Override
    public ArrayList<libro> getLibroDispo(Requisito r) {
        ArrayList<libro> libros = new ArrayList<>();
        if (EstaPrestado() && r.cumple(this)){
            libros.addAll(getLibroDispo(r));
        }
        return libros;
    }

    @Override
    public int getTotalLibro() {
        return 1;//Final ponerlo en una constante
    }

    @Override
    public int getTotalibroFiltro(Condicion c) {
        if (c.cumple(this)){
            return 1;
        }
        return 0;
    }

    @Override
    public double getprocentajeTotal() {
        int i = 1 / getTotalLibro();
        return i;
    }

    @Override
    public double getprocentajeTotalfiltro(Condicion c) {
        if (c.cumple(this)){
            return 1/getTotalLibro();;
        }
        return 0;
    }
}
