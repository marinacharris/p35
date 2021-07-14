import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //definiendo un array de objetos
        Carro carros[] = new Carro[4];
        carros[0] = new Carro("Chevrolet", 45000000);
        carros[1] = new Carro("Nissan", 55000000);
        carros[2] = new Carro("Renault", 80000000);
        carros[3] = new Carro("Mazda", 65000000);

        for (int i=0; i<carros.length; i++){
            System.out.println(carros[i].getMarca());

        }
        for (Carro i: carros){
            System.out.println(i.getMarca());
        }
        TotalCarros resultado = new TotalCarros(carros);
        int sumaTotal = resultado.totalizar();
        System.out.println("La suma de los precios es: "+ sumaTotal);

        //Crear array List de objetos

        ArrayList<Carro> listaCarros = new ArrayList<Carro>();
        listaCarros.add(new Carro("Audi",150000000));
        listaCarros.add (new Carro("BMW", 180000000));
        for (Carro i: listaCarros){
            System.out.println(i.getMarca());
        }



    }
}
