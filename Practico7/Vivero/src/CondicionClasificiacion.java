public class CondicionClasificiacion extends Buscador{

    private String nombreClave;

    public CondicionClasificiacion(String nombreClave) {
        this.nombreClave = nombreClave;
    }

@Override
    public boolean cumple(Planta planta) {
      return   planta.getClaseSuperior().equals(this.nombreClave);
    }


}
