public class App {


    //empresa importa autos y camiones
    //placa, marca y precio
    //Costo = precioAuto + factorImpuesto*numeroAir ->>Autos
    //Costo = precioCamion + factorImpuesto*numeroEjes ->> Camiones
    //Agregar IVA 19 %
    public static void main(String[] args) throws Exception {

        Auto auto1 = new Auto("Nissan", "KLO556", 50000000, 4);
        System.out.println("Datos del Auto1:");
        System.out.println("Placa: "+auto1.getPlaca());
        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Número de Airbags: "+auto1.getNumAir());
        int precioFinal = (int)auto1.calcularCosto(2000)*CalculaCosto.IVA/100 + auto1.calcularCosto(2000);
        System.out.println("El precio final es: "+precioFinal);
    }
}
