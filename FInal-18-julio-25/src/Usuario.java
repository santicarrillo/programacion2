public  class Usuario  implements Comparable<Usuario> {

   private  String nombre;
   private int añoRegistro;
   private String DireccionEmail;

    public Usuario(int añoRegistro, String direccionEmail, String nombre) {
        this.añoRegistro = añoRegistro;
        DireccionEmail = direccionEmail;
        this.nombre = nombre;
    }

    public int getAñoRegistro() {
        return añoRegistro;
    }

    public void setAñoRegistro(int añoRegistro) {
        this.añoRegistro = añoRegistro;
    }

    public String getDireccionEmail() {
        return DireccionEmail;
    }

    public void setDireccionEmail(String direccionEmail) {
        DireccionEmail = direccionEmail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public int compareTo(Usuario o) {
        int result= this.getNombre().compareTo(o.getNombre());
        if (result ==0) {
            result = this.getDireccionEmail().compareTo(o.getDireccionEmail());
        }
        return result;
    }
}
