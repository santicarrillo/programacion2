import java.util.ArrayList;

public abstract class Biblioteca {

    public abstract int  getTotalLibro();
    public abstract int  getTotalibroFiltro(Condicion c);
    public abstract double  getprocentajeTotal();
    public abstract double  getprocentajeTotalfiltro(Condicion c);
    public abstract ArrayList<libro> getLibroDispo(Requisito r);


}
