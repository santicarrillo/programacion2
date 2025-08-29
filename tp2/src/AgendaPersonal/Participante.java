package AgendaPersonal;

public class Participante {
    private String nombre ,email;
    private int telefono;


    public Participante(String nb ,int tlf,String email){
        this.nombre=nb;
        this.telefono=tlf;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
