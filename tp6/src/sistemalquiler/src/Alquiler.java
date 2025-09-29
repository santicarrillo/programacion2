import java.time.LocalDate;

public class Alquiler {

    private Cliente cliente;
    private ItemAlquiler itemAlquiler;
    private LocalDate fechaLimite;

    public Alquiler(Cliente cliente, LocalDate fechaLimite, ItemAlquiler itemAlquiler) {
        this.cliente = cliente;
        this.fechaLimite = fechaLimite;
        this.itemAlquiler = itemAlquiler;
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

    public ItemAlquiler getItemAlquiler() {
        return itemAlquiler;
    }

    public void setItemAlquiler(ItemAlquiler itemAlquiler) {
        this.itemAlquiler = itemAlquiler;
    }

    public boolean EstaVencido(){
        return LocalDate.now().isAfter(this.fechaLimite);
    }
}
