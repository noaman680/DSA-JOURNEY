package KickOff.Simple;

import java.util.Scanner;

public class AreaOfEquilateralTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Side : ");
        float s = sc.nextFloat();
         area(s);
    }
    public static void area(Float s){
        double area =  (Math.sqrt(3)/4)*(s*s);
        System.out.println("Area if Circle are : " + area);
    }
    
}
