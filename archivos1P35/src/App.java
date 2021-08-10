import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Lectura de datos (entrada)
        try {
            File archivo = new File("C:\\recursos\\nombres.txt");
            Scanner sc  = new Scanner(archivo);
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
           System.out.println("fallo en la lectura del archivo");
           System.out.println(e.getMessage());
        }
        //Escritura de datos (salida)
        String datos[] = {"Manzana", "Pera","Uva","Coco", "Banano"};
        FileWriter archivo2 = new FileWriter("frutas.txt");
        for (String i: datos){
            archivo2.write(i+"\n");
        }
        archivo2.close();
    }
}
