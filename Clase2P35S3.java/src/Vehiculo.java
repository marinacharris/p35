public class Vehiculo {
    protected String marca;
    protected String placa;
    protected Integer precio;
    public Vehiculo(String marca, String placa, Integer precio) {
        this.marca = marca;
        this.placa = placa;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    

    
}
