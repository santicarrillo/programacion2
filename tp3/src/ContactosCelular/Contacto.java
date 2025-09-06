package ContactosCelular;

import JuegoSuperHeroes.Personaje;
import java.time.*;

public class Contacto {
    private String nombre,apellido,direccion,direccionemail;
    private long telefono;
    private int edad;
    private LocalDateTime fechaNacimiento;
    private String ciudad;

    public Contacto(String apellido, String direccion, String direccionemail, int edad, LocalDateTime fechaNacimiento, String nombre, long telefono,String ciudad) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.direccionemail = direccionemail;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionemail() {
        return direccionemail;
    }

    public void setDireccionemail(String direccionemail) {
        this.direccionemail = direccionemail;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }



}
