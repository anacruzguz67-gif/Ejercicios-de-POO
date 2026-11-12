package POO;
public class Lampara {
    public static boolean encendida;
    
    public Lampara(){
        this.encendida = false;
    }

public static void encender(){
    encendida = true;
}
public static void apagar(){
    encendida = false;
}
public static String estado(){
    return encendida ? "encendida" : "apagada";
}
public static void main(String[] args) {
    System.out.println(Lampara.estado());
    Lampara.encender();
    System.out.println(Lampara.estado());
    Lampara.apagar();
    System.out.println(Lampara.estado());
}
}
 