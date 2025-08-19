package KickOff.Simple;

import java.util.Scanner;

public class PerimeterOfEquilateralTringle {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Side : ");
        float s = sc.nextFloat();
         area(s);
    }
    public static void area(Float s){
        double perimeter =  3*s;
        System.out.println("Area if Circle are : " + perimeter);
    }
}