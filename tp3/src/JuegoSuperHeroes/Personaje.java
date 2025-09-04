package JuegoSuperHeroes;

public class Personaje {
    private String nombreSuper;
    private int edad;
    private Double peso,fuerza,altura;
    private boolean visionNocturna;

    public Personaje(Double altura, int edad, Double fuerza, String nombre, String nombreSuper, Double peso, boolean visionNocturna) {
        this.altura = altura;
        this.edad = edad;
        this.fuerza = fuerza;
        this.nombreSuper = nombreSuper;
        this.peso = peso;
        this.visionNocturna = visionNocturna;
    }

    public Double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public Double getFuerza() {
        return fuerza;
    }


    public String getNombreSuper() {
        return nombreSuper;
    }

    public Double getPeso() {
        return peso;
    }

    public boolean isVisionNocturna() {
        return visionNocturna;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
