package poligonos;

public class Circulo implements Poligono{
    
    private double radio;
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Implementación de los métodos abstractos
    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
    @Override
    public double perimetro() {
        return Math.PI * 2 *radio;
    }
    // Getter & setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
