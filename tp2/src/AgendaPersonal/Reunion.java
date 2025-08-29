package AgendaPersonal;

import java.time.LocalDateTime;

public class Reunion {
    private Participante[] participantes;
    private String lugar,tema;
    private int duracion;
    private int hora;
    private int  max;
    private int catidadP;

    public Reunion(String lugar, String tema , int duracion, int hora,int max,int  catidadP) {
        this.lugar=lugar;
        this.tema=tema;
        this.duracion=duracion;
        this.hora=hora;
        this.participantes = new Participante[max];
        this.catidadP=0;
    }
    public void agregarparticipante(Participante p){
        if (catidadP<max) {
            participantes[catidadP]=p;
            catidadP++;
        }
    }
    public void quitarParticipante(String nombre) {
        for (int i = 0; i < catidadP; i++) {
            if (participantes[i].getNombre().equals(nombre)) {
                // mover los elementos restantes hacia la izquierda
                for (int j = i; j < catidadP - 1; j++) {
                    participantes[j] = participantes[j + 1];
                }
                participantes[catidadP- 1] = null;
                catidadP--;

            }
        }
    }

    public int getHora() {
        return hora;
    }

    public Reunion setHora(int  hora) {
        this.hora = hora;
        return this;
    }

    public int getHoraFin() {
        return hora + duracion;
    }

}


