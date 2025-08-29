package ejercicio1;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    // Constructor con solo DNI
    public Persona() {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.edad=18;
        this.fechaNacimiento = new Date(100, 0, 1); // 1 enero 2000 (año se cuenta desde 1900)
        this.sexo = "Femenino";
        this.peso = 1;
        this.altura = 1;
    }

    // Constructor con DNI, nombre y apellido
    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    // No hago setDni porque en el enunciado dice que el DNI es obligatorio y único
    // (se suele asignar solo en el constructor)

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double nuevoPeso) {
        this.peso = nuevoPeso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }

    // Calcular IMC
    public double calculaMasaCorporal() {
        return peso / (altura * altura);
    }

    //Sabe si esta En forma
    public boolean estaenforma(){
        return (calculaMasaCorporal()>=18.5 && calculaMasaCorporal()<=25);
    }
//sabe si cumple años

    public boolean cumpleAnios() {
        Calendar hoy = Calendar.getInstance();
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);

        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH); // Enero = 0
        int diaNac = nacimiento.get(Calendar.DAY_OF_MONTH);
        int mesNac = nacimiento.get(Calendar.MONTH);

        return (diaHoy == diaNac && mesHoy == mesNac);
    }

// Saber si es Mayor De Edad

    public boolean esMayoredad(){
        return getEdad()>18;
    }
    //puede votar
    public boolean puedeVotar(){
        return getEdad()>16;
    }
    // edadCoerente
    public boolean edadCoherente() {
        // Obtenemos la fecha actual
        Calendar hoy = Calendar.getInstance();

        // Creamos un Calendar con la fecha de nacimiento
        Calendar nacimiento = Calendar.getInstance();

        nacimiento.setTime(fechaNacimiento);
        // Calculamos la edad como la diferencia de años
        int edadCalculada = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        // Si no cumplió años este año, se resta 1
        if (!cumpleAnios()) {
            edadCalculada--;
        }

        return this.edad == edadCalculada;
    }


}


