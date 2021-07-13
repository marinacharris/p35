public class Auto extends Vehiculo implements CalculaCosto{
    private Integer numAir;

    public Auto(String marca, String placa, Integer precio, Integer numAir) {
        super(marca, placa, precio);
        this.numAir = numAir;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costoFinal = this.precio + (factor * this.numAir);
        return costoFinal;
    }

    public Integer getNumAir() {
        return numAir;
    }

    public void setNumAir(Integer numAir) {
        this.numAir = numAir;
    }
    
    
}
