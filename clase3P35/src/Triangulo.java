import prueba.Figura;

public class Triangulo extends Figura{
    private int base;
    private int altura;
    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        // TODO Auto-generated method stub
        return (this.base*this.altura)/2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    



    
}
