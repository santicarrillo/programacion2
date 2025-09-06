package ContactosCelular;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CelularPOO {
    public static void main(String[] args) {
        // Crear algunos contactos
        Contacto c1 = new Contacto("Perez", "Calle Falsa 123", "santi@mail.com", 34, LocalDateTime.of(1990, 1, 1, 0, 0), "Santiago", 1234L, "Buenos Aires");
        Contacto c2 = new Contacto("Gomez", "Calle Real 456", "juan@mail.com", 38, LocalDateTime.of(1985, 3, 5, 0, 0), "Juan", 5678L, "Rosario");
        Contacto c3 = new Contacto("Perez", "Calle Falsa 123", "santi2@mail.com", 34, LocalDateTime.of(1990, 1, 1, 0, 0), "Santiago", 1234L, "Buenos Aires"); // repetido
        Contacto c4 = new Contacto("Lopez", "Av Siempre Viva 789", "maria@mail.com", 31, LocalDateTime.of(1992, 12, 12, 0, 0), "Maria", 5678L, "Cordoba"); // mismo numero que Juan

        // Crear el celular y agregar los contactos
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        listaContactos.add(c1);
        listaContactos.add(c2);
        listaContactos.add(c3);
        listaContactos.add(c4);

        Celular celular = new Celular(listaContactos);

        System.out.println("----- Todos los contactos -----");
        celular.listContactos();

        System.out.println("\n----- Contactos repetidos -----");
        celular.listContactosRepetidos();

        System.out.println("\n----- Contactos con mismo número -----");
         celular.listContactosRepetidos();

        System.out.println("\n----- Promedio de edad -----");
        System.out.println(celular.Promedioedad());
    }

}

