public class Miembro {
    private String nombreClave, MetalesFavorito,HablidadEspecial;
    private int Altura;

    public Miembro(int altura, String hablidadEspecial, String metalesFavorito, String nombreClave) {
        Altura = altura;
        HablidadEspecial = hablidadEspecial;
        MetalesFavorito = metalesFavorito;
        this.nombreClave = nombreClave;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public String getHablidadEspecial() {
        return HablidadEspecial;
    }

    public void setHablidadEspecial(String hablidadEspecial) {
        HablidadEspecial = hablidadEspecial;
    }

    public String getMetalesFavorito() {
        return MetalesFavorito;
    }

    public void setMetalesFavorito(String metalesFavorito) {
        MetalesFavorito = metalesFavorito;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }
}
