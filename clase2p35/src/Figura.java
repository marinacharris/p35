public class Figura {
    //constructor
    int lado;
    int ancho;
    int alto;
    float base;
    float altura;

    public Figura(int lado){
        this.lado = lado;
    }
    public Figura(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    public Figura(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    //sobre carga de métodos
    public float area(int lado){
        return lado*lado;
    }
    public float area(int ancho, int alto){
        return ancho*alto;
    }
    public float area (float base, float altura){
        return (base*altura)/2;
    }
    public static int perimetro(int lado){
        return lado*4;
    }



}
