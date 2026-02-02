package recuperatorio.recuperatorio;

import recuperatorio.recuperatorio.estrategias.EstrategiaEcologica;
import recuperatorio.recuperatorio.estrategias.EstrategiaMaximizada;
import recuperatorio.recuperatorio.estrategias.EstrategiaRapida;
import recuperatorio.modelo.Compra;
import recuperatorio.modelo.Contenedor;
import recuperatorio.modelo.ContenedorExpress;
import recuperatorio.modelo.Destinatario;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Crear algunos destinatarios
        Destinatario dest1 = new Destinatario("Juan", "Perez", "Pinto 399", "Tandil");
        Destinatario dest2 = new Destinatario("Maria", "Garcia", "Belgrano 399","Tandil");
        Destinatario dest3 = new Destinatario("Pedro", "Lopez", "Rodriguez 399","Tandil");

        // Crear compras individuales
        Compra compra1 = new Compra(dest1, 2, 20.5);
        compra1.addProducto("Libro");
        compra1.addProducto("Lapicera");

        Compra compra2 = new Compra(dest2, 4, 5.0);
        compra2.addProducto("Cuaderno");

        Compra compra3 = new Compra(dest3, 3, 15.0);
        compra3.addProducto("Monitor");
        compra3.addProducto("Teclado");
        compra3.addProducto("Mouse");

        // Crear contenedor principal
        Contenedor contenedorPrincipal = new Contenedor();
        contenedorPrincipal.addElemento(compra1);

        Contenedor paquete = new ContenedorExpress(5,1);
        paquete.addElemento(compra2);
        paquete.addElemento(compra3);
        contenedorPrincipal.addElemento(paquete);

        // Probar métodos de Envio
        System.out.println("=== Pruebas de métodos ===");

        // Verificar ciudad destino
        System.out.println("Ciudad destino del contenedor: " + contenedorPrincipal.getCiudadDestino());

        // Verificar tiempo estimado
        System.out.println("Tiempo estimado máximo: " + contenedorPrincipal.getTiempoEstimado());

        // Verificar si está entregado
        System.out.println("¿Está entregado el contenedor? " + contenedorPrincipal.estaEntregado());

        // Comparador por cantidad de productos
        ArrayList<Comparator<Compra>> estrategias = new ArrayList<>();
        estrategias.add(new EstrategiaRapida());
        estrategias.add(new EstrategiaEcologica());
        estrategias.add(new EstrategiaMaximizada());

        for (Comparator<Compra> estrategia: estrategias) {
            // Obtener siguiente reparto usando el comparador
            Compra siguiente = contenedorPrincipal.siguiente(estrategia);
            if (siguiente != null) {
                System.out.println("Siguiente reparto por "+estrategia +" es :\n    -> " + siguiente);
            }
        }
    }
}
