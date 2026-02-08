package Condiciones;

public class CondicionPlabraclave {
        private String palabraBuscada;

        public CondicionPalabraClave(String palabra) {
            this.palabraBuscada = palabra;
        }

        @Override
        public boolean cumple(Wallpaper wallpaper) {
            return wallpaper.getPalabrasClave().contains(palabraBuscada);
        }
}
