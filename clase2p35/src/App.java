public class App {
    public static void main(String[] args) throws Exception {
        //instancia class figura


        Figura cuadrado = new Figura(5);
        Figura rectangulo = new Figura(8, 10);
        Figura triangulo = new Figura(4.0f, 5.0f);
        System.out.println(Figura.perimetro(5));


        //float areaCuadrado = cuadrado.area(5);
        //float areaRectangulo = rectangulo.area(8, 10);
        //float areaTriangulo = triangulo.area(4.0f, 5.0f);
        System.out.println(cuadrado.area(5));
        System.out.println(rectangulo.area(8, 20));
        System.out.println(triangulo.area(4.0f, 8.0f));


        //instancia de la class Login
        Login marina = new Login("marinaCh");
        Login pedro = new Login("Pedro2020","458");
        marina.mostrardatos();
        pedro.mostrardatos();

        //instancia de la clase estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Castro", 22548785, "Ingenierías");
        System.out.println("Los datos del estudiante son: "+ estudiante1.getNombre()+", "+estudiante1.getApellido()+ ", "+estudiante1.getId() + ", "+estudiante1.getFacultad());
        
    }
}
