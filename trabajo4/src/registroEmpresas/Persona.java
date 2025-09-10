package registroEmpresas;

class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        return "Persona: " + nombre + " " + apellido + " (" + edad + " años)";
    }
}
