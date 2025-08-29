package AgendaPersonal;

import java.time.LocalDateTime;

public class Agenda {

private Reunion [] reuniones;
private int MAX;
private int catidadReuniones;

    public Agenda(int MAX) {
        reuniones = new Reunion[MAX];
        catidadReuniones = 0;
    }
    public void agregarReunion(Reunion r) {
        if (!detectarConflicto(r) && catidadReuniones<MAX) {
            reuniones[catidadReuniones++] = r;
            catidadReuniones++;
            System.out.println("reuniones agregadas");
        }else
            System.out.println("no se pudo agregar conflico de horario");
    }

    public boolean detectarConflicto(Reunion nueva) {
        for (int i = 0; i < catidadReuniones; i++) {
            Reunion r = reuniones[i];
            boolean choca = nueva.getHora() < r.getHoraFin() && nueva.getHoraFin() > r.getHora();
            if (choca) return true;
        }
        return false;
    }



        }

