/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author CES
 */
public class Rectangulo {
    double lado1;
    double lado2;
    double perimetro;
    double area;

    public Rectangulo (double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public void setLado1 (double l1) {
        this.lado1 = l1;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public void setLado2 (double l2) {
        this.lado2 = l2;
    }
    
    public double getLado2(){
        return lado2;
    }

    public double getArea(){
        return lado1*lado2;
    }
    
    public double getPerimetro(){
        return lado1+lado1+lado2+lado2;
    }
    
}
