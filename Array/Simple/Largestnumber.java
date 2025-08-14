package Array;

import java.util.Arrays;

public class Largestnumber {
    public static void main(String[] args) {
        int[] arr = {50,60,12,55,66,50,43,65};
        large(arr);
    }

    //With Sort
    public static void large(int[] arr){
        Arrays.sort(arr);
        int num = arr[arr.length-1];
        System.out.println("Largest Number in array is : " + num);
    }
    
}
