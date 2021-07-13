package utilidades;


public class Descuento {
    private int descuento;

    public Descuento(int descuento) {
        this.descuento = descuento;
    }
    
    public double calcularDescuento(){
        return descuento *Producto.getCostoTotal()/100;
    }
}
