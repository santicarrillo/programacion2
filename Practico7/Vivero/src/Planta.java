import java.util.ArrayList;

public class Planta {
    private String nombreCientifico,familia,clase,tipoDeplata,ClaseSuperior;
    private int sol,riego;
    private ArrayList<String>nombreVulgar;
    private boolean isInterior;


    public Planta(String clase, String familia, String nombreCientifico,
                  ArrayList<String> nombreVulgar, String tipoDeplata,int sol,int riego,
                  boolean isInterior,String ClaseSuperior) {
        this.clase = clase;
        this.familia = familia;
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = new ArrayList<>();
        this.tipoDeplata = tipoDeplata;
        this.sol = controlEscala(sol);
        this.riego = controlEscala(riego);
        this.isInterior = isInterior;
        this.ClaseSuperior = ClaseSuperior;
    }

    public void addnombrevulgar(String nv){
        this.nombreVulgar.add(nv);
    }

    public void deletenombreVulgar(String nombreVulgar){
        this.nombreVulgar.remove(nombreVulgar);
    }
    // getterAndSetter
    public ArrayList<String> getnombreVulgar() {
      ArrayList<String>  copianombreVulgar= new ArrayList<>();
        copianombreVulgar.addAll(nombreVulgar);
        return copianombreVulgar;
    }
    public String getClase() {return clase;}
    public void setClase(String clase) {this.clase = clase;}
    public String getFamilia() {return familia;}
    public void setFamilia(String familia) {this.familia = familia;}
    public String getNombreCientifico() {return nombreCientifico;}
    public void setNombreCientifico(String nombreCientifico) {this.nombreCientifico = nombreCientifico;}
    public String getTipoDeplata() {return tipoDeplata;}
    public boolean getInterior() { return isInterior;}
    public String getClaseSuperior() {return ClaseSuperior  ;}

    public int getSol() {
        return sol;
    }
    public int getriego() {
        return riego;
    }

    // metodos
    public int controlEscala(int nro){
      try {
          if (nro>=1 && nro<=10){
              return nro;
          }
      }catch (Exception e){
          System.out.printf("Erro: %d%n", nro);
      }
      return nro;
    }


    }
