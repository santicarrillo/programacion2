package Musifly;

public class Filtraraño extends Buscar {
    private int anio;

    public Filtraraño(int anio) {
        this.anio = anio;
    }


    @Override
    public boolean cumple(Musica m) {
        if (m instanceof Pista) {
            Pista p = (Pista) m;
            return p.getAno().getYear() == anio;
        }
        return false;
    }

}
