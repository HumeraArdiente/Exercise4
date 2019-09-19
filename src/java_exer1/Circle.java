/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_exer1;
import java.lang.Math;

/**
 *
 * @author ardientehu_cis21035
 */
public class Circle {
    private double radius;
    
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference(){
        return 2*(Math.PI * this.radius);
    }
    @Override
    public String toString(){
        return "Circle : " + radius;
    }
}
