import java.util.HashMap;

public class Mapas {
    public static void main(String[] args) {
        HashMap<String,String> mapa1 = new HashMap<String,String>(); 
        mapa1.put("Antioquia","Medellín");
        mapa1.put("Atlántico","Barranquilla");
        mapa1.put("Bolívar","Cartagena");
        System.out.println(mapa1);
    }
}
