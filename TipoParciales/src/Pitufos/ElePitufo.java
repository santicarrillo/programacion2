package Pitufos;

import java.util.ArrayList;
import java.util.Comparator;

import Pitufos.condiciones.Condicion;
public abstract class ElePitufo {
    public abstract double getVelocidad();
    public abstract int  getCreatividad();
    public abstract ArrayList<String> getHabilidades();
    public abstract int  ContarPitufo(Condicion c);
    public abstract ElePitufo getcopia();


}
