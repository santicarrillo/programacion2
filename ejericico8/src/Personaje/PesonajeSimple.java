package Personaje;

public class PesonajeSimple extends ElemntoPersonaje{
    private int peso, edad;
            private Fruta fruta;
    private  static int fuerza=125;

    public PesonajeSimple(String nombre, Fruta fruta, int fuerza, int peso) {
        super(nombre);
        this.fruta = fruta;
        this.peso = peso;
    }

    @Override
        public int getFuerza(){
        if (this.fruta!=null){
            return fruta.calculaFuerza(this);
        }
        return fuerza;
        }
    @Override
        public int getpeso(){
        return this.peso;
    }

    @Override
    public int getedad(){
        return this.edad;
    }

    public static void setFuerza(int nuevafuerza){
        fuerza = nuevafuerza;
    }

    @Override
    public int cantidadPersonaje() {
        return 1;
    }
}
