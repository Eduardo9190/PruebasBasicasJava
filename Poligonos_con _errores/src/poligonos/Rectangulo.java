package poligonos;

public class Rectangulo implements Poligono{
    
    private double lado1,lado2;
    //Constructor 
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Implementación de los métodos abstractos
    @Override
    public double area() {
        return lado1*lado2;
    }
    @Override
    public double perimetro() {
        return lado1*2 + lado2 *2;
    }
    // Getters & Setters

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void soy(){
        System.out.println("Hola soy un rectángulo y mis lados son: " +lado1 
                            + " , "+ lado2);
    }
}
