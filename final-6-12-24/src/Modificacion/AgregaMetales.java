package Modificacion;

public class AgregaMetales implements Modificacion {
    private String agregaMetale;

    public  AgregaMetales(String agregaMetale) {
        this.agregaMetale = agregaMetale;
    }
    @Override
    public void aplicar(Traje t){
        t.addListMetales(agregaMetale);
    }
}
