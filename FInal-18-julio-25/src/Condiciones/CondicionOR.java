package Condiciones;

public class CondicionOR extends  Condicion {
    private Condicion c1,c2;

    public CondicionOR(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(Wallpaper wallpaper) {
        return c1.cumple(wallpaper) || c2.cumple(wallpaper);
    }
}
