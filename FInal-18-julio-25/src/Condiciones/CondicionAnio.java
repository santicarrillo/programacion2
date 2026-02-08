package Condiciones;

public class CondicionAnio extends Condicion {
        private int anio;

        public CondicionAnio(int anio) {
            this.anio = anio;
        }

        @Override
        public boolean cumple(Wallpaper wallpaper) {
            return wallpaper.getAnioCreacion() == anio;
        }

}
