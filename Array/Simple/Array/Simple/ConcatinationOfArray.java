package Array.Simple;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println( "Enter Array size : ");
        int n = sc.nextInt();
        System.out.println("Enter Arrray : ");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         getConcatenation(arr);
         int[] b = getConcatenation(arr);
         System.out.println("Array are : " + Arrays.toString(b));

    }
   /*  // It is Beneficial interms of Space(Take bit less Memory) and Time(Take less time O(1)) 
    public static int[] getConcatenation(int[] nums){

        int ans [] = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
        
    }
    */
    // It is Faster than Previos one Time(O(0)) But Take bit more memory
    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2] ;
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
        
    }
    
}
