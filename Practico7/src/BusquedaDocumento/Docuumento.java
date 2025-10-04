package BusquedaDocumento;

import java.util.ArrayList;

public class Docuumento {
    private String titulo;
    private ArrayList<String> Autores;
    private ArrayList<String> palabrasClaves;

    public Docuumento(ArrayList<String> autores, ArrayList<String> palabrasClaves, String titulo) {
        Autores = new  ArrayList<>();
        this.palabrasClaves = new  ArrayList<>();
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
