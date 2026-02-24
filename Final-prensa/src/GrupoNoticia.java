import java.util.ArrayList;

public class GrupoNoticia extends Prensa{
    protected ArrayList<Prensa> prensas;

    public GrupoNoticia(String titulo, Condicion calcula) {
        super(titulo, calcula);
        this.prensas = new ArrayList<>();
    }

    @Override
    public void addPalabra(String palabra) {
        for (Prensa prensa : prensas) {
                prensa.addPalabra(palabra);
        }
    }

    public void addPrensa(Prensa prensa) {
        this.prensas.add(prensa);
    }
    @Override
    public int calculaEstadistica(Condicion c) {
        int resultado = 0;
        if (c.cumple(this)) {// chequea que cumplo sin inportar mis hijos
            return 1;
        }
            for (Prensa p: prensas) {
                resultado += p.calculaEstadistica(c); // Sumar recursivamente
            }

            return resultado;
    }

    @Override
    public String getCategoria() {
        String categoria=prensas.get(0).getCategoria();
        if (!categoria.isEmpty()){
            return categoria;
        }
        return null;
    }

    @Override
    public ArrayList<String> getpalabraCalve() {
        ArrayList<String> resultado=new ArrayList<>();

        for (Prensa prensa : prensas) {
           for (String p : prensa.getpalabraCalve()){
               if (!resultado.contains(p)){
                   resultado.add(p);
               }
           }
        }
        return resultado;
    }


    @Override
    public String getContenido() {
        String resultado="";
        for (Prensa prensa : prensas) {
            resultado+=prensa.getContenido();
        }
        return resultado;
    }
}
