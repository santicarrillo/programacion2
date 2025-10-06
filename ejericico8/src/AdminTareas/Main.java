package AdminTareas;

import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            // Tareas simples
            TareaSimple ordenar = new TareaSimple("Orden", "Organizar", 5.0, "Ordenar", 10);
            TareaSimple batir = new TareaSimple("Batido", "Mezclar", 15.0, "Batir", 10);
            TareaSimple descansar = new TareaSimple("Reposo", "Esperar", 0.0, "Dejar descansar", 15);
            TareaSimple hornear = new TareaSimple("Horno", "Cocinar", 40.0, "Hornear", 20);
            TareaSimple desmoldar = new TareaSimple("Final", "Terminar", 10.0, "Desmoldar", 5);

            // Tarea compuesta: Cocinar
            TareaCompuesta cocinar = new TareaCompuesta("Cocinar", "Proceso", "Cocina");
            cocinar.addTarea(batir);
            cocinar.addTarea(descansar);

            // Tarea compuesta repetitiva: Repetir 3 veces
            TareaCompuestaRepetitiva repetir = new TareaCompuestaRepetitiva("Repetir", "Ciclo", "Cocina", 3);
            repetir.addTarea(ordenar);
            repetir.addTarea(cocinar);
            repetir.addTarea(hornear);

            // Tarea compuesta principal: Hacer receta
            TareaCompuesta hacerReceta = new TareaCompuesta("Receta", "Completa", "Cocina");
            hacerReceta.addTarea(repetir);
            hacerReceta.addTarea(desmoldar);

            // Mostrar acciones
            ArrayList<String> accionesFinales = hacerReceta.getaccion();
            System.out.println("Acciones a realizar:");
            for (String accion : accionesFinales) {
                System.out.println("- " + accion);
            }

            // Mostrar costo y tiempo total
            System.out.println("\nCosto total: $" + hacerReceta.getCosto());
            System.out.println("Tiempo estimado total: " + hacerReceta.tiempoEstimado() + " minutos");

        }
    }
