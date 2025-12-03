import java.util.Arrays;

class permutation1 {
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));

    }
    public static int[] buildArray(int[] nums){
        int ArrayLength =  nums.length;
        int[] ans = new int[ArrayLength];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]]; 
        }
        return ans;
    
    }
    
    /*public static int[] buildArray(int[] nums) {
        int n = nums.length;

        // 1. Encode the new value into each element
        // The original value nums[i] becomes the remainder (a)
        // The new value nums[nums[i]] becomes the quotient (b)
        for (int i = 0; i < n; i++) {
            // Get the original value at the target index
            int originalTargetValue = nums[nums[i]] % n;
            
            // Encode: nums[i] = a + n * b
            // a = nums[i]
            // b = originalTargetValue
            nums[i] = nums[i] + n * originalTargetValue;
        }

        // 2. Decode the new value from each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    } */
    
}
