public class ProductoLimite extends ProductoSimple{
    private int LimiteDeCaracteres;
    public ProductoLimite(int id, String marca, int precioLista,int limiteDeCaracteres) {
        super(id, marca, precioLista);
        this.LimiteDeCaracteres = limiteDeCaracteres;
    }

    public int getLimiteDeCaracteres() {
        return LimiteDeCaracteres;
    }

    public void setLimiteDeCaracteres(int limiteDeCaracteres) {
        LimiteDeCaracteres = limiteDeCaracteres;
    }

    @Override
    public void addCategoria(String c) {
        if (categorias.size()<getLimiteDeCaracteres()){
            super.addCategoria(c);
        }
    }

    @Override
    public ProductoLimite cascaron(){
        return new ProductoLimite(getId(),getMarca(),getprecioDeLista(),getLimiteDeCaracteres());
    }
}
