public class TotalCarros {
    Carro carros[];

    public TotalCarros(Carro[] carros) {
        this.carros = carros;
    }

    public int totalizar(){
        int acumulador = 0;
        for (Carro i: carros){
            acumulador +=i.getPrecio();
        }
        return acumulador;
    }
    
}
