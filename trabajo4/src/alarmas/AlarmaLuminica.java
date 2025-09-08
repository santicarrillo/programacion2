package alarmas;

public class AlarmaLuminica extends Alarma{

    private Luz luz;

    public AlarmaLuminica (){
        super();
        this.luz= new Luz();
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
            luz.Encender();
        }else {
            System.out.println("todo ok");
        }
    }








}
