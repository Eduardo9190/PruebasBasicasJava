/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

/**
 *
 * @author CES
 */
public class Circulo {
    
    //Propiedades de la clase
    private double radio;
    
    //Generamos el constructor de la clase
    public Circulo () {
    }
    
    public Circulo (double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(){
        return (Math.PI * Math.pow(radio,2));
    }
    
    public double getPerimetro(){
        return 2*Math.PI*radio;
    }
}
