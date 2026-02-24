import java.util.ArrayList;

public class GrupoSeccion  extends Biblioteca {
    private ArrayList<Biblioteca> bibliotecas;
    public GrupoSeccion() {
       this.bibliotecas = new ArrayList<>();
    }
    public void addBiblioteca(Biblioteca biblioteca) {
        this.bibliotecas.add(biblioteca);
    }

    @Override
    public ArrayList<libro> getLibroDispo(Requisito r) {
        return null;
    }

    @Override
    public int getTotalLibro() {
        int total=0;
        for (Biblioteca b: bibliotecas) {
            int totalLibro = b.getTotalLibro();
        }
        return total;
    }

    @Override
    public int getTotalibroFiltro(Condicion c) {
        int total=0;
        for (Biblioteca b: bibliotecas) {
            int totalLibro = b.getTotalibroFiltro(c);
        }
return total;
    }

    @Override
    public double getprocentajeTotal() {
         double total=0;
        for (Biblioteca b: bibliotecas) {
             total+= b.getprocentajeTotal();
        }
        return total/getTotalLibro();
    }


    @Override
    public double getprocentajeTotalfiltro(Condicion c) {
        double total=0;
        for (Biblioteca b: bibliotecas) {
             total += b.getprocentajeTotalfiltro(c);
        }
        return total/getTotalLibro();
    }
}
