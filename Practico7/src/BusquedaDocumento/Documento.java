package BusquedaDocumento;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private int cantContenido;
    private ArrayList<String> Autores;
    private ArrayList<String> palabrasClaves;

    public Documento(ArrayList<String> autores, ArrayList<String> palabrasClaves, String titulo) {
        Autores = new  ArrayList<>();
        this.palabrasClaves = new  ArrayList<>();
        this.titulo = titulo;
    }

    public int getCantContenido() {
        return cantContenido;
    }

    public void setCantContenido(int cantContenido) {
        this.cantContenido = cantContenido;
    }

    public ArrayList<String> getAutores() {
        ArrayList<String> copAutores = new   ArrayList<>();
        copAutores.addAll(palabrasClaves);
        return copAutores;
    }



    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> copPalabrasClaves = new  ArrayList<>();
        copPalabrasClaves.addAll(palabrasClaves);
        return copPalabrasClaves;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
