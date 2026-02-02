package recuperatorio.recuperatorio.modelo;

import recuperatorio.recuperatorio.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Contenedor extends Envio {
    private ArrayList<Envio> elementos;

    public Contenedor() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Envio elemento) {
        String destino = this.getCiudadDestino();
        if (destino == null ||
                destino.equals(elemento.getCiudadDestino())) {
            this.elementos.add(elemento);
        }
    }

    @Override
    public boolean estaEntregado() {
        if (this.elementos.isEmpty()) {
            return false;
        }
        for (Envio elemento : this.elementos) {
            if (!elemento.estaEntregado()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getCiudadDestino() {
        if (this.elementos.isEmpty())
            return null;
        else
            return this.elementos.get(0).getCiudadDestino();
    }

    @Override
    public int getTiempoEstimado() {
        int tiempoMaximo = 0;
        for (Envio elemento : this.elementos) {
            int tiempoElemento = elemento.getTiempoEstimado();
            if (tiempoElemento > tiempoMaximo) {
                tiempoMaximo = tiempoElemento;
            }
        }
        return tiempoMaximo;
    }

    @Override
    public Compra siguiente(Comparator<Compra> estrategia) {
        Compra siguienteReparto = null;
        for (Envio elemento : this.elementos) {
            Compra siguienteDelElemento = elemento.siguiente(estrategia);
            if (siguienteReparto ==null || (siguienteDelElemento != null &&
                    !siguienteDelElemento.estaEntregado() &&
                    estrategia.compare(siguienteDelElemento, siguienteReparto ) < 0)) {
                siguienteReparto = siguienteDelElemento;
            }
        }
        return siguienteReparto;
    }

    @Override
    public Envio getCopia(Condicion condicion) {
        Contenedor copia = crearContenedor();
        boolean copiar = false;
        for (Envio elemento : this.elementos) {
            Envio copiaElemento = elemento.getCopia(condicion);
            if (copiaElemento != null) {
                copia.addElemento(copiaElemento);
                copiar = true;
            }
        }
        if (copiar)
            return copia;
        else
            return null;
    }

    protected Contenedor crearContenedor() {
        return new Contenedor();
    }
}
