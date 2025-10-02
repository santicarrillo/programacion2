package Ejercicio1;

/* 1. Agroquímicos

Se debe diseñar e implementar un sistema para una empresa agrícola que se dedica a la
fabricación y venta de productos químicos. Un producto químico tiene asociado un nombre, un
conjunto cultivos donde se desaconseja su uso (por ejemplo, girasol, lino, maíz), y un conjunto
de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de tratar (por
ejemplo, hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros).

El sistema está pensado para ayudar a las agrícolas a decidir qué agroquímico se puede
utilizar para tratar ciertas enfermedades de los cultivos. Una enfermedad tiene un nombre
asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo: Cochinilla
(estados patológicos: deshidratación, hojas amarillas). Aclaración: los estados patológicos de
una enfermedad se corresponden con los estados patológicos que los productos son capaces de
tratar.

Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden afectar.
Asimismo, dado un producto químico, los cultivos son capaces de decir si en algún momento
puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus enfermedades
frecuentes y no se desaconseja su uso en el cultivo. Se considera que el agroquímico trata una
enfermedad si todos los estados patológicos de la enfermedad están contenidos por las acciones
del producto químico.

Se debe proveer los siguientes servicios:

● Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.

● Dado un cultivo y una enfermedad devolver el listado de agroquímicos que los pueden
tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
determinados cultivos. */

import java.util.ArrayList;

public class Sistema {
    ArrayList<Agroquimico> agroquimicos;
    ArrayList<Agrocultivo> agrocultivos;
    Buscador bb;

    public Sistema(Buscador bb) {
        this.agroquimicos = new ArrayList<>();
        this.agrocultivos = new ArrayList<>();
        this.bb = bb;
    }

    // Getters y setters de los ArrayList

    public Buscador getBb() {
        return bb;
    }

    public void setBb(Buscador bb) {
        this.bb = bb;
    }

    public ArrayList<Agroquimico> obtenerListado() {
        ArrayList<Agroquimico> salida = new ArrayList<>();

        for (Agroquimico qq : agroquimicos) {
            if (this.bb.cumple(qq)) {
                salida.add(qq);
            }
        }

        return salida;
    }
}
