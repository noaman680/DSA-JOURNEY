package Array.Simple;

public class Ceilingofnumber {
    public static void main(String[] args) {
     
        int[] arr = {2,5,6,8,9,13,15,16,20};
        int target = 12;

        int resultIndex = check(arr, target);
        if (resultIndex < arr.length) {
            System.out.println("      Ceiling of " + target + " is: " + arr[resultIndex]);
        } else {
            System.out.println("  Ceiling of " + target + " not found!");
        }
    }

    public static int check(int[] arr , int target ){
        int a = 0;
        int b = arr.length - 1;

        //  binary search for ceiling
        while (a <= b) {
            int mid = a + (b - a) / 2;

            if (arr[mid] == target) {
                return mid; // exact match
            } 
            if (arr[mid] < target) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }

        // a is now pointing to the smallest number greater than target (the ceiling)
        return a;
    }
}
