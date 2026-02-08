import Condiciones.Condicion;

import java.util.ArrayList;

public class ColeccionPromocion extends  CarpetaWallpeaper{
    private Wallpaper wallpaper;
    public ColeccionPromocion(String titulo) {
        super(titulo);

    }

    @Override
    public ArrayList<Wallpaper>listados(Condicion c) {
        ArrayList<Wallpaper> resultado = new ArrayList<>();
        if (!wallpapers.isEmpty()) {
            // Obtener el primer wallpaper que encuentre (publicitario)
            for (ElePadre elemento : wallpapers) {
                ArrayList<Wallpaper> wallpapersElemento = elemento.listados(new Condicion() {
                    @Override
                    public boolean cumple(Wallpaper w) {
                        return false;
                    }
                });
                if (!wallpapersElemento.isEmpty()) {
                    resultado.add(wallpapersElemento.get(0)); // Agregar el primero como publicidad
                    break;
                }
            }
        }

        // Luego agregar los que cumplen la condición
        for (ElePadre w : wallpapers) {
            resultado.addAll(w.listados(c));
        }

        return resultado;
    }
    }
}
