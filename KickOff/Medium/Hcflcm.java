package KickOff.Medium;
import java.util.*;
public class Hcflcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        HcfLcm(a, b);

    }

    public static void HcfLcm(int a ,int b){

        

    }

   /*  import java.util.Scanner;

public class HCF_LCM_Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers to find their HCF and LCM.");

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // It's good practice to close the scanner when you're done with it
        scanner.close();

        // Calculate HCF and LCM
        if (num1 > 0 && num2 > 0) {
            int hcf = findHCF(num1, num2);
            long lcm = findLCM(num1, num2, hcf);

            System.out.println("\n----------------------------------");
            System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf + " 🤝");
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Please enter positive integers.");
        }
    }

    /**
     * Calculates the HCF (Highest Common Factor) of two numbers using the Euclidean algorithm.
     * @param a The first integer.
     * @param b The second integer.
     * @return The HCF of a and b.
     
    public static int findHCF(int a, int b) {
        // The Euclidean algorithm continues until the second number (b) becomes 0.
        // The HCF is the value of the first number (a) at that point.
        while (b != 0) {
            int temp = b;
            b = a % b; // The remainder of a divided by b
            a = temp;
        }
        return a;
    }
    
    /**
     * Calculates the LCM (Lowest Common Multiple) using the formula:
     * LCM(a, b) = (|a * b|) / HCF(a, b)
     * @param a The first integer.
     * @param b The second integer.
     * @param hcf The HCF of a and b.
     * @return The LCM of a and b.
     */
    public static long findLCM(int a, int b, int hcf) {
        // We use (a / hcf) * b to prevent potential integer overflow if a*b is too large.
        // The result is cast to a long to handle cases where the LCM exceeds the max int value.
        return (long) a * (b / hcf);
    }
    */
}
}