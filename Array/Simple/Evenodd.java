package Array.Simple;

import java.util.Arrays;

public class Evenodd {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        check(arr);
    }
/*
    // Brute Force 

    static void check(int[] arr){
        int evenCount= 0;
        int oddCount = 0;
        for (int num : arr) {
            if(num % 2==0){
                evenCount++;
            }
            else{
                oddCount++;
            } 
        }
        int[] evenNumber = new int[evenCount];
        int[] oddNumber = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int num : arr) {
            if (num%2==0){
                evenNumber[evenIndex] = num;
                evenIndex++;
            }
            else{
                oddNumber[oddIndex] = num;
                oddIndex++;
            }    
        } 
        System.out.println(" Even Number Array :" + Arrays.toString(evenNumber));
        System.out.println(" Odd Number Array : " + Arrays.toString(oddNumber));
    } */

    // Single Pass or Two Pointer
    public static void check(int[] arr){
        int left= 0;
        int right= arr.length-1;
        while (left<right) {
            while (arr[left]%2==0 && left< right) {
                left++;    
                
            }
            while (arr[right]%2 !=0 && left<right) {
                right--;
                
            }
            if(left< right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
            int firstOddIndex= 0;
            while (firstOddIndex <arr.length && arr[firstOddIndex] % 2 ==0) {
                firstOddIndex++;
                
            }

            int[] evenNumber = Arrays.copyOfRange(arr ,0,firstOddIndex );
            int[] oddNumber = Arrays.copyOfRange(arr, firstOddIndex, arr.length);
            Arrays.sort(evenNumber);
            Arrays.sort(oddNumber);

            System.out.println("Even Array : " + Arrays.toString(evenNumber));
            System.out.println(" Odd Number  : " + Arrays.toString(oddNumber));
        

    }
}