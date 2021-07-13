import prueba.Circulo;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia clase Circulo
        Circulo circulo1 = new Circulo(10);
        //instancia clase Triangulo
        Triangulo triangulo1 = new Triangulo(10, 5);

        System.out.println(circulo1.area());
        System.out.println(triangulo1.area());

        //instancia clase gato
        Gato gato1 = new Gato();
        gato1.rugir();

        //Arreglos
        String animales[];
        animales = new String[3];
        animales[0] = "gato";
        animales[1] = "perro";
        animales[2] = "caballo";
        for (int i =0; i<=2;i++){
            System.out.println(animales[i]);
        }
        int numeros[] = {4,5,8,6,10,12,15};
        for (int i: numeros){
            System.out.println(i);
        }
        for (String ani: animales){
            System.out.println(ani);

        }
       
        



    }
}
