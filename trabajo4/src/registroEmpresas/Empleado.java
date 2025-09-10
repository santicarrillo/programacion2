package registroEmpresas;

class Empleado extends Persona {
    protected int legajo;
    protected double sueldo;

    public Empleado(String nombre, String apellido, int edad, int legajo, double sueldo) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado - " + nombre + " " + apellido + " (" + edad + " años)"
                + ", Legajo: " + legajo + ", Sueldo: $" + sueldo;
    }
}
