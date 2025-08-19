package KickOff.Simple;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Radius : ");
        float r = sc.nextFloat();
         area(r);
    }
    public static void area(float r){
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println("Area if Circle are : " + area);
    }
    /*
     * By Using Loop
     * public staic void main(String[] args){
     *      Scanner ac = new Scannre(Systm.in);
     *      while(true){
     *          System.out.print(Enter radius : );
     *          int r = sc.nexInt();
     *          if (r<=0){
     *              System.out.print("By By ....");
     *              break;
     *          }
     *          double area = Math.PI * r * r;
     *          System.out.print("Area of circle : " + area );
     *      }
     * }
     */
}
