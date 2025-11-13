package KickOff.Medium;

import java.util.*;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check Palindrom : ");
        String inpuString  = sc.nextLine();
        String str = inpuString.toLowerCase().replaceAll("a-zA-Z0-9", " ");
        if (check(str)){
            System.out.println(inpuString + " String is Palindrom");
        }
        else{
            System.out.println(inpuString + " String is not Palindrom ");                                                            
        }
        sc.close();
    }

    public static boolean check(String str ){
        int left = 0;
        int right = str.length()-1;
        while (left<right) {
            if(str.charAt(left) == str.charAt(right)){
                return true;
            }
            left++;
            right--;        
        }
        return false;


    }

} 
