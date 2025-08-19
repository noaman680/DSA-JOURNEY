package KickOff.Simple;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Radius : ");
        float r = sc.nextFloat();
         area(r);
    }
    public static void area(Float r){
        double perimeter =  2 * Math.PI * r;
        System.out.println("Area if Circle are : " + perimeter);
    }
    
}
