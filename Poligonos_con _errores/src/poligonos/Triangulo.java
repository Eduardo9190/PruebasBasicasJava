package poligonos;

public class Triangulo implements Poligono{
    
    private double base,altura;
    
    // Constructor

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        
    }
    // Implementación de los métodos abstractos
    @Override
    public double area() {
        return (base*altura)/2;
    }
    @Override
    public double perimetro() {
        return base+2*altura;        
    }    
    // Getters & setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
