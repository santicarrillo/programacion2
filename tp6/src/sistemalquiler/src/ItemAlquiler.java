import java.time.LocalDate;

public abstract  class ItemAlquiler {

    protected  String Titulo;
    protected LocalDate fechaLimite;
    protected Cliente cliente;

    public ItemAlquiler(String Titulo, LocalDate fechaLimite, Cliente cliente) {
        this.Titulo = Titulo;
        this.fechaLimite = fechaLimite;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public abstract boolean sepuedeAlquilar();


}
