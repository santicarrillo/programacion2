package registroEmpresas;

class UsuarioFinal extends Persona {
    private String username;
    private String password;

    public UsuarioFinal(String nombre, String apellido, int edad, String username, String password) {
        super(nombre, apellido, edad);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioFinal - " + nombre + " " + apellido + " (" + edad + " años)"
                + ", Usuario: " + username + ", Password: " + password;
    }
}