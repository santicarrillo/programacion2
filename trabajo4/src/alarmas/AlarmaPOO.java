package alarmas;

public class AlarmaPOO {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        Sensor puerta = new Sensor("Puerta principal");
        Sensor ventana = new Sensor("Ventana del living");
        Sensor vidrio = new Sensor("Vidrio cocina");

        alarma.addsensores(puerta);
        alarma.addsensores(ventana);
        alarma.addsensores(vidrio);

        // Activamos dos sensores
        puerta.activar();
        vidrio.activar();

        alarma.comprobar();
    }
}
