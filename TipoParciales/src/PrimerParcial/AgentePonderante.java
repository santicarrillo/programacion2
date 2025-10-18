package PrimerParcial;

import PrimerParcial.Calcular.CalculaAp;

import java.util.ArrayList;

public class AgentePonderante extends Agente {
    private CalculaAp calculaAp;


    public AgentePonderante(int experiencia, String habilidades, double ingenio, String nombre, int velocidad, CalculaAp calculaAp) {
        super(experiencia, habilidades, ingenio, nombre, velocidad);
        this.calculaAp = calculaAp;
    }

    @Override
    public double calcular() {
        return calculaAp.Calcula(this);
    }

   public String obtienePrimero(){
        String primero="";
        for (String a :this.getHabilidades()){
            primero = this.getHabilidades().get(0);
        }
        return primero;
   }

}
