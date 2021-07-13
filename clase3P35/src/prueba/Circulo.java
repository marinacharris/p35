package prueba;
public class Circulo extends Figura {
    //atributos
    public static final float PI = 3.1416f;

    private int radio;
    //constructor 

    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public float area(){
        return PI*this.radio*this.radio;
    }



    
}
