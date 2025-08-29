package EstablesimientoDeportivo;

import java.util.ArrayList;

public class Establesimiento {
    private ArrayList<Turno> turnos;
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> usuarios;
    private int MaxT=5,MaxC=2,MaxU=10;

    public  Establesimiento ( int MaxT, int MaxC, int MaxU) {
        this.turnos = new ArrayList<>(MaxT);
        this.canchas = new ArrayList<>(MaxC);
        this.usuarios = new ArrayList<>(MaxU);
    }
    // set and get
    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public ArrayList<Cancha> getCanchas() {
        return canchas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int getMaxC() {
        return MaxC;
    }

    public void setMaxC(int maxC) {
        this.MaxC = maxC;
    }

    public int getMaxT() {
        return MaxT;
    }

    public void setMaxT(int maxT) {
        MaxT = maxT;
    }

    public int getMaxU() {
        return MaxU;
    }

    public void setMaxU(int maxU) {
        MaxU = maxU;
    }
/// Agrega elimina ///
    public Usuario agregarUsuario (Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario;
    }

    public Usuario eliminarUsuario (Usuario usuario) {
          this.usuarios.remove(usuario);
          return  usuario;
    }

    public Cancha agregarCancha (Cancha cancha) {
        this.canchas.add(cancha);
        return cancha;
    }

    public Cancha eliminarCancha (Cancha cancha) {
        this.canchas.remove(cancha);
        return  cancha;
    }

    public  Turno agregarTurno (Turno turno) {
        this.turnos.add(turno);
        for(Usuario u: turno.getUsuarios()) {
            u.agregarReserva(turno);
            u.actualizarEsSocio();
        }
        return turno;
    }

    public Turno eliminarTurno (Turno turno) {
        this.turnos.remove(turno);
        return turno;
    }


    public  ArrayList<Cancha> obtenerCanchas() {
        return canchas;
    }

    public double calcularPrecioTurno(Turno turno) {
        double precioBase = turno.getCanchas().getPrecio();
        double total = 0;

        for (Usuario u : turno.getUsuarios()) {
            if (u.isEsSocio()) {
                total += precioBase * 0.9; // socio paga 10% menos
            } else {
                total += precioBase;
            }
        }

        return total;
    }

}

