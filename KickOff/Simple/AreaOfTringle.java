package KickOff.Simple;

import java.util.Scanner;

public class AreaOfTringle {
    // It is also Are of Isosceles
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Base : ");
        float b = sc.nextFloat();
        System.out.println("Enter Height  : ");
        float h = sc.nextFloat();
         area(b,h);
    }
    public static void area(float b, Float h){
        float area =  (b * h)/2;
        System.out.println("Area if Circle are : " + area);
    }
    
}
