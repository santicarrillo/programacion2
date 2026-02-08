import Condiciones.Condicion;

import java.util.ArrayList;

public class CarpetaMinimalismoPatrocinado extends CarpetaWallpeaper {
    private String palabraClave ;

    public CarpetaMinimalismoPatrocinado(String titulo,String palabraClave) {
        super(titulo);
        this.palabraClave = palabraClave;
    }

    // REDEFINICIÓN: Siempre agrega el wallpaper patrocinado
    @Override
    protected ArrayList<Wallpaper> listados(Condicion cc) {
        ArrayList<Wallpaper> resultado = new ArrayList<>();

        // Siempre agregar el wallpaper "Minimal White Background" primero
        Wallpaper wallpaperPatrocinado = buscarWallpaperPatrocinado();
        if (wallpaperPatrocinado != null) {
            resultado.add(wallpaperPatrocinado);
        }

        // Luego agregar los que cumplen la condición
        for (ElePadre w : wallpapers) {
            resultado.addAll(w.listados(cc));
        }

        return resultado;
    }

    private Wallpaper buscarWallpaperPatrocinado() {
        // Buscar el wallpaper "Minimal White Background" en toda la estructura
        CondicionTitulo condicion = new CondicionTitulo(palabraClave);

        for (ElePadre elemento : wallpapers) {
            ArrayList<Wallpaper> encontrados = elemento.listados(condicion);
            if (!encontrados.isEmpty()) {
                return encontrados.get(0);
            }
        }

        return null;
    }
}