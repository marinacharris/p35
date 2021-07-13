public class Camion extends Vehiculo implements CalculaCosto {
    private Integer numEjes;

    public Camion(String marca, String placa, Integer precio, Integer numEjes) {
        super(marca, placa, precio);
        this.numEjes = numEjes;
    }
    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costoFinal = this.precio + (factor * this.numEjes);
        return costoFinal;
    }
    public Integer getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(Integer numEjes) {
        this.numEjes = numEjes;
    }
    
}
