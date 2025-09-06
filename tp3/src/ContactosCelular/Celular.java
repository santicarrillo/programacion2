package ContactosCelular;

import JuegoSuperHeroes.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Celular {
    private ArrayList<Contacto> contactos;



    public Celular (ArrayList<Contacto> contactos) {
        this.contactos = new ArrayList<>();
        this.contactos.addAll(contactos);
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }


    // metodos


    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);}

    public ArrayList<Contacto> listContactos() {
        for( Contacto contacto : contactos){
            System.out.println(contacto);
        }
        return contactos;
    }

    public  void listContactosRepetidos(){
        for (int i = 0; i < contactos.size(); i++) {
            Contacto c1 = contactos.get(i);
            for (int j = i + 1; j < contactos.size(); j++) {
                Contacto c2 = contactos.get(j);
                // comparamos nombre, apellido y teléfono
                if (c1.getNombre().equals(c2.getNombre()) &&
                        c1.getApellido().equals(c2.getApellido()) &&
                        Objects.equals(c1.getTelefono(), c2.getTelefono())) {
                    System.out.println(c1);
                    break; // ya lo encontramos repetido, pasamos al siguiente
                }
            }
        }
    }
    public double Promedioedad(){
            if (contactos.isEmpty()){
                return 0;
            }
            double total=0;
            for ( Contacto contacto : contactos){
                    total+=contacto.getEdad();
            }
        return total/contactos.size();
    }




}
