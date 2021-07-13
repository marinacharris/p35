package utilidades;

public class Producto {
    private String nombreProducto;
    private double cantidad;
    private double precioUnidad;
    private static double costoTotal;

    public Producto(String nombreProducto, double cantidad, double precioUnidad) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public void calculaPrecioTotal(){
        double resultado = this.precioUnidad*this.cantidad;
        costoTotal = resultado;
        System.out.println("El precio total del pedido de "+ this.nombreProducto + " es: "+resultado);
    }

    public static double getCostoTotal() {
        return costoTotal;
    }

       


    
}
