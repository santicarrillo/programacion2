package Condiciones;

public class CondicionDescargas extends  Condicion {
        private int minimoDescargas;

        public CondicionDescargas(int minimo) {
            this.minimoDescargas = minimo;
        }

        @Override
        public boolean cumple(Wallpaper wallpaper) {
            return wallpaper.getCantidadDescargas() > minimoDescargas;
        }

}
