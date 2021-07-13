package principal;
import utilidades.*;
//import utilidades.Descuento;
public class App {
    public static void main(String[] args) throws Exception {
        //crear instancia de la clase Producto.
        Producto manzanas = new Producto("Manzana", 25 , 1500);
        manzanas.calculaPrecioTotal();
        //Crear instancia de la clase Descuento
        Descuento descuento1 = new Descuento(10);
        System.out.println(descuento1.calcularDescuento());

    }
}
