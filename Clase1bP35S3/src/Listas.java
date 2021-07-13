import java.util.ArrayList;
import java.util.HashSet;


public class Listas {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Chevrolet");
        carros.add("Nissan");
        carros.add("Renault");
        carros.add("BMW");
        System.out.println(carros.size());
        System.out.println(carros.get(2));
        System.out.println(carros.contains("Renault"));
        System.out.println(carros.remove(3));
        for (String i: carros){
            System.out.println(i); 
        }
        HashSet<String> nombres = new HashSet<String>();
        nombres.add("Marina");
        nombres.add("Marina");
        for (String i:nombres){
            System.out.println(i);
        }





    }
}
