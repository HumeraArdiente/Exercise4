/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_exer1;
import java.util.*;
/**
 *
 * @author ardientehu_cis21035
 */
public class Java_exer1  {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double c;
        float l, w;
        System.out.println("Enter the radius for circle : ");
        c = input.nextDouble();
        System.out.println("Enter the length and width of rectangle : ");
        l = input.nextFloat();
        w = input.nextFloat();
        
        Circle circle = new Circle(c);
        Rectangle rectangle = new Rectangle(l, w);
        
        System.out.println("\n" + circle.toString());
        System.out.printf("Area : %.2f", circle.getArea());
        System.out.printf("\nCircumference : %.2f\n", circle.getCircumference());
        
        System.out.println("\n" + rectangle.toString());
        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
    }
    
}
