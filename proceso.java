public class proceso {
//Creacion de las clases 
    private String Proceso;
    private String Usuario;
    private int Nice;
    private int PR;
    public proceso(String proceso, String usuario, int nice, int pR) {
        Proceso = proceso;
        Usuario = usuario;
        Nice = nice;
        PR = pR;
    }
 //Metodos de la clase proceso   
    public String getProceso() {
        return Proceso;
    }
    public void setProceso(String proceso) {
        Proceso = proceso;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public int getNice() {
        return Nice;
    }
    public void setNice(int nice) {
        Nice = nice;
    }
    public int getPR() {
        return PR;
    }
    public void setPR(int pR) {
        PR = pR;
    }
    public String toString() {
        int pr = 120 + Nice;
        return Proceso + "," + Usuario + "," + Nice + ",PR=" + pr;
    }
}
