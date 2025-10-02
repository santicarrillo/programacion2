package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear cultivos
        Agrocultivo maiz = new Agrocultivo("Maíz");
        maiz.addEnfermedad("hojas amarillas");
        maiz.addEnfermedad("deshidratación");

        Agrocultivo girasol = new Agrocultivo("Girasol");
        girasol.addEnfermedad("hojas mordidas");

        // Crear agroquímicos
        Agroquimico agro1 = new Agroquimico("QuimicoA");
        agro1.addEnfermedad("hojas amarillas");
        agro1.addEnfermedad("deshidratación");
        agro1.addCultivo(girasol); // No se puede usar en girasol

        Agroquimico agro2 = new Agroquimico("QuimicoB");
        agro2.addEnfermedad("hojas amarillas");
        agro2.addEnfermedad("deshidratación");

        Agroquimico agro3 = new Agroquimico("QuimicoC");
        agro3.addEnfermedad("hojas mordidas");

        // Crear sistema con buscador que filtra según que no acepte el cultivo
        Buscador buscadorMaiz = new BuscadorAceptaCultivo(maiz);
        Sistema sistema = new Sistema(buscadorMaiz);

        // Agregar agroquímicos al sistema
        sistema.agroquimicos.add(agro1);
        sistema.agroquimicos.add(agro2);
        sistema.agroquimicos.add(agro3);

        // Obtener listado de agroquímicos útiles para Maíz
        ArrayList<Agroquimico> lista = sistema.obtenerListado();

        System.out.println("Agroquímicos útiles para Maíz:");
        for (Agroquimico a : lista) {
            System.out.println(a.getNombre());
        }

        // Crear buscador para Girasol y cambiar el buscador del sistema
        Buscador buscadorGirasol = new BuscadorAceptaCultivo(girasol);
        sistema.setBb(buscadorGirasol);

        lista = sistema.obtenerListado();

        System.out.println("\nAgroquímicos útiles para Girasol:");
        for (Agroquimico a : lista) {
            System.out.println(a.getNombre());
        }

        sistema.setBb(new BuscadorAND(buscadorMaiz, buscadorGirasol));
    }
}
