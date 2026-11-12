package POO;


public class Puerta {
    public boolean abierta;

    public void abrir (){
        this.abierta = true;
    
    }
    public void cerrar (){
        this.abierta = false;
    }

    public String estado(){
        if (this.abierta){
            return "La puerta esta abierta";
        } else {
            return "La puerta esta cerrada";
        }
    }
    public static void main(String[] args) {
        Puerta puerta = new Puerta();
        System.out.println(puerta.estado());
        puerta.abrir();
        System.out.println(puerta.estado());
        puerta.cerrar();
        System.out.println(puerta.estado());
    }
}
