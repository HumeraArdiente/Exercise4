/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_exer1;

/**
 *
 * @author ardientehu_cis21035
 */
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){}
    public Rectangle(float length, float width){
         this.length = length;
         this.width = width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString(){
        return "Rectangle : length = " + length + ", width = " + width;
    }
}
