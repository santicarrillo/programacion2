package Condiciones;

public class CondicionUsuario extends Condicion {
    // Condición: Wallpaper creado por usuario específico
        private String usuario;

        public CondicionUsuario(String usuario) {
            this.usuario = usuario;
        }

        @Override
        public boolean cumple(Wallpaper wallpaper) {
            return wallpaper. getUsuario().equals(usuario);
        }
}
