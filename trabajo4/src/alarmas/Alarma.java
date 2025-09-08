package alarmas;

import java.util.ArrayList;

public class Alarma {
       public ArrayList<Sensor>sensores;

        protected Timbre timbre;

        public Alarma(){
            this.timbre=new Timbre();
            this.sensores= new ArrayList<>();
        }

    public void addsensores(Sensor s){
            this.sensores.add(s);
    }
    public void comprobar( ){
        boolean alarmaActivada=false;
            for (Sensor s:sensores){
                if(s.isActivo()){
                    alarmaActivada = true;
                    System.out.println("zona conflicto:"+ s.getZona());
                }
            }
            if(alarmaActivada){
                timbre.hacesonar();
            }else {
                System.out.println("todo ok");
            }

    }


}
