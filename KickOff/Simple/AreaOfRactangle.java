package KickOff.Simple;

import java.util.Scanner;

public class AreaOfRactangle {
    // It is also Area of Parallelogram
    // Also Area of Rhombus
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Length : ");
        float l = sc.nextFloat();
        System.out.println("Enter Width : ");
        float w = sc.nextFloat();
         area(l,w);
    }
    public static void area(Float l , Float w){
        float area = l * w;
        System.out.println("Area if Circle are : " + area);
    }
}
