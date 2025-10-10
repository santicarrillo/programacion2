package AcademiaVitual;

import java.util.ArrayList;

public class Evalucion {
        public static void main(String[] args) {
            // Crear preguntas
            Pregunta p1 = new Pregunta("¿Qué es la herencia?", 5, 3);
            p1.addConceptos("Herencia");
            p1.addConceptos("Polimorfismo");

            Pregunta p2 = new Pregunta("¿Qué es la encapsulación?", 4, 2);
            p2.addConceptos("Encapsulamiento");

            Pregunta p3 = new Pregunta("¿Qué es el acoplamiento?", 3, 2);
            p3.addConceptos("Acoplamiento");
            p3.addConceptos("Encapsulamiento"); // repetido a propósito

            Pregunta p4 = new Pregunta("¿Qué es la abstracción?", 6, 4);
            p4.addConceptos("Abstracción");
            p4.addConceptos("Herencia"); // repetido a propósito

            // Unidad secuencial
            UnidadSecuencial unidadSecuencial = new UnidadSecuencial();
            unidadSecuencial.addParte(p1);
            unidadSecuencial.addParte(p2);

            // Unidad optativa
            UnidadOptativa unidadOptativa = new UnidadOptativa();
            unidadOptativa.addOpcion(p3);
            unidadOptativa.addOpcion(p4);

            // Evaluación final (unidad secuencial que contiene ambas)
            UnidadSecuencial evaluacionFinal = new UnidadSecuencial();
            evaluacionFinal.addParte(unidadSecuencial);
            evaluacionFinal.addParte(unidadOptativa);

            // Mostrar resultados
            System.out.println("🧠 Evaluación Final");
            System.out.println("Puntaje total: " + evaluacionFinal.getCantpuntaje());
            System.out.println("Tiempo estimado: " + evaluacionFinal.gettiempoestimado() + " minutos");

            System.out.println("Conceptos evaluados:");
            ArrayList<String> conceptos = evaluacionFinal.getConceptos();
            for (String concepto : conceptos) {
                System.out.println("- " + concepto);
            }
        }
}
