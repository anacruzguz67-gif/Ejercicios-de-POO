package POO;

public class Reproductor {
    public String cancion;
    public boolean reproduciendo;
    
    public  Reproductor(){
        this.cancion = "ninguna";
        this.reproduciendo = false;
    }
    public void reproducir (String cancion ){
        this.cancion = cancion;
        this.reproduciendo = true;
    }
    public void pausar () {
        this.cancion = cancion;
        this.reproduciendo = false;
    }
    public String estado (){
        if (reproduciendo){
            return "reproduciendo: " + cancion;
        }else{
            return "pausado: " + cancion;
        }
    }
 public static void main(String[] args) {
    Reproductor rep = new Reproductor();
    System.out.println(rep.estado());
    rep.reproducir("Come As You Are");
    System.out.println(rep.estado());
    rep.pausar();
 }
}
